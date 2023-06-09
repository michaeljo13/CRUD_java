/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mvcView;

import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import mvcController.ControllerAnggota;

/**
 *
 * @author tiara
 */
public class FormAnggota extends javax.swing.JFrame {

    /**
     * Creates new form FormAnggota
     */
    public FormAnggota() {
        initComponents();
        ctAnggota = new ControllerAnggota(this);
        ctAnggota.isiTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdAnggota = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtNoHp = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        clndrTglRegistrasi = new com.toedter.calendar.JDateChooser();
        btnSimpanDiAnggota = new javax.swing.JButton();
        btnEditDiAnggota = new javax.swing.JButton();
        btnResetDiAnggota = new javax.swing.JButton();
        btnHapusDiAnggota = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPencarianDiAnggota = new javax.swing.JTextField();
        btnCariDiAnggota = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDataAnggota = new javax.swing.JTable();
        btnDaftarBuku = new javax.swing.JLabel();
        btnHistoryPeminjaman = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        jLabel1.setText("Anggota Perpustakaan");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID Anggota");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("No HP");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Alamat");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Tanggal Registrasi");

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        btnSimpanDiAnggota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSimpanDiAnggota.setText("Simpan");
        btnSimpanDiAnggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpanDiAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanDiAnggotaMouseClicked(evt);
            }
        });
        btnSimpanDiAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanDiAnggotaActionPerformed(evt);
            }
        });

        btnEditDiAnggota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEditDiAnggota.setText("Edit");
        btnEditDiAnggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditDiAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDiAnggotaActionPerformed(evt);
            }
        });

        btnResetDiAnggota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnResetDiAnggota.setText("Reset");
        btnResetDiAnggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetDiAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDiAnggotaActionPerformed(evt);
            }
        });

        btnHapusDiAnggota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHapusDiAnggota.setText("Hapus");
        btnHapusDiAnggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusDiAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDiAnggotaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Pencarian");

        txtPencarianDiAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPencarianDiAnggotaActionPerformed(evt);
            }
        });

        btnCariDiAnggota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCariDiAnggota.setText("Cari");
        btnCariDiAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariDiAnggotaActionPerformed(evt);
            }
        });

        tblDataAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDataAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataAnggotaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDataAnggota);

        btnDaftarBuku.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDaftarBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-book50.png"))); // NOI18N
        btnDaftarBuku.setText("  Daftar Buku");
        btnDaftarBuku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDaftarBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDaftarBukuMouseClicked(evt);
            }
        });

        btnHistoryPeminjaman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHistoryPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/history50.png"))); // NOI18N
        btnHistoryPeminjaman.setText("  History Peminjaman");
        btnHistoryPeminjaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistoryPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistoryPeminjamanMouseClicked(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(475, 475, 475))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHistoryPeminjaman)
                                    .addComponent(btnDaftarBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnLogOut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clndrTglRegistrasi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCariDiAnggota, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSimpanDiAnggota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditDiAnggota)
                        .addGap(18, 18, 18)
                        .addComponent(btnResetDiAnggota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapusDiAnggota)
                        .addGap(205, 205, 205)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPencarianDiAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 203, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIdAnggota)
                                    .addComponent(txtNama)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNoHp)
                                    .addComponent(txtEmail))))
                        .addGap(678, 678, 678))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(clndrTglRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPencarianDiAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(btnCariDiAnggota)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpanDiAnggota)
                            .addComponent(btnEditDiAnggota)
                            .addComponent(btnResetDiAnggota)
                            .addComponent(btnHapusDiAnggota)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnHistoryPeminjaman)
                        .addGap(39, 39, 39)
                        .addComponent(btnDaftarBuku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogOut)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistoryPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoryPeminjamanMouseClicked
        FormHistoryPeminjaman frmHistoryPeminjaman = new FormHistoryPeminjaman();
        frmHistoryPeminjaman.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHistoryPeminjamanMouseClicked

    private void btnDaftarBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarBukuMouseClicked
        FormBuku frmBuku = new FormBuku();
        frmBuku.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDaftarBukuMouseClicked

    private void tblDataAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataAnggotaMouseClicked
        int row = tblDataAnggota.getSelectedRow();
        ctAnggota.isiField(row);
    }//GEN-LAST:event_tblDataAnggotaMouseClicked

    private void btnCariDiAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariDiAnggotaActionPerformed
        ctAnggota.search();
        ctAnggota.reset();
    }//GEN-LAST:event_btnCariDiAnggotaActionPerformed

    private void txtPencarianDiAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPencarianDiAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPencarianDiAnggotaActionPerformed

    private void btnHapusDiAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDiAnggotaActionPerformed
        ctAnggota.delete();
        ctAnggota.isiTable();
        ctAnggota.reset();
    }//GEN-LAST:event_btnHapusDiAnggotaActionPerformed

    private void btnResetDiAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDiAnggotaActionPerformed
        ctAnggota.reset();
    }//GEN-LAST:event_btnResetDiAnggotaActionPerformed

    private void btnEditDiAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDiAnggotaActionPerformed
        ctAnggota.update();
        ctAnggota.isiTable();
        ctAnggota.reset();
    }//GEN-LAST:event_btnEditDiAnggotaActionPerformed

    private void btnSimpanDiAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanDiAnggotaActionPerformed
        ctAnggota.insert();
        ctAnggota.isiTable();
        ctAnggota.reset();
    }//GEN-LAST:event_btnSimpanDiAnggotaActionPerformed

    private void btnSimpanDiAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanDiAnggotaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanDiAnggotaMouseClicked

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        FormLogin frmLogin = new FormLogin();
        frmLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariDiAnggota;
    private javax.swing.JLabel btnDaftarBuku;
    private javax.swing.JButton btnEditDiAnggota;
    private javax.swing.JButton btnHapusDiAnggota;
    private javax.swing.JLabel btnHistoryPeminjaman;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnResetDiAnggota;
    private javax.swing.JButton btnSimpanDiAnggota;
    private com.toedter.calendar.JDateChooser clndrTglRegistrasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDataAnggota;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoHp;
    private javax.swing.JTextField txtPencarianDiAnggota;
    // End of variables declaration//GEN-END:variables
    ControllerAnggota ctAnggota;

    public JTable getTabelData() {
        return tblDataAnggota;
    }
    
    public JTextField gettxtIdAnggota(){
        return txtIdAnggota;
    }
    
    public JTextField gettxtNama(){
        return txtNama;
    }
    
    public JTextField gettxtNo_hp(){
        return txtNoHp;
    }
    
    public JTextField gettxtEmail(){
        return txtEmail;
    }
    
    public JTextArea gettxtAlamat(){
        return txtAlamat;
    }
    
    public JDateChooser gettxtTgl_registrasi(){
    return clndrTglRegistrasi;
    }

    public JTextField gettxtCariNama() {
        return txtPencarianDiAnggota;
    }
}
