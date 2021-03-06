/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sewa.program;

import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class sewa extends javax.swing.JFrame {
    
    private void kosongkan_form() {
        txtID.setEditable(true);
        txtID.setText(null);
        txtJudulbuku.setText(null);
        txtTanggalHK.setText(null);
        txtTanggalK.setText(null);
        txtDenda.setText(null);
        txtBiayaSewa.setText(null);
        txtPinjam.setText(null);
    }
    
    private void tampilkan_data() {
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Judul Buku");
        model.addColumn("Tanggal Pinjam");
        model.addColumn("Tanggal Harus Kembali");
        model.addColumn("Tanggal Kembali");
        model.addColumn("Denda");
        model.addColumn("Biaya Sewa");
        
        try{
            String sql = "SELECT * FROM sewa";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
            }
            tabelSewa.setModel(model);
                    
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    /**
     * Creates new form sewa
     */
    public sewa() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtJudulbuku = new javax.swing.JTextField();
        txtPinjam = new javax.swing.JTextField();
        txtTanggalHK = new javax.swing.JTextField();
        txtTanggalK = new javax.swing.JTextField();
        txtDenda = new javax.swing.JTextField();
        txtBiayaSewa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSewa = new javax.swing.JTable();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penyewaan Buku");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Penyewaan Buku");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 0, 178, 51));

        jLabel2.setText("ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 69, 141, 20));

        jLabel3.setText("Judul Buku :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 100, 141, 20));

        jLabel4.setText("Tanggal Harus Kembali :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 162, 141, 20));

        jLabel5.setText("Tanggal Kembali :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 193, 141, 20));

        jLabel6.setText("Denda :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 226, 141, 20));

        jLabel7.setText("Biaya Sewa :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 257, 141, 20));

        jLabel8.setText("Tanggal Pinjam :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 131, 141, 20));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 69, 398, -1));

        txtJudulbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulbukuActionPerformed(evt);
            }
        });
        getContentPane().add(txtJudulbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 100, 398, -1));

        txtPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinjamActionPerformed(evt);
            }
        });
        getContentPane().add(txtPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 131, 398, -1));
        getContentPane().add(txtTanggalHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 162, 398, -1));
        getContentPane().add(txtTanggalK, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 193, 398, -1));
        getContentPane().add(txtDenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 226, 398, -1));

        txtBiayaSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBiayaSewaActionPerformed(evt);
            }
        });
        getContentPane().add(txtBiayaSewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 257, 398, -1));

        tabelSewa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tabelSewa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelSewaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelSewa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 371, 972, 142));

        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(tbSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 322, 170, -1));

        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });
        getContentPane().add(tbEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 322, 170, -1));

        tbDelete.setText("Delete");
        tbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(tbDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 322, 170, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtJudulbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulbukuActionPerformed

    private void txtBiayaSewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBiayaSewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBiayaSewaActionPerformed

    private void tbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDeleteActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "Delete from sewa where ID='"+txtID.getText()+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil diHapus");
        }catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_tbDeleteActionPerformed

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE sewa SET ID='"+txtID.getText()+"',Judul Buku='"+txtJudulbuku.getText()+"',Tanggal Pinjam='"+txtPinjam.getText()+"',Tanggal Harus Kembali='"+txtTanggalHK.getText()+"',Tanggal Kembali='"+txtTanggalK.getText()+"',Denda='"+txtDenda.getText()+"',Biaya Sewa='"+txtBiayaSewa.getText()+"' WHERE ID='"+txtID.getText()+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
        }catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_tbEditActionPerformed

    private void txtPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinjamActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        // TODO add your handling code here:
       try{
           String sql = "INSERT INTO sewa VALUES ('"+txtID.getText()+"','"+txtJudulbuku.getText()+"','"+txtPinjam.getText()+"','"+txtTanggalHK.getText()+"','"+txtTanggalK.getText()+"','"+txtDenda.getText()+"','"+txtBiayaSewa.getText()+"')";
           java.sql.Connection conn = (Connection)Konfig.configDB();
           java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
           pstm.execute();
           JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
           tampilkan_data();
           kosongkan_form();
       }catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tabelSewaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSewaMouseClicked
        // TODO add your handling code here:
        int baris = tabelSewa.rowAtPoint(evt.getPoint());
        String ID = tabelSewa.getValueAt(baris, 0).toString();
        txtID.setText(ID);
        
        String Judulbuku = tabelSewa.getValueAt(baris, 1).toString();
        txtJudulbuku.setText(Judulbuku);
        
        String Pinjam = tabelSewa.getValueAt(baris, 2).toString();
        txtPinjam.setText(Pinjam);
        
        String TanggalHK = tabelSewa.getValueAt(baris, 3).toString();
        txtTanggalHK.setText(TanggalHK);
        
        String TanggalK = tabelSewa.getValueAt(baris, 4).toString();
        txtTanggalK.setText(TanggalK);
        
        String Denda = tabelSewa.getValueAt(baris, 5).toString();
        txtDenda.setText(Denda);
        
        String BiayaSewa = tabelSewa.getValueAt(baris, 6).toString();
        txtBiayaSewa.setText(BiayaSewa);
        
    }//GEN-LAST:event_tabelSewaMouseClicked

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
            java.util.logging.Logger.getLogger(sewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sewa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelSewa;
    private javax.swing.JButton tbDelete;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JTextField txtBiayaSewa;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJudulbuku;
    private javax.swing.JTextField txtPinjam;
    private javax.swing.JTextField txtTanggalHK;
    private javax.swing.JTextField txtTanggalK;
    // End of variables declaration//GEN-END:variables
}
