package edu.pau.hsqldbproject;

import java.sql.*;

/**
 *
 * @author Şevket Umut ÇAKIR
 */
public class HSQLDBProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBHandler dbh = null;//DBHandler class to help database operations
        Connection connection = null;//Pure Connection class

        try {
            /*
             * Connect and use DBHandler class methods. DBHandler is a wrapper class for JDBC classes
             * Print all data in the table
             */
            String sql = "SELECT * FROM Employee";
            String connectionString = "jdbc:hsqldb:file:db/employeedb";

            dbh = new DBHandler(connectionString);
            dbh.executeQuery(sql);
            dbh.printResultSet();
            //Randomly update department and title of the dummy entry
            sql = "UPDATE Employee SET Department='" + Math.random() + "',Title='" + Math.random() + "' WHERE Id=21";
            int rowCount = dbh.executeNonQuery(sql);
            System.out.printf("%d row(s) affected\n", rowCount);

            /*
             * Use Connection, Statement, ResultSet classes(alternative, jdbc way)
             * Write names of employees
             */
            connection = DriverManager.getConnection("jdbc:hsqldb:file:db/employeedb");//Connect to database
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);//Create statement to obtain scrollable ResultSet
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");//Make the query
            while (rs.next()) {//Print names in normal order
                System.out.println(rs.getObject("FirstName"));
            }
            while (rs.previous()) {//Print names in reverse order
                System.out.println(rs.getObject("FirstName"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (dbh != null) {
                    dbh.close();
                }
            } catch (SQLException e) {
                System.out.println("Can't close DBHandler object\nReason:" + e.getMessage());
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Can't close Connection object\nReason:" + e.getMessage());
            }
        }

    }

}
