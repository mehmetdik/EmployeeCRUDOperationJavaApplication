/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.pau.hsqldbproject;

import java.sql.Connection;
import java.sql.ResultSet;


/**
 *
 * @author lynxar
 */
public class NewJFrame extends javax.swing.JFrame {
        DBHandler dbh = null;//DBHandler class to help database operations
        Connection connection = null;//Pure Connection class
        static private ResultSet rs;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            String sql="SELECT * FROM Employee";
            String connectionString = "jdbc:hsqldb:file:db/employeedb";
            dbh=new DBHandler(connectionString);
            ResultSet rs=dbh.executeQuery(sql);
           // rs.first();
            list.append("ID"+"\t");
            list.append("FIRSTNAME"+"\t");
            list.append("LASTNAME"+"\t");
            list.append("EMAIL"+"\t\t\t\t");
            list.append("DEPARTMENT"+"\t\t");
            list.append("TITLE\n"+"*************************************************************************************************************************************************************************************************\n");
            
            while (rs.next()) {
                 list.append(rs.getString("ID")+"\t");
            list.append(rs.getString("FIRSTNAME")+"\t");
            list.append(rs.getString("LASTNAME")+"\t");
            list.append(rs.getString("EMAIL")+"\t\t\t");
            list.append(rs.getString("DEPARTMENT")+"\t\t");
            list.append(rs.getString("TITLE")+"\n");
                
                
            }
                    
            
        } catch (Exception e) {
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        list.setEditable(false);
        list.setColumns(20);
        list.setRows(5);
        list.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea list;
    // End of variables declaration//GEN-END:variables
}
