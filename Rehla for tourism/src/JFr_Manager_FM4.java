
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ossama
 */
public class JFr_Manager_FM4 extends javax.swing.JFrame {

    /**
     * Creates new form JFrManager3
     */
    public JFr_Manager_FM4() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        /////////
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select * from report");
            DefaultTableModel dm = new DefaultTableModel();
            ResultSet set = stmt.executeQuery();
            dm.addColumn("Reports");
            while (set.next()) {
                String[] r = {set.getString(1)};
                dm.addRow(r);
            }
            jTReports.setModel(dm);
            jTextAReport.setText("");
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
        ///////////
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select nat_id ,name ,phone ,country ,city from person");
            DefaultTableModel dm = new DefaultTableModel();
            ResultSet set = stmt.executeQuery();
            dm.addColumn("National ID");
            dm.addColumn("Name");
            dm.addColumn("Phone");
            dm.addColumn("Country");
            dm.addColumn("City");
            while (set.next()) {
                String[] r = {set.getString(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5)};
                dm.addRow(r);
            }
            jTInformation.setModel(dm);
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
        /////////////
        
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
        jTInformation = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTReports = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAReport = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButDelete1 = new javax.swing.JButton();
        jButDelete3 = new javax.swing.JButton();
        jButDelete4 = new javax.swing.JButton();
        jButDelete5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTInformation.setBackground(new java.awt.Color(204, 255, 204));
        jTInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone", "Country", "City"
            }
        ));
        jTInformation.setRowHeight(30);
        jTInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTInformationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTInformation);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 990, 150));

        jTReports.setBackground(new java.awt.Color(204, 255, 204));
        jTReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Reports"
            }
        ));
        jTReports.setRowHeight(30);
        jTReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTReportsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTReports);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Reports: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTextAReport.setColumns(20);
        jTextAReport.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAReport.setRows(5);
        jScrollPane3.setViewportView(jTextAReport);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 390, 280));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Registration information:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 520, 38));

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/reply.png"))); // NOI18N
        jButton4.setText(" Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 750, 120, 40));

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/home.png"))); // NOI18N
        jButton3.setText("Main menu ");
        jButton3.setActionCommand("");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 750, 174, 40));

        jButDelete1.setBackground(new java.awt.Color(204, 255, 204));
        jButDelete1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete (1).png"))); // NOI18N
        jButDelete1.setText("Delete");
        jButDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDelete1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 45));

        jButDelete3.setBackground(new java.awt.Color(204, 255, 204));
        jButDelete3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButDelete3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete (1).png"))); // NOI18N
        jButDelete3.setText("Delete All");
        jButDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDelete3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButDelete3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 650, 140, 45));

        jButDelete4.setBackground(new java.awt.Color(204, 255, 204));
        jButDelete4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButDelete4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete (1).png"))); // NOI18N
        jButDelete4.setText("Delete");
        jButDelete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDelete4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButDelete4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 120, 45));

        jButDelete5.setBackground(new java.awt.Color(204, 255, 204));
        jButDelete5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButDelete5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete (1).png"))); // NOI18N
        jButDelete5.setText("Delete All");
        jButDelete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDelete5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButDelete5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, 45));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logout.png"))); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 750, 120, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Screenshot (58).png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 1080, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        JFr_Manager_FM3 m2 = new JFr_Manager_FM3();
        m2.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        JFr_Main_F1 f2 = new JFr_Main_F1();
        f2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTReportsMouseClicked
        // TODO add your handling code here:
        int row_num = jTReports.getSelectedRow();
        String city = jTReports.getValueAt(row_num, 0).toString();
        jTextAReport.setText(city);
    }//GEN-LAST:event_jTReportsMouseClicked

    private void jTInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTInformationMouseClicked
        // TODO add your handling code here:
        int row_num = jTReports.getSelectedRow();
        String id = jTReports.getValueAt(row_num, 0).toString();
    }//GEN-LAST:event_jTInformationMouseClicked

    private void jButDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDelete1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("delete from report where text = ?");
            int row_num = jTReports.getSelectedRow();
            String A_room = jTReports.getValueAt(row_num, 0).toString();
            stmt.setString(1, A_room);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete success");
            jTextAReport.setText("");
        } catch (Exception e) {
            System.out.println("Erorr " + e);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select * from report");
            DefaultTableModel dm = new DefaultTableModel();
            ResultSet set = stmt.executeQuery();
            dm.addColumn("Reports");
            while (set.next()) {
                String[] r = {set.getString(1)};
                dm.addRow(r);
            }
            jTReports.setModel(dm);
            jTextAReport.setText("");
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_jButDelete1ActionPerformed

    private void jButDelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDelete3ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("delete from person where nat_id");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete success");
        } catch (Exception e) {
            System.out.println("Erorr " + e);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select nat_id ,name ,phone ,country ,city from person");
            DefaultTableModel dm = new DefaultTableModel();
            ResultSet set = stmt.executeQuery();
            dm.addColumn("National ID");
            dm.addColumn("Name");
            dm.addColumn("Phone");
            dm.addColumn("Country");
            dm.addColumn("City");
            while (set.next()) {
                String[] r = {set.getString(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5)};
                dm.addRow(r);
            }
            jTInformation.setModel(dm);
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_jButDelete3ActionPerformed

    private void jButDelete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDelete4ActionPerformed
        // TODO add your handling code here:
              try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("delete from person where nat_id = ?");
            int row_num = jTInformation.getSelectedRow();
            String id = jTInformation.getValueAt(row_num, 0).toString();
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete success");
        } catch (Exception e) {
            System.out.println("Erorr " + e);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select nat_id ,name ,phone ,country ,city from person");
            DefaultTableModel dm = new DefaultTableModel();
            ResultSet set = stmt.executeQuery();
            dm.addColumn("National ID");
            dm.addColumn("Name");
            dm.addColumn("Phone");
            dm.addColumn("Country");
            dm.addColumn("City");
            while (set.next()) {
                String[] r = {set.getString(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5)};
                dm.addRow(r);
            }
            jTInformation.setModel(dm);
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_jButDelete4ActionPerformed

    private void jButDelete5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDelete5ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("delete from report");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete success");
            jTextAReport.setText("");
        } catch (Exception e) {
            System.out.println("Erorr " + e);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select * from report");
            DefaultTableModel dm = new DefaultTableModel();
            ResultSet set = stmt.executeQuery();
            dm.addColumn("Reports");
            while (set.next()) {
                String[] r = {set.getString(1)};
                dm.addRow(r);
            }
            jTReports.setModel(dm);
            jTextAReport.setText("");
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_jButDelete5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFr_Manager_FM4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFr_Manager_FM4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFr_Manager_FM4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFr_Manager_FM4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFr_Manager_FM4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButDelete1;
    private javax.swing.JButton jButDelete3;
    private javax.swing.JButton jButDelete4;
    private javax.swing.JButton jButDelete5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTInformation;
    private javax.swing.JTable jTReports;
    private javax.swing.JTextArea jTextAReport;
    // End of variables declaration//GEN-END:variables
}
