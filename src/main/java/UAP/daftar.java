/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAP;

import UAP.koneksi;
import UAP.homeUser;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class daftar extends javax.swing.JFrame {
    

    /**
     * Creates new form daftar
     */
    

    public daftar() {
        initComponents();
        setLocationRelativeTo(this);
        erorLabel.setVisible(false);
        daftarPassField.setBackground(new java.awt.Color(0,0,0,1));
        daftarnoIndukField.setBackground(new java.awt.Color(0,0,0,1));
        namaDaftarfield.setBackground(new java.awt.Color(0,0,0,1));
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
        daftarDaftarButton = new javax.swing.JButton();
        daftarPassField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        daftarnoIndukField = new javax.swing.JTextField();
        masukDaftar = new javax.swing.JButton();
        namaDaftarfield = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        erorLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(665, 418));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        daftarDaftarButton.setBackground(new java.awt.Color(0, 0, 0));
        daftarDaftarButton.setFont(new java.awt.Font("Optimus", 1, 14)); // NOI18N
        daftarDaftarButton.setForeground(new java.awt.Color(204, 204, 0));
        daftarDaftarButton.setText("DAFTAR");
        daftarDaftarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        daftarDaftarButton.setPreferredSize(new java.awt.Dimension(75, 23));
        daftarDaftarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarDaftarButtonMouseClicked(evt);
            }
        });
        daftarDaftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarDaftarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(daftarDaftarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 120, 30));

        daftarPassField.setFont(new java.awt.Font("Square721 BT", 0, 15)); // NOI18N
        daftarPassField.setBorder(null);
        jPanel1.add(daftarPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 260, -1));

        jLabel4.setFont(new java.awt.Font("Square721 BT", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("University", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("SELAMAT MENDAFTAR");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Square721 BT", 1, 18)); // NOI18N
        jLabel5.setText("No Induk");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Square721 BT", 1, 18)); // NOI18N
        jLabel7.setText("Nama");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        daftarnoIndukField.setFont(new java.awt.Font("Square721 BT", 0, 15)); // NOI18N
        daftarnoIndukField.setBorder(null);
        daftarnoIndukField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarnoIndukFieldActionPerformed(evt);
            }
        });
        jPanel1.add(daftarnoIndukField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 260, -1));

        masukDaftar.setBackground(new java.awt.Color(204, 204, 0));
        masukDaftar.setFont(new java.awt.Font("Optimus", 0, 14)); // NOI18N
        masukDaftar.setText("MASUK");
        masukDaftar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        masukDaftar.setPreferredSize(new java.awt.Dimension(75, 23));
        masukDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukDaftarActionPerformed(evt);
            }
        });
        jPanel1.add(masukDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 120, 30));

        namaDaftarfield.setFont(new java.awt.Font("Square721 BT", 0, 15)); // NOI18N
        namaDaftarfield.setBorder(null);
        jPanel1.add(namaDaftarfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 260, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 260, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 260, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 260, 20));

        erorLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        erorLabel.setForeground(new java.awt.Color(255, 0, 0));
        erorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erorLabel.setText("pesan");
        jPanel1.add(erorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 694, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\KULIAH\\UAP\\rsz_20210109_212456.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\uap\\src\\main\\java\\UAP\\rsz_bg_awal.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daftarnoIndukFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarnoIndukFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarnoIndukFieldActionPerformed

    private void daftarDaftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarDaftarButtonActionPerformed
        // TODO add your handling code here:
        if (daftarnoIndukField.getText().equals("")||namaDaftarfield.getText().equals("")||daftarPassField.getText().equals("")){
            erorLabel.setText("*Data tidak boleh kosong!");
            erorLabel.setVisible(true);
            
        }else if(daftarDaftarButton.getText().equals("DAFTAR")){
            String no = daftarnoIndukField.getText();
            String nama = namaDaftarfield.getText();
            String pass = daftarPassField.getText();
            try{
                Statement state = (Statement) koneksi.getkoneksi().createStatement();
                state.executeUpdate("Insert into tabel_login VALUES"+"('"+no+"','"+pass+"','"+nama+"');");
                state.close();
                JOptionPane.showMessageDialog(null, "Pendaftaran Sukses");
                login l = new login();
                l.setVisible(true);
                this.dispose();
            }catch (Exception e){
                Logger.getLogger(daftar.class.getName()).log(Level.SEVERE, 
                        null, e);
                JOptionPane.showMessageDialog(null, "Pendaftaran Gagal, no induk sudah terdaftar", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pendaftaran Gagal");
        }
    }//GEN-LAST:event_daftarDaftarButtonActionPerformed

    private void masukDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukDaftarActionPerformed
        // TODO add your handling code here:
        login l =new login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_masukDaftarActionPerformed

    private void daftarDaftarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarDaftarButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_daftarDaftarButtonMouseClicked

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
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daftarDaftarButton;
    private javax.swing.JPasswordField daftarPassField;
    public javax.swing.JTextField daftarnoIndukField;
    private javax.swing.JLabel erorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton masukDaftar;
    public javax.swing.JTextField namaDaftarfield;
    // End of variables declaration//GEN-END:variables
}
