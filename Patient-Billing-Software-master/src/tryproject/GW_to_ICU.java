/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tryproject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author m17
 */
public class GW_to_ICU extends javax.swing.JFrame {
    /* my code starts here */
    String prev_GW,new_ICU,prev_bed,new_bed;
    String reg_num;
    public void get(String s) {
        reg_num = s;
    }
    /**
     * Creates new form GW_to_ICU
     */
    public GW_to_ICU() {
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
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();
        int screenWidth = dimension.width;
        int screenHeight = dimension.height;
        setSize(dimension);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon(getClass().getResource("/tryproject/bkground.jpg")));
        add(background);
        background.setLayout(new FlowLayout());
        Date date = new Date();
        jLabel6.setText(date.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        host = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pw = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pb = new javax.swing.JTextField();
        n1 = new javax.swing.JTextField();
        nb = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(525, 375));
        getContentPane().setLayout(null);

        host.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        host.setForeground(new java.awt.Color(255, 255, 0));
        host.setText("D.M.H. Hospital");
        getContentPane().add(host);
        host.setBounds(440, 70, 237, 41);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Previous Ward Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(363, 180, 190, 22);

        pw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pw.setForeground(new java.awt.Color(0, 153, 0));
        getContentPane().add(pw);
        pw.setBounds(630, 180, 120, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Previous Bed Number");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(363, 230, 190, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("New ICU Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(363, 280, 190, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("New Bed Number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(366, 330, 150, 22);

        pb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pb.setForeground(new java.awt.Color(0, 153, 0));
        getContentPane().add(pb);
        pb.setBounds(630, 230, 120, 28);

        n1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n1.setForeground(new java.awt.Color(0, 153, 0));
        getContentPane().add(n1);
        n1.setBounds(630, 280, 120, 28);

        nb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nb.setForeground(new java.awt.Color(0, 153, 0));
        getContentPane().add(nb);
        nb.setBounds(630, 330, 120, 28);

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(520, 400, 90, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 204));
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(810, 70, 360, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        prev_GW = pw.getText();
        prev_bed = pb.getText();
        new_ICU = n1.getText();
        new_bed = nb.getText();
        String d = jLabel6.getText();
        
        if (prev_GW.length() == 0 || prev_bed.length() == 0 || new_ICU.length() == 0 || new_bed.length() == 0) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Some of the fields are empty.","Warning",JOptionPane.WARNING_MESSAGE);
        } else {
            try {
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "qwerty");
            Statement s=(Statement)con.createStatement();
            s.executeUpdate("Update track SET Ward_Type ='I.C.U',Bed_No = '"+new_bed+"', Date = '"+d+"'");
            s.executeUpdate("Update bed SET Status ='vacant' where Bed_No = '"+prev_bed+"'");
            s.executeUpdate("Update bed SET Status ='occupied' where Bed_No = '"+new_bed+"'");
            JFrame frame = new JFrame();
            System.out.println("DWISA");
            JOptionPane.showMessageDialog(frame, "Entered Fields are updated");
            setVisible(false);
            new homepage().setVisible(true);
            } catch (Exception e) { 
            }
            setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel host;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField nb;
    private javax.swing.JTextField pb;
    private javax.swing.JTextField pw;
    // End of variables declaration//GEN-END:variables
}
