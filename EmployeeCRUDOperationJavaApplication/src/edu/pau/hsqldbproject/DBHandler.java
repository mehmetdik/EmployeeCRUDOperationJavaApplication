package edu.pau.hsqldbproject;

import java.sql.*;

/**
 *
 * @author Şevket Umut ÇAKIR
 */
public class DBHandler {

    private String connectionString;
    private Connection connection;
    private ResultSet rs;
    private String userName;
    private String password;

    public DBHandler() {
        connectionString = "";
    }

    public DBHandler(String connectionString) throws SQLException {
        this.connectionString = connectionString;
        this.connect();
    }

    public DBHandler(String connectionString, String userName, String password) throws SQLException {
        this.connectionString = connectionString;
        this.userName=userName;
        this.password=password;
        this.connect();
    }

    /**
     * Sets the connection string
     *
     * @param connectionString the connectionString to set
     */
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    /**
     * Connects the database specified in connectionString
     *
     * @throws SQLException
     */
    public final void connect() throws SQLException {
        connection = DriverManager.getConnection(connectionString, userName, password);
    }

    /**
     * Closes database connection
     *
     * @throws SQLException
     */
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    /**
     * Executes a SELECT query
     *
     * @param query SQL SELECT statement to query
     * @return ResultSet object containing the result set of query
     * @throws SQLException
     */
    public ResultSet executeQuery(String query) throws SQLException {
        if (connection != null) {
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
        }
        return rs;
    }

    /**
     * Execute a DELETE,INSERT or an UPDATE query
     *
     * @param sql SQL Statement to execute
     * @throws SQLException
     */
    public int executeNonQuery(String sql) throws SQLException {
        if (connection != null) {
            Statement stmt = connection.createStatement();
            return stmt.executeUpdate(sql);
        }
        return -1;
    }

    /**
     * Prints the Resultset to standart output
     */
    public void printResultSet() {
        if (rs != null) {
            try {
                ResultSetMetaData md = rs.getMetaData();
                for (int i = 1; i <= md.getColumnCount(); i++) {
                    System.out.printf("%-35s\t", md.getColumnName(i));
                }
                System.out.println();
                for (int i = 1; i <= md.getColumnCount(); i++) {
                    System.out.printf("%-35s\t", "------------------------");
                }
                System.out.println();
                while (rs.next()) {
                    for (int i = 1; i <= md.getColumnCount(); i++) {
                        System.out.printf("%-35s\t", rs.getObject(i));
                    }
                    System.out.println();
                }
            } catch (SQLException e) {
                System.out.println("SQLException occured\nError message:" + e.getMessage());
            }

        }
    }
}
