/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tryproject;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        String p="gh";
        try {
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "qwerty");
            Statement s=(Statement)con.createStatement();
            ResultSet rs;
            rs = s.executeQuery("Select * from organization");
            while(rs.next()){
                p = rs.getString("Org_Name");
            }
            
        }catch (Exception e) {
        }
        host.setText(p);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Uname = new javax.swing.JTextField();
        Passwd = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        host = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(600, 460));
        setResizable(false);
        getContentPane().setLayout(null);

        Uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnameActionPerformed(evt);
            }
        });
        getContentPane().add(Uname);
        Uname.setBounds(150, 180, 110, 20);
        getContentPane().add(Passwd);
        Passwd.setBounds(150, 210, 110, 20);

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(150, 250, 80, 23);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 210, 90, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 180, 90, 20);

        host.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        host.setText("D.M.H Hospital");
        getContentPane().add(host);
        host.setBounds(110, 20, 330, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tryproject/Medical_Symbol_314860_7.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnameActionPerformed
        
    }//GEN-LAST:event_UnameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "qwerty");
            Statement s=(Statement)con.createStatement();
            ResultSet rs;
            String uname, password,u = "abc",p = "123";
            uname = (Uname.getText()); 
            password = (Passwd.getText());
            
            rs = s.executeQuery("Select * from user where User_ID = '"+uname+"'");
            while(rs.next()){
                u = rs.getString("User_ID");
                p = rs.getString("Password");
            }
            if(uname.compareTo(u)!=0) {
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, "Invalid User ID !!","Warning",JOptionPane.WARNING_MESSAGE);
            } else {
                if (password.compareTo(p) != 0) {
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Invalid Password !!","Warning",JOptionPane.WARNING_MESSAGE);
                } else {
                    homepage obj1 = new homepage();
                    obj1.get_uname(u);
                    setVisible(false);
                    obj1.setVisible(true);
                }
            }
        }catch (Exception e) {
    }
 
        
    }//GEN-LAST:event_loginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Passwd;
    private javax.swing.JTextField Uname;
    private javax.swing.JLabel host;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
