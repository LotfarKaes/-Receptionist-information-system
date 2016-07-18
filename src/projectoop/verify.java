/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;
//import java.awt.Container;
//import java.awt.FlowLayout;

import java.sql.*;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.util.Calendar;
import java.util.GregorianCalendar;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Lotfar Kaes
// */

/*
 * Developed at Kristianstad University with Combitech AB 
 * URL: http://www.hkr.se
 */

public class verify extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    static String sql;
    private String[] args;

    /**
     *
     *
     */
    public verify() {
        initComponents();
        Currentdate();
    }

    public void Currentdate() {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        date.setText(year + "/" + (month + 1) + "/" + day);

        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        time.setText(hour + ":" + (minute) + ":" + second);

    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        knownButton = new javax.swing.JRadioButton();
        idButton = new javax.swing.JRadioButton();
        identiLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        checkLabel = new javax.swing.JLabel();
        idpass = new javax.swing.JTextField();
        combobox = new javax.swing.JComboBox();
        save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        jbutton3 = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 1044));

        buttonGroup1.add(knownButton);
        knownButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        knownButton.setForeground(new java.awt.Color(0, 204, 0));
        knownButton.setText("known");
        knownButton.setName("knownButton"); // NOI18N
        knownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knownButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(idButton);
        idButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        idButton.setForeground(new java.awt.Color(0, 204, 0));
        idButton.setText("ID / Passport");
        idButton.setName("idButton"); // NOI18N
        idButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idButtonActionPerformed(evt);
            }
        });

        identiLabel.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        identiLabel.setForeground(new java.awt.Color(255, 51, 51));
        identiLabel.setText("IDENTIFICATION");

        idLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        idLabel.setForeground(new java.awt.Color(204, 0, 204));
        idLabel.setText("ID/Passport Number");

        checkLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        checkLabel.setForeground(new java.awt.Color(102, 0, 255));
        checkLabel.setText("Checked By");

        idpass.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        idpass.setForeground(new java.awt.Color(204, 0, 204));
        idpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpassActionPerformed(evt);
            }
        });

        combobox.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        combobox.setForeground(new java.awt.Color(102, 0, 255));
        combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anna Persson", "Lars Nilsson", "Eva Sevensson" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectoop/Combitech2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Please Identify Yourself");

        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 204));
        jButton2.setText("BACK TO MAIN MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        adminButton.setBackground(new java.awt.Color(255, 255, 255));
        adminButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        adminButton.setForeground(new java.awt.Color(255, 0, 51));
        adminButton.setText("ADMINISTRATOR");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        jbutton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jbutton3.setForeground(new java.awt.Color(255, 0, 0));
        jbutton3.setText("Print Badge");
        jbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton3ActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 102, 0));
        date.setText("Date");

        time.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        time.setForeground(new java.awt.Color(0, 204, 51));
        time.setText("Time");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 51));
        jLabel4.setText("Time");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminButton)
                .addGap(646, 646, 646))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(208, 208, 208)
                                .addComponent(identiLabel)))
                        .addGap(428, 428, 428)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(knownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(229, 229, 229)
                                .addComponent(idButton)
                                .addGap(208, 208, 208))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idLabel)
                                        .addComponent(checkLabel))
                                    .addGap(80, 80, 80)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idpass, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(identiLabel))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(knownButton)
                            .addComponent(idButton))))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idpass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkLabel)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jbutton3)
                .addGap(30, 30, 30)
                .addComponent(adminButton)
                .addGap(37, 37, 37)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void knownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knownButtonActionPerformed
        idpass.setVisible(false);
        idLabel.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_knownButtonActionPerformed

    private void idButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idButtonActionPerformed
        // TODO add your handling code here:

        idpass.setVisible(true);
        idLabel.setVisible(true);
    }//GEN-LAST:event_idButtonActionPerformed

    private void idpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpassActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String idorpass = idpass.getText();
        String chby = combobox.getSelectedItem().toString();


        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/visitor_info", "root", "root");
            Statement st = con.createStatement();
            System.out.println("Connected");

          //  JOptionPane.showMessageDialog(this, "Connection succesful");


            ResultSet rss1 = st.executeQuery("select id from info");
            int k = 0;
            while (rss1.next()) {
                k = rss1.getInt("id");
            }



            sql = "insert into table2 (idtable2,pnrpassport,Check_by)values(" + "'" + k + "'" + "," + "'" + idorpass + "'" + "," + "'" + chby + "');";



            st.executeUpdate(sql);

            ResultSet rss = st.executeQuery("select * from info");
            while (rss.next()) {
                System.out.println(" name " + rss.getString("name") + " company " + rss.getString("company") + " country " + rss.getString("country"));
            }



        } catch (Exception ex) {
            System.out.println("Failed to connect." + ex);
            JOptionPane.showMessageDialog(this, "Error in connection");
        }
  JOptionPane.showMessageDialog(this, "Save");

        //close();

    }//GEN-LAST:event_saveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        welcome jj = new welcome();
        welcome.main(args);
        close();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed


        password nn = new password();
        String[] args = null;
        password.main(args);
        close();

        // TODO add your handling code here:
    }//GEN-LAST:event_adminButtonActionPerformed

    private void jbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton3ActionPerformed
        // TODO add your handling code here:

        PrinterTest test = new PrinterTest();
        String[] args = null;
        PrinterTest.main(args);

//        MessageFormat header = new MessageFormat ("Search result");
//        MessageFormat footer = new MessageFormat ("Page {0,number, integer}");
//        
//        
//        try {
//            table.print(JTable.PrintMode.NORMAL,header,footer);
//            
//        }catch  (java.awt.print.PrinterException e){
//            System.err.format("cannot print %s%n", e .getMessage());
//       
//        }
//        



    }//GEN-LAST:event_jbutton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
            
         UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
        
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new verify().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JLabel checkLabel;
    private javax.swing.JComboBox combobox;
    private javax.swing.JLabel date;
    private javax.swing.JRadioButton idButton;
    public static javax.swing.JLabel idLabel;
    private javax.swing.JLabel identiLabel;
    public static javax.swing.JTextField idpass;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbutton3;
    private javax.swing.JRadioButton knownButton;
    private javax.swing.JButton save;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
