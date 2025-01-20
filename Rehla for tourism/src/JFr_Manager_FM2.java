
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
public class JFr_Manager_FM2 extends javax.swing.JFrame {

    /**
     * Creates new form JFrManager
     */
    public JFr_Manager_FM2() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2 ,size.height/2 - getHeight()/2 );
    }
    public static String ID1;
    public static String City1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCity = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableHotel = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButinsert = new javax.swing.JButton();
        jButUpdate = new javax.swing.JButton();
        jButDelete = new javax.swing.JButton();
        jButShow = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFNameofCMN = new javax.swing.JTextField();
        jTextFNameofHMN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFRuteMN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFLocationMN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButinsert1 = new javax.swing.JButton();
        jButDelete1 = new javax.swing.JButton();
        jButShow1 = new javax.swing.JButton();
        jButUpdate2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCity.setBackground(new java.awt.Color(204, 255, 204));
        jTableCity.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTableCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Available places"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableCity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCity.setRowHeight(30);
        jTableCity.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTableCity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCityMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCity);
        if (jTableCity.getColumnModel().getColumnCount() > 0) {
            jTableCity.getColumnModel().getColumn(0).setMaxWidth(2000);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 250, 150));

        jTableHotel.setBackground(new java.awt.Color(204, 255, 204));
        jTableHotel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableHotel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTableHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hotels", "Rute", "Location", "ID"
            }
        ));
        jTableHotel.setGridColor(new java.awt.Color(102, 102, 102));
        jTableHotel.setRowHeight(30);
        jTableHotel.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTableHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHotelMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableHotel);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 990, 190));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Please Choose and Select and Update: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 520, 38));

        jButinsert.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButinsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/add (1).png"))); // NOI18N
        jButinsert.setText("Insert");
        jButinsert.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButinsertActionPerformed(evt);
            }
        });
        getContentPane().add(jButinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 98, 30));

        jButUpdate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/loop.png"))); // NOI18N
        jButUpdate.setText("Update");
        jButUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 98, 30));

        jButDelete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete (1).png"))); // NOI18N
        jButDelete.setText("Delete");
        jButDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 98, 30));

        jButShow.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/eye (1).png"))); // NOI18N
        jButShow.setText("Show Data");
        jButShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButShowActionPerformed(evt);
            }
        });
        getContentPane().add(jButShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 190, 40));

        jTextFNameofCMN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFNameofCMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFNameofCMNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFNameofCMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 250, 30));

        jTextFNameofHMN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFNameofHMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFNameofHMNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFNameofHMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 80, 30));

        jTextFRuteMN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFRuteMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFRuteMNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFRuteMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rute:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 80, 30));

        jTextFLocationMN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFLocationMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFLocationMNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFLocationMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 250, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Location:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 80, 30));

        jButinsert1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButinsert1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/add (1).png"))); // NOI18N
        jButinsert1.setText("Insert");
        jButinsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButinsert1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButinsert1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, 98, 30));

        jButDelete1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete (1).png"))); // NOI18N
        jButDelete1.setText("Delete");
        jButDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDelete1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 610, 98, 30));

        jButShow1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButShow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/eye (1).png"))); // NOI18N
        jButShow1.setText("Show Data");
        jButShow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButShow1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButShow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 610, -1, 30));

        jButUpdate2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButUpdate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/loop.png"))); // NOI18N
        jButUpdate2.setText("Update");
        jButUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButUpdate2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButUpdate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, 98, 30));

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/updating-arrows.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 750, 132, 40));

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

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Screenshot (58).png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 1080, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableCityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCityMouseClicked
        // TODO add your handling code here:
        int row_num = jTableCity.getSelectedRow();
        String city = jTableCity.getValueAt(row_num, 0).toString();
        jTextFNameofCMN.setText(city);
        City1 = jTableCity.getValueAt(row_num, 0).toString();
    }//GEN-LAST:event_jTableCityMouseClicked

    private void jButinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButinsertActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement(" insert into tourist_cities (city) values (?)");
            String name = jTextFNameofCMN.getText();
            stmt.setString(1, name);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Insertion success");
            jTextFNameofCMN.setText("");
            jButShowActionPerformed(evt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButinsertActionPerformed

    private void jButUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButUpdateActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("update tourist_cities set city =? where city =?");
            int row_num = jTableCity.getSelectedRow();
            String name = jTextFNameofCMN.getText();
            String name2 = jTableCity.getValueAt(row_num, 0).toString();
            stmt.setString(1, name);
            stmt.setString(2, name2);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Ubdate success");
            jTextFNameofCMN.setText("");
            jButShowActionPerformed(evt);
        } catch (Exception e) {
            System.out.println("Erorr " + e);
        }
    }//GEN-LAST:event_jButUpdateActionPerformed

    private void jButDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDeleteActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("delete from tourist_cities where city = ?");
            int row_num = jTableCity.getSelectedRow();
            String name = jTableCity.getValueAt(row_num, 0).toString();
            stmt.setString(1, name);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete success");
            jTextFNameofCMN.setText("");
            jButShowActionPerformed(evt);
        } catch (Exception e) {
            System.out.println("Erorr " + e);
        }
    }//GEN-LAST:event_jButDeleteActionPerformed

    private void jButShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButShowActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select * from tourist_cities");
            DefaultTableModel dm = new DefaultTableModel();
            ResultSet set = stmt.executeQuery();
            dm.addColumn("Available places");
            while (set.next()) {
                String[] r = {set.getString(1)};
                dm.addRow(r);
            }
            jTableCity.setModel(dm);
            jTextFNameofCMN.setText("");
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_jButShowActionPerformed

    private void jTextFNameofCMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFNameofCMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFNameofCMNActionPerformed

    private void jTextFNameofHMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFNameofHMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFNameofHMNActionPerformed

    private void jTextFRuteMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFRuteMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFRuteMNActionPerformed

    private void jTextFLocationMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFLocationMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFLocationMNActionPerformed

    private void jButinsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButinsert1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement(" insert into hotel (hotel_name, hotels_rate, hotels_location, city) values (?, ?, ?, ?)");
            String name = jTextFNameofHMN.getText();
            String rute = jTextFRuteMN.getText();
            String Location = jTextFLocationMN.getText();
            int row_num = jTableCity.getSelectedRow();
            String city = jTableCity.getValueAt(row_num, 0).toString();
            stmt.setString(1, name);
            stmt.setString(2, rute);
            stmt.setString(3, Location);
            stmt.setString(4, city);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Insertion success");
            jTextFNameofHMN.setText("");
            jTextFRuteMN.setText("");
            jTextFLocationMN.setText("");
            jButShow1ActionPerformed(evt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButinsert1ActionPerformed

    private void jButDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDelete1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("delete from Hotel where hotel_id = ?");
            int row_num = jTableHotel.getSelectedRow();
            String id = jTableHotel.getValueAt(row_num, 3).toString();
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete success");
            jTextFNameofCMN.setText("");
            jButShow1ActionPerformed(evt);
        } catch (Exception e) {
            System.out.println("Erorr " + e);
        }
    }//GEN-LAST:event_jButDelete1ActionPerformed

    private void jButShow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButShow1ActionPerformed
        // TODO add your handling code here:
        int row_num = jTableCity.getSelectedRow();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select hotel_name, hotels_rate, hotels_location, hotel_id from hotel where city =?");
            DefaultTableModel dm = new DefaultTableModel();
            String city = jTableCity.getValueAt(row_num, 0).toString();
            stmt.setString(1, city);
            ResultSet set = stmt.executeQuery();
            dm.addColumn("Hotels");
            dm.addColumn("Rute");
            dm.addColumn("Location");
            dm.addColumn("ID");
            while (set.next()) {
                String[] r = {set.getString(1), set.getString(2), set.getString(3), set.getString(4)};
                dm.addRow(r);
            }
            jTableHotel.setModel(dm);
            jTextFNameofHMN.setText("");
            jTextFRuteMN.setText("");
            jTextFLocationMN.setText("");
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_jButShow1ActionPerformed

    private void jButUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButUpdate2ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("update hotel set hotel_name =?, hotels_rate =?, hotels_location =? where hotel_id =?");
            int row_num = jTableHotel.getSelectedRow();
            String name = jTextFNameofHMN.getText();
            String rute = jTextFRuteMN.getText();
            String Location = jTextFLocationMN.getText();
            String id = jTableHotel.getValueAt(row_num, 3).toString();
            stmt.setString(1, name);
            stmt.setString(2, rute);
            stmt.setString(3, Location);
            stmt.setString(4, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Ubdate success");
            jTextFNameofHMN.setText("");
            jTextFRuteMN.setText("");
            jTextFLocationMN.setText("");
            jButShow1ActionPerformed(evt);
        } catch (Exception e) {
            System.out.println("Erorr " + e);
        }
    }//GEN-LAST:event_jButUpdate2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Successfully updated");
        this.setVisible(false);
        JFr_Manager_FM3 f2 = new JFr_Manager_FM3();
        f2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        JFr_Main_F1 f2 = new JFr_Main_F1();
        f2.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTableHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHotelMouseClicked
        // TODO add your handling code here:
        int row_num = jTableHotel.getSelectedRow();
        String AvailableP = jTableHotel.getValueAt(row_num, 0).toString();
        String AvailableP1 = jTableHotel.getValueAt(row_num, 1).toString();
        String AvailableP2 = jTableHotel.getValueAt(row_num, 2).toString();
        jTextFNameofHMN.setText(AvailableP);
        jTextFRuteMN.setText(AvailableP1);
        jTextFLocationMN.setText(AvailableP2);
        ID1 = jTableHotel.getValueAt(row_num, 3).toString();
    }//GEN-LAST:event_jTableHotelMouseClicked

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
            java.util.logging.Logger.getLogger(JFr_Manager_FM2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFr_Manager_FM2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFr_Manager_FM2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFr_Manager_FM2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFr_Manager_FM2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButDelete;
    private javax.swing.JButton jButDelete1;
    public static javax.swing.JButton jButShow;
    private javax.swing.JButton jButShow1;
    private javax.swing.JButton jButUpdate;
    private javax.swing.JButton jButUpdate2;
    private javax.swing.JButton jButinsert;
    private javax.swing.JButton jButinsert1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable jTableCity;
    public static javax.swing.JTable jTableHotel;
    private javax.swing.JTextField jTextFLocationMN;
    private javax.swing.JTextField jTextFNameofCMN;
    private javax.swing.JTextField jTextFNameofHMN;
    private javax.swing.JTextField jTextFRuteMN;
    // End of variables declaration//GEN-END:variables

    Object getValueAt(int row_num, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
