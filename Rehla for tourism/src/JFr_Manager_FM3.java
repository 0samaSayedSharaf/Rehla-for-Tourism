
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
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
public class JFr_Manager_FM3 extends javax.swing.JFrame {

    /**
     * Creates new form JFrManager2
     */
    public JFr_Manager_FM3() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTableRoom = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFRoomMN = new javax.swing.JTextField();
        jTextFBedMN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFViewMN = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFPriceMN = new javax.swing.JTextField();
        jButShow1 = new javax.swing.JButton();
        jButDelete1 = new javax.swing.JButton();
        jButUpdate2 = new javax.swing.JButton();
        jButinsert1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableRestaurant = new javax.swing.JTable();
        jTextFNameofREMN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFRuteofREMN = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFLocationREMN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButinsert2 = new javax.swing.JButton();
        jButDelete2 = new javax.swing.JButton();
        jButShow2 = new javax.swing.JButton();
        jButUpdate3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableRoom.setBackground(new java.awt.Color(204, 255, 204));
        jTableRoom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableRoom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTableRoom.setModel(new javax.swing.table.DefaultTableModel(
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
                "Available Rooms", "Number of beds", "The view", "price"
            }
        ));
        jTableRoom.setGridColor(new java.awt.Color(102, 102, 102));
        jTableRoom.setRowHeight(30);
        jTableRoom.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTableRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRoomMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableRoom);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 990, 150));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Please Choose and Select and Update: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 520, 38));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Available Rooms:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, 30));

        jTextFRoomMN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFRoomMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFRoomMNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFRoomMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 250, 30));

        jTextFBedMN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFBedMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFBedMNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFBedMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Number of Beds:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("The View:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 150, 30));

        jTextFViewMN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFViewMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFViewMNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFViewMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 250, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 150, 30));

        jTextFPriceMN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFPriceMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFPriceMNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFPriceMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 250, 30));

        jButShow1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButShow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/eye (1).png"))); // NOI18N
        jButShow1.setText("Show Data");
        jButShow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButShow1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButShow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, -1, 30));

        jButDelete1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete (1).png"))); // NOI18N
        jButDelete1.setText("Delete");
        jButDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDelete1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 98, 30));

        jButUpdate2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButUpdate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/loop.png"))); // NOI18N
        jButUpdate2.setText("Update");
        jButUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButUpdate2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButUpdate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 98, 30));

        jButinsert1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButinsert1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/add (1).png"))); // NOI18N
        jButinsert1.setText("Insert");
        jButinsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButinsert1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButinsert1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 98, 30));

        jTableRestaurant.setBackground(new java.awt.Color(204, 255, 204));
        jTableRestaurant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableRestaurant.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTableRestaurant.setModel(new javax.swing.table.DefaultTableModel(
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
                "Restaurant", "Rute", "Location", "ID"
            }
        ));
        jTableRestaurant.setGridColor(new java.awt.Color(102, 102, 102));
        jTableRestaurant.setRowHeight(30);
        jTableRestaurant.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTableRestaurant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRestaurantMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableRestaurant);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 990, 150));

        jTextFNameofREMN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFNameofREMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFNameofREMNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFNameofREMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 250, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 80, 30));

        jTextFRuteofREMN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFRuteofREMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFRuteofREMNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFRuteofREMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 250, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rute:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 80, 30));

        jTextFLocationREMN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFLocationREMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFLocationREMNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFLocationREMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 690, 250, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Location:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 80, 30));

        jButinsert2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButinsert2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/add (1).png"))); // NOI18N
        jButinsert2.setText("Insert");
        jButinsert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButinsert2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButinsert2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 690, 98, 30));

        jButDelete2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButDelete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/delete (1).png"))); // NOI18N
        jButDelete2.setText("Delete");
        jButDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDelete2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButDelete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 690, 98, 30));

        jButShow2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButShow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/eye (1).png"))); // NOI18N
        jButShow2.setText("Show Data");
        jButShow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButShow2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButShow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 690, -1, 30));

        jButUpdate3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButUpdate3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/loop.png"))); // NOI18N
        jButUpdate3.setText("Update");
        jButUpdate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButUpdate3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButUpdate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 690, 98, 30));

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
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/updating-arrows.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 750, 132, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Screenshot (47).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1010, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFRoomMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFRoomMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFRoomMNActionPerformed

    private void jTextFBedMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFBedMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFBedMNActionPerformed

    private void jTextFViewMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFViewMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFViewMNActionPerformed

    private void jTextFPriceMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFPriceMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFPriceMNActionPerformed

    private void jButShow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButShow1ActionPerformed
        // TODO add your handling code here:
        JFr_Manager_FM2 j = new JFr_Manager_FM2();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select available_places ,No_beds ,the_vies ,price from aservice where hotel_id =?");
            DefaultTableModel dm = new DefaultTableModel();
            stmt.setString(1, j.ID1);
            ResultSet set = stmt.executeQuery();
            dm.addColumn("Available Rooms");
            dm.addColumn("Number of Beds");
            dm.addColumn("The view");
            dm.addColumn("Price");
            while (set.next()) {
                String[] r = {set.getString(1), set.getString(2), set.getString(3), set.getString(4)};
                dm.addRow(r);
            }

            jTableRoom.setModel(dm);
            jTextFRoomMN.setText("");
            jTextFBedMN.setText("");
            jTextFViewMN.setText("");
            jTextFPriceMN.setText("");
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_jButShow1ActionPerformed

    private void jButDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDelete1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("delete from aservice where available_places = ?");
            int row_num = jTableRoom.getSelectedRow();
            String A_room = jTableRoom.getValueAt(row_num, 0).toString();
            stmt.setString(1, A_room);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete success");
            jTextFRoomMN.setText("");
            jTextFBedMN.setText("");
            jTextFViewMN.setText("");
            jTextFPriceMN.setText("");
            jButShow1ActionPerformed(evt);
        } catch (Exception e) {
            System.out.println("Erorr " + e);
        }
    }//GEN-LAST:event_jButDelete1ActionPerformed

    private void jButUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButUpdate2ActionPerformed
        // TODO add your handling code here:
        JFr_Manager_FM2 j = new JFr_Manager_FM2();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("update aservice set available_places =?, No_beds =?, the_vies =?, price =? where available_places =?");
            String room = jTextFRoomMN.getText();
            String bed = jTextFBedMN.getText();
            String view = jTextFViewMN.getText();
            String price = jTextFPriceMN.getText();
            int row_num = jTableRoom.getSelectedRow();
            String A_Room = jTableRoom.getValueAt(row_num, 0).toString();
            String N_Beds = jTableRoom.getValueAt(row_num, 1).toString();
            String View = jTableRoom.getValueAt(row_num, 2).toString();
            String pri = jTableRoom.getValueAt(row_num, 3).toString();
            stmt.setString(1, room);
            stmt.setString(2, bed);
            stmt.setString(3, view);
            stmt.setString(4, price);
            stmt.setString(5, A_Room);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Ubdate success");
            jTextFRoomMN.setText("");
            jTextFBedMN.setText("");
            jTextFViewMN.setText("");
            jTextFPriceMN.setText("");
            jButShow1ActionPerformed(evt);
        } catch (Exception e) {
            System.out.println("Erorr " + e);
        }
    }//GEN-LAST:event_jButUpdate2ActionPerformed

    private void jButinsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButinsert1ActionPerformed
        // TODO add your handling code here:
        JFr_Manager_FM2 j = new JFr_Manager_FM2();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement(" insert into aservice (available_places, No_beds, the_vies, price, hotel_id) values (?, ?, ?, ?, ?)");
            String room = jTextFRoomMN.getText();
            String bed = jTextFBedMN.getText();
            String view = jTextFViewMN.getText();
            String price = jTextFPriceMN.getText();
            stmt.setString(1, room);
            stmt.setString(2, bed);
            stmt.setString(3, view);
            stmt.setString(4, price);
            stmt.setString(5, j.ID1);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Insertion success");
            jTextFRoomMN.setText("");
            jTextFBedMN.setText("");
            jTextFViewMN.setText("");
            jTextFPriceMN.setText("");
            jButShow1ActionPerformed(evt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButinsert1ActionPerformed

    private void jTextFNameofREMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFNameofREMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFNameofREMNActionPerformed

    private void jTextFRuteofREMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFRuteofREMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFRuteofREMNActionPerformed

    private void jTextFLocationREMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFLocationREMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFLocationREMNActionPerformed

    private void jButinsert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButinsert2ActionPerformed
        // TODO add your handling code here:
        JFr_Manager_FM2 j = new JFr_Manager_FM2();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement(" insert into resturant (rest_name ,rest_rate ,resturants_location ,city) values (?, ?, ?, ?)");
            String name = jTextFNameofREMN.getText();
            String rute = jTextFRuteofREMN.getText();
            String Location = jTextFLocationREMN.getText();
            stmt.setString(1, name);
            stmt.setString(2, rute);
            stmt.setString(3, Location);
            stmt.setString(4, j.City1);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Insertion success");
            jTextFNameofREMN.setText("");
            jTextFRuteofREMN.setText("");
            jTextFLocationREMN.setText("");
            jButShow2ActionPerformed(evt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButinsert2ActionPerformed

    private void jButDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDelete2ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("delete from resturant where rest_id = ?");
            int row_num = jTableRestaurant.getSelectedRow();
            String id = jTableRestaurant.getValueAt(row_num, 3).toString();
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete success");
            jTextFNameofREMN.setText("");
            jTextFRuteofREMN.setText("");
            jTextFLocationREMN.setText("");
            jButShow2ActionPerformed(evt);
        } catch (Exception e) {
            System.out.println("Erorr " + e);
        }
    }//GEN-LAST:event_jButDelete2ActionPerformed

    private void jButShow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButShow2ActionPerformed
        // TODO add your handling code here:
        JFr_Manager_FM2 j = new JFr_Manager_FM2();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select rest_name ,rest_rate ,resturants_location, rest_id from resturant where city =?");
            DefaultTableModel dm = new DefaultTableModel();
            stmt.setString(1, j.City1);
            ResultSet set = stmt.executeQuery();
            dm.addColumn("Restaurant");
            dm.addColumn("Rate");
            dm.addColumn("Location");
            dm.addColumn("ID");
            while (set.next()) {
                String[] r = {set.getString(1), set.getString(2), set.getString(3), set.getString(4)};
                dm.addRow(r);
            }
            jTableRestaurant.setModel(dm);
            jTextFNameofREMN.setText("");
            jTextFRuteofREMN.setText("");
            jTextFLocationREMN.setText("");
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_jButShow2ActionPerformed

    private void jButUpdate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButUpdate3ActionPerformed
        // TODO add your handling code here:
        JFr_Manager_FM2 j = new JFr_Manager_FM2();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehla", "root", "root");
            PreparedStatement stmt = con.prepareStatement("update resturant set rest_name =? ,rest_rate =? ,resturants_location =? where rest_id =?");
            int row_num = jTableRestaurant.getSelectedRow();
            String name = jTextFNameofREMN.getText();
            String rute = jTextFRuteofREMN.getText();
            String Location = jTextFLocationREMN.getText();
            String id = jTableRestaurant.getValueAt(row_num, 3).toString();
            stmt.setString(1, name);
            stmt.setString(2, rute);
            stmt.setString(3, Location);
            stmt.setString(4, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Ubdate success");
            jTextFNameofREMN.setText("");
            jTextFRuteofREMN.setText("");
            jTextFLocationREMN.setText("");
            jButShow2ActionPerformed(evt);
        } catch (Exception e) {
            System.out.println("Erorr " + e);
        }
    }//GEN-LAST:event_jButUpdate3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:   
        this.setVisible(false);
        JFr_Manager_FM2 f2 = new JFr_Manager_FM2();
        f2.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Successfully updated");
        this.setVisible(false);
        JFr_Manager_FM4 m3 = new JFr_Manager_FM4();
        m3.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTableRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRoomMouseClicked
        // TODO add your handling code here:
        int row_num = jTableRoom.getSelectedRow();
        String A_Room = jTableRoom.getValueAt(row_num, 0).toString();
        String N_Beds = jTableRoom.getValueAt(row_num, 1).toString();
        String View = jTableRoom.getValueAt(row_num, 2).toString();
        String price = jTableRoom.getValueAt(row_num, 3).toString();
        jTextFRoomMN.setText(A_Room);
        jTextFBedMN.setText(N_Beds);
        jTextFViewMN.setText(View);
        jTextFPriceMN.setText(price);
    }//GEN-LAST:event_jTableRoomMouseClicked

    private void jTableRestaurantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRestaurantMouseClicked
        // TODO add your handling code here:
        int row_num = jTableRestaurant.getSelectedRow();
        String AvailableP = jTableRestaurant.getValueAt(row_num, 0).toString();
        String AvailableP1 = jTableRestaurant.getValueAt(row_num, 1).toString();
        String AvailableP2 = jTableRestaurant.getValueAt(row_num, 2).toString();
        jTextFNameofREMN.setText(AvailableP);
        jTextFRuteofREMN.setText(AvailableP1);
        jTextFLocationREMN.setText(AvailableP2);
    }//GEN-LAST:event_jTableRestaurantMouseClicked

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
            java.util.logging.Logger.getLogger(JFr_Manager_FM3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFr_Manager_FM3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFr_Manager_FM3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFr_Manager_FM3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFr_Manager_FM3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButDelete1;
    private javax.swing.JButton jButDelete2;
    private javax.swing.JButton jButShow1;
    private javax.swing.JButton jButShow2;
    private javax.swing.JButton jButUpdate2;
    private javax.swing.JButton jButUpdate3;
    private javax.swing.JButton jButinsert1;
    private javax.swing.JButton jButinsert2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableRestaurant;
    private javax.swing.JTable jTableRoom;
    private javax.swing.JTextField jTextFBedMN;
    private javax.swing.JTextField jTextFLocationREMN;
    private javax.swing.JTextField jTextFNameofREMN;
    private javax.swing.JTextField jTextFPriceMN;
    private javax.swing.JTextField jTextFRoomMN;
    private javax.swing.JTextField jTextFRuteofREMN;
    private javax.swing.JTextField jTextFViewMN;
    // End of variables declaration//GEN-END:variables
}
