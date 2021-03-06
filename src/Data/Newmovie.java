/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author NAHIM
 */
public class Newmovie extends javax.swing.JFrame {
    
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /** Creates new form Newmovie */
    public Newmovie() {
        super("Newmovie");
        initComponents();
        conn = javaconnect.ConnectDb();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 0), 12, true), "New Movie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Earnings");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Erase.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setToolTipText("Canel to main window");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField5.setToolTipText("Link for movie");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 300, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Link");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField2.setToolTipText("Movie rating");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 300, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Rating");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Add.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.setToolTipText("Add new movie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField1.setToolTipText("Enter id for new movie");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 300, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField3.setToolTipText("Total earnings");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 300, 40));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Bangla", "Chinese", "Korean", "Hindi" }));
        jComboBox1.setToolTipText("Select Language");
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 300, 42));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Language");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Release Date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField4.setToolTipText("Enter movie name");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 300, 40));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField6.setToolTipText("Release date");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 300, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("Year");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField7.setToolTipText("Movie release year");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 300, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Main ob = new Main();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String sql = "insert into newmovie(id, name, language, link, rating, year, release_date, earnings) values (?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField4.getText());
            pst.setString(3, (String) jComboBox1.getSelectedItem());
            pst.setString(4, jTextField5.getText());
            pst.setString(5, jTextField2.getText());
            pst.setString(6, jTextField7.getText());
            pst.setString(7, jTextField6.getText());
            pst.setString(8, jTextField3.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "<html><font face='Imprint MT Shadow' size='12' color='red'>Movie Added..........");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        
               char c = evt.getKeyChar();
        if(Character.isLetter(c) && !evt.isAltDown()){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(Newmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Newmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Newmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Newmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Newmovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

}
