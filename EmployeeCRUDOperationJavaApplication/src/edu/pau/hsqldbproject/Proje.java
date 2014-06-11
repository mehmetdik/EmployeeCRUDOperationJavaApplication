/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pau.hsqldbproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lynxar
 */
public class Proje extends javax.swing.JFrame {

    DBHandler dbh = null;//DBHandler class to help database operations
    static Connection connection = null;//Pure Connection class
    int say;
    ArrayList<Employee> employ = new ArrayList<Employee>();

    /**
     * Creates new form Proje
     */
    public Proje() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        dprtmn = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        combfind = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        findtext = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HSQLDB Employee Datebase");
        setBackground(new java.awt.Color(247, 239, 245));
        setForeground(new java.awt.Color(210, 78, 78));
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(36, 227, 25));
        jButton1.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jButton1.setText("Previous");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("/");

        jButton2.setBackground(new java.awt.Color(52, 226, 25));
        jButton2.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jButton2.setText("Next");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jLabel2.setText("Employee ID");

        jLabel3.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jLabel6.setText("Depatrment");

        jLabel7.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jLabel7.setText("Title");

        fname.setEditable(false);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        title.setEditable(false);

        dprtmn.setEditable(false);

        email.setEditable(false);

        lname.setEditable(false);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        id.setEditable(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(49, 30, 30));
        jLabel8.setText("Find by a property");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        combfind.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        combfind.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Find by Last Name", "Find by Department", "Find by Title" }));
        combfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combfindActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(57, 229, 31));
        jButton3.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jButton3.setText("Find");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        findtext.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        findtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findtextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combfind, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(findtext, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(findtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combfind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jButton4.setBackground(new java.awt.Color(20, 226, 18));
        jButton4.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jButton4.setText("Update entry");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(26, 235, 21));
        jButton5.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jButton5.setText("Insert new entry");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(85, 222, 57));
        jButton6.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jButton6.setText("Browse all entries");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(41, 234, 17));
        jButton7.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jButton7.setText("Delete entry");
        jButton7.setEnabled(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(21, 21, 21)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(jButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(112, 112, 112)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(id)
                                        .addComponent(fname)
                                        .addComponent(lname)
                                        .addComponent(email)
                                        .addComponent(dprtmn)
                                        .addComponent(title)))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dprtmn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (fname.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen görüntülenecek kişileri seçiniz.");
        } else {
            if (jTextField1.getText().equals("1")) {
                JOptionPane.showMessageDialog(this, "You are already at the end of the list.");

            } else {
                ArrayList<Employee> employeers = new ArrayList<Employee>();
                employeers = employ;
                say--;
                id.setText(employeers.get(say).getId());
                fname.setText(employeers.get(say).getFirstname());
                lname.setText(employeers.get(say).getLastname());
                email.setText(employeers.get(say).getEmail());
                dprtmn.setText(employeers.get(say).getDepartment());
                title.setText(employeers.get(say).getTitle());
                jTextField1.setText(String.valueOf(say + 1));
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

        ArrayList<Employee> employeers = new ArrayList<Employee>();
        employeers = employ;
        say = Integer.parseInt(jTextField1.getText());
        id.setText(employeers.get(say - 1).getId());
        fname.setText(employeers.get(say - 1).getFirstname());
        lname.setText(employeers.get(say - 1).getLastname());
        email.setText(employeers.get(say - 1).getEmail());
        dprtmn.setText(employeers.get(say - 1).getDepartment());
        title.setText(employeers.get(say - 1).getTitle());
        jTextField1.setText(String.valueOf(say));


    }//GEN-LAST:event_jTextField1ActionPerformed

    private void combfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combfindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combfindActionPerformed

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        // TODO add your handling code here:

        int sec = JOptionPane.showConfirmDialog(this, "Silmek istiyor musunuz?", "SEÇİN", JOptionPane.YES_NO_OPTION);
        if (sec == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM Employee WHERE ID=" + id.getText();
            String connectionString = "jdbc:hsqldb:file:db/employeedb";
            try {
                dbh = new DBHandler(connectionString);
                dbh.executeQuery(sql);
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_jButton7MousePressed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton7.setEnabled(true);

        ArrayList<Employee> employee = new ArrayList<Employee>();

        employee = ArrayListGenelArama();

        if (employee != null) {

            jTextField2.setText("" + employee.size());

            id.setText(employee.get(0).getId());
            fname.setText(employee.get(0).getFirstname());
            lname.setText(employee.get(0).getLastname());
            email.setText(employee.get(0).getEmail());
            dprtmn.setText(employee.get(0).getDepartment());
            title.setText(employee.get(0).getTitle());

            say = 0;
            jTextField1.setText(String.valueOf(say + 1));
            employ = employee;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if (fname.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen görüntülenecek kişileri seçiniz.");
        } else {
            if (Integer.parseInt(jTextField2.getText()) > Integer.parseInt(jTextField1.getText())) {
                ArrayList<Employee> employeers = new ArrayList<Employee>();
                employeers = employ;
                say++;
                id.setText(employeers.get(say).getId());
                fname.setText(employeers.get(say).getFirstname());
                lname.setText(employeers.get(say).getLastname());
                email.setText(employeers.get(say).getEmail());
                dprtmn.setText(employeers.get(say).getDepartment());
                title.setText(employeers.get(say).getTitle());
                jTextField1.setText(Integer.toString(Integer.parseInt(jTextField1.getText()) + 1));
                //jTextField1.setText(String.valueOf(say + 1));
            } else {
                JOptionPane.showMessageDialog(this, "You are already at the end of the list.");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        Kisi_ekleme f = new Kisi_ekleme();
        f.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton7.setEnabled(true);
        ArrayList<Employee> employee = new ArrayList<Employee>();
        if (findtext.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Boş Giremezsiniz...");
        } else {
            if (combfind.getSelectedIndex() == 0) {
                employee = ArrayListcontrl("LASTNAME", findtext.getText());

            } else if (combfind.getSelectedIndex() == 1) {
                employee = ArrayListcontrl("DEPARTMENT", findtext.getText());

            } else if (combfind.getSelectedIndex() == 2) {
                employee = ArrayListcontrl("TITLE", findtext.getText());

            }
            if (employee != null) {

                jTextField2.setText("" + employee.size());

                id.setText(employee.get(0).getId());
                fname.setText(employee.get(0).getFirstname());
                lname.setText(employee.get(0).getLastname());
                email.setText(employee.get(0).getEmail());
                dprtmn.setText(employee.get(0).getDepartment());
                title.setText(employee.get(0).getTitle());

                say = 0;
                jTextField1.setText(String.valueOf(say + 1));
                employ = employee;
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        update pr = new update();
        pr.setVisible(true);

        pr.idup.setText(id.getText());

        pr.fnameup.setText(fname.getText());

        pr.lnameup.setText(lname.getText());

        pr.emailup.setText(email.getText());

        pr.dprtmnup.setText(dprtmn.getText());

        pr.titleup.setText(title.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void findtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findtextActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

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
            java.util.logging.Logger.getLogger(Proje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proje().setVisible(true);
                jTextField1.setText("1");

                try {
                    connection = DriverManager.getConnection("jdbc:hsqldb:file:db/employeedb");//Connect to database
                    Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);//Create statement to obtain scrollable ResultSet
                    ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");//Make the query
                    int number = 0;
                    while (rs.next()) {
                        number++;
                    }
                    jTextField2.setText(Integer.toString(number));
                } catch (SQLException ex) {

                }
            }
        });

    }

    public ArrayList<Employee> ArrayListcontrl(String alan, String input) {
        ArrayList<Employee> employee = new ArrayList<Employee>();

        try {
            String connectionString = "jdbc:hsqldb:file:db/employeedb";
            String sql = "SELECT * FROM Employee WHERE " + alan + " LIKE'%" + input + "%'";

            DBHandler dbh = new DBHandler(connectionString);
            ResultSet rs = dbh.executeQuery(sql);

            while (rs.next()) {
                Employee employeer = new Employee();
                employeer.setId(rs.getString("ID"));
                employeer.setFirstname(rs.getString("FIRSTNAME"));
                employeer.setLastname(rs.getString("LASTNAME"));
                employeer.setEmail(rs.getString("EMAIL"));
                employeer.setDepartment(rs.getString("DEPARTMENT"));
                employeer.setTitle(rs.getString("TITLE"));

                employee.add(employeer);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (employee.size() == 0) {
            JOptionPane.showMessageDialog(this, "Aradığınız kayıt sistemde bulunmamaktadır.");
            return null;
        } else {
            return employee;
        }
    }

    public ArrayList<Employee> ArrayListGenelArama() {
        ArrayList<Employee> employee = new ArrayList<Employee>();

        try {
            String connectionString = "jdbc:hsqldb:file:db/employeedb";
            String sql = "SELECT * FROM Employee";

            DBHandler dbh = new DBHandler(connectionString);
            ResultSet rs = dbh.executeQuery(sql);

            while (rs.next()) {
                Employee employeer = new Employee();
                employeer.setId(rs.getString("ID"));
                employeer.setFirstname(rs.getString("FIRSTNAME"));
                employeer.setLastname(rs.getString("LASTNAME"));
                employeer.setEmail(rs.getString("EMAIL"));
                employeer.setDepartment(rs.getString("DEPARTMENT"));
                employeer.setTitle(rs.getString("TITLE"));

                employee.add(employeer);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return employee;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combfind;
    private javax.swing.JTextField dprtmn;
    private javax.swing.JTextField email;
    private javax.swing.JTextField findtext;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
