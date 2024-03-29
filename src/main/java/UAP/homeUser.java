/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAP;
import UAP.koneksi;
import UAP.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class homeUser extends javax.swing.JFrame {
    private DefaultTableModel dataTabel;
    


    /**
     * Creates new form homeUser
     */
 
    public homeUser() {
        initComponents();
        setLocationRelativeTo(this);
        tampil();
        noIndukField.setBackground(new java.awt.Color(0,0,0,1));
        alamatTA.setBackground(new java.awt.Color(0,0,0,1));
        namaField.setBackground(new java.awt.Color(0,0,0,1));
        searchField.setBackground(new java.awt.Color(0,0,0,1));
        tanggalPinjam.setBackground(new java.awt.Color(0,0,0,1));
        tanggalKembali.setBackground(new java.awt.Color(0,0,0,1));
        kelasField.setBackground(new java.awt.Color(0,0,0,1));
        kodeField.setBackground(new java.awt.Color(0,0,0,1));
        login l = new login();
        String induk = l.usernameField.getText();
        noIndukField.setText(induk);
        kelasSepuluh.setActionCommand("10");
        kelasSebelas.setActionCommand("11");
        kelasDuabelas.setActionCommand("12");
   
        
    }
    public void tampil() {
        
        dataTabel = new DefaultTableModel();
        dataTabel.addColumn("ID Buku");
        dataTabel.addColumn("Judul");
        dataTabel.addColumn("Penulis");
        dataTabel.addColumn("Kategori");
        tabelPinjambuku.setModel(dataTabel);
        try{
            Statement state = (Statement) koneksi.getkoneksi().createStatement();
            ResultSet result = state.executeQuery("select * from tabel_databuku");
            while (result.next()){
                dataTabel.addRow(new Object[]{
                    result.getString("idBuku"), result.getString("judul"), result.getString("penulis"), 
                    result.getString("kategori")}); 
            }

            tabelPinjambuku.setModel(dataTabel);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
        public void search(String key){
            dataTabel = new DefaultTableModel();
            dataTabel.addColumn("ID Buku");
            dataTabel.addColumn("Judul");
            dataTabel.addColumn("Penulis");
            dataTabel.addColumn("Kategori");
            tabelPinjambuku.setModel(dataTabel);
        try{
            Statement state = (Statement) koneksi.getkoneksi().createStatement();
            dataTabel.getDataVector().removeAllElements();
            
            ResultSet result =state.executeQuery("SELECT * from tabel_databuku WHERE idBuku LIKE '%"+key+"%' OR judul LIKE '%"+key+"%' OR penulis LIKE '%"+key+"%' OR kategori LIKE '%"+key+"%'");  
            while(result.next()){
                Object[] data={
                    result.getString("idBuku"),
                    result.getString("judul"),
                    result.getString("penulis"),
                    result.getString("kategori"),     
                };
               dataTabel.addRow(data);
            }                
        } catch (Exception ex) { 
            System.out.println(ex.getMessage());
        }
    }       
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelPinjambuku = new javax.swing.JTable();
        pinjamButton = new javax.swing.JButton();
        keluarButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        alamatTA = new javax.swing.JTextArea();
        namaField = new javax.swing.JTextField();
        noIndukField = new javax.swing.JTextField();
        searchField = new javax.swing.JTextField();
        tanggalPinjam = new datechooser.beans.DateChooserCombo();
        jLabel2 = new javax.swing.JLabel();
        kelasSepuluh = new javax.swing.JRadioButton();
        kelasDuabelas = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        tanggalKembali = new datechooser.beans.DateChooserCombo();
        kelasSebelas = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        kodeField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kelasField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(456, 790));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Square721 BT", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\KULIAH\\UAP\\logo.png")); // NOI18N
        jLabel1.setText("|Perpustakaan MAN 5 Bojonegoro");
        jPanel4.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 472, 40));

        tabelPinjambuku.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelPinjambuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPinjambukuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelPinjambuku);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, 154));

        pinjamButton.setFont(new java.awt.Font("Rage Italic", 0, 24)); // NOI18N
        pinjamButton.setText("Pinjam");
        pinjamButton.setContentAreaFilled(false);
        pinjamButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pinjamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjamButtonActionPerformed(evt);
            }
        });
        jPanel1.add(pinjamButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 720, -1, -1));

        keluarButton.setFont(new java.awt.Font("Rage Italic", 0, 24)); // NOI18N
        keluarButton.setText("Keluar");
        keluarButton.setContentAreaFilled(false);
        keluarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(keluarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 400, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 370, 10));

        alamatTA.setColumns(20);
        alamatTA.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        alamatTA.setRows(5);
        alamatTA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alamat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Square721 BT", 1, 14))); // NOI18N
        jPanel1.add(alamatTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 370, 90));

        namaField.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        namaField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Square721 BT", 1, 14))); // NOI18N
        namaField.setOpaque(false);
        jPanel1.add(namaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 370, 60));

        noIndukField.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        noIndukField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "No Induk", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Square721 BT", 1, 14))); // NOI18N
        noIndukField.setOpaque(false);
        noIndukField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                noIndukFieldInputMethodTextChanged(evt);
            }
        });
        noIndukField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noIndukFieldActionPerformed(evt);
            }
        });
        jPanel1.add(noIndukField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 370, 60));

        searchField.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        searchField.setToolTipText("");
        searchField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("BankGothic", 0, 11))); // NOI18N
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 400, -1));

        tanggalPinjam.setFieldFont(new java.awt.Font("Square721 BT", java.awt.Font.PLAIN, 14));
        tanggalPinjam.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                tanggalPinjamOnSelectionChange(evt);
            }
        });
        tanggalPinjam.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                tanggalPinjamOnCommit(evt);
            }
        });
        jPanel1.add(tanggalPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 90, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        jLabel2.setText("FORM PEMINJAM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        kelasSepuluh.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(kelasSepuluh);
        kelasSepuluh.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        kelasSepuluh.setText("10");
        kelasSepuluh.setContentAreaFilled(false);
        kelasSepuluh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(kelasSepuluh, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        kelasDuabelas.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(kelasDuabelas);
        kelasDuabelas.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        kelasDuabelas.setText("12");
        kelasDuabelas.setContentAreaFilled(false);
        kelasDuabelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(kelasDuabelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 370, 30));

        tanggalKembali.setFieldFont(new java.awt.Font("Square721 BT", java.awt.Font.PLAIN, 14));
        tanggalKembali.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                tanggalKembaliOnSelectionChange(evt);
            }
        });
        jPanel1.add(tanggalKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 90, -1));

        kelasSebelas.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(kelasSebelas);
        kelasSebelas.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        kelasSebelas.setText("11");
        kelasSebelas.setContentAreaFilled(false);
        kelasSebelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(kelasSebelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 102));
        jLabel6.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        jLabel6.setText("Tanggal Pinjam");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        kodeField.setEditable(false);
        kodeField.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        kodeField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kode Buku", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Square721 BT", 1, 14))); // NOI18N
        kodeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeFieldActionPerformed(evt);
            }
        });
        jPanel1.add(kodeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 370, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 102));
        jLabel7.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        jLabel7.setText("Tanggal Kembali");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, -1));

        kelasField.setEditable(false);
        kelasField.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        kelasField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kelas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Square721 BT", 1, 14))); // NOI18N
        jPanel1.add(kelasField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 370, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\KULIAH\\UAP\\rsz_logobg.png")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pinjamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinjamButtonActionPerformed
        // TODO add your handling code here:
        if (noIndukField.getText().equals("")||namaField.getText().equals("")||alamatTA.getText().equals("")||buttonGroup1.isSelected(null)){
            JOptionPane.showMessageDialog(null, "data belum lengkap", "PERINGATAN!", JOptionPane.WARNING_MESSAGE);
        }else {
            try{
                Statement state = (Statement) koneksi.getkoneksi().createStatement();
                state.executeUpdate("INSERT INTO tabel_datapinjam VALUES"+"('" 
                        + noIndukField.getText() + "','" 
                        + namaField.getText() + "','" 
                        + alamatTA.getText() + "','"  
                        +buttonGroup1.getSelection().getActionCommand()+ "','"
                        +tanggalPinjam.getText()+"','"
                        +tanggalKembali.getText()+"','"
                        +kodeField.getText()+"');");
                state.close();
                tampil();
                int konfir = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin meminjam buku ini?","Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (konfir == JOptionPane.YES_OPTION){
                    rincian r = new rincian();
                    String noin = noIndukField.getText();
                    String nama = namaField.getText();
                    String kls = buttonGroup1.getSelection().getActionCommand();
                    String kode = noIndukField.getText();
                    String tp = tanggalPinjam.getText();
                    String tk = tanggalKembali.getText();
                    
                    r.noIndukR.setText(noin);
                    r.namaR.setText(nama);
                    r.kelasR.setText(kls);
                    r.kodeBukuR.setText(kode);
                    r.tpR.setText(tp);
                    r.tkR.setText(tk);
                    r.setVisible(true);
                    this.dispose();  
                }else{
                    tampil();
                }
        } catch (Exception ex) {
                Logger.getLogger(homeUser.class.getName()).log(Level.SEVERE, 
                        null, ex);
                JOptionPane.showMessageDialog(null, "Data gagal pinjam, Balikan terlebih dahulu buku yang pernah anda pinjam di perpustakaan ini", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_pinjamButtonActionPerformed

    private void tabelPinjambukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPinjambukuMouseClicked
        // TODO add your handling code here:
        int baris = tabelPinjambuku.rowAtPoint(evt.getPoint());
        String kodeBuku = tabelPinjambuku.getValueAt(baris, 0).toString();
        kodeField.setText(kodeBuku);
        
    }//GEN-LAST:event_tabelPinjambukuMouseClicked

    private void keluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarButtonActionPerformed
        // TODO add your handling code here:
        int k = JOptionPane.showConfirmDialog(null, "Yakin untuk keluar ?","Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(k == JOptionPane.YES_OPTION){
        login l =new login();
        l.setVisible(true);
        this.dispose();
        }else{
            tampil();
        }
    }//GEN-LAST:event_keluarButtonActionPerformed

    private void tanggalPinjamOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_tanggalPinjamOnSelectionChange
        // TODO add your handling code here:

    }//GEN-LAST:event_tanggalPinjamOnSelectionChange

    private void tanggalPinjamOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_tanggalPinjamOnCommit
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalPinjamOnCommit

    private void tanggalKembaliOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_tanggalKembaliOnSelectionChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalKembaliOnSelectionChange

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
        String key = searchField.getText();
        if (key!= ""){
            search(key);
        }else{
            tampil();
        }
        
    }//GEN-LAST:event_searchFieldKeyReleased

    private void kodeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_kodeFieldActionPerformed

    private void noIndukFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noIndukFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_noIndukFieldActionPerformed

    private void noIndukFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_noIndukFieldInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_noIndukFieldInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(homeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea alamatTA;
    public javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JRadioButton kelasDuabelas;
    private javax.swing.JTextField kelasField;
    private javax.swing.JRadioButton kelasSebelas;
    private javax.swing.JRadioButton kelasSepuluh;
    private javax.swing.JButton keluarButton;
    public javax.swing.JTextField kodeField;
    public javax.swing.JTextField namaField;
    public javax.swing.JTextField noIndukField;
    private javax.swing.JButton pinjamButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable tabelPinjambuku;
    public datechooser.beans.DateChooserCombo tanggalKembali;
    public datechooser.beans.DateChooserCombo tanggalPinjam;
    // End of variables declaration//GEN-END:variables

}
