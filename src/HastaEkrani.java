import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class HastaEkrani extends javax.swing.JDialog {
     DefaultTableModel model;
     hasta_islem islemler= new hasta_islem();

     
    /**
     * Creates new form UyeEkrani
     */
   public HastaEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel) hasta_tablosu.getModel();
        hastalariGoruntule();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        hasta_tablosu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtad = new javax.swing.JTextField();
        txtsoyad = new javax.swing.JTextField();
        txtyasi = new javax.swing.JTextField();
        txttest = new javax.swing.JTextField();
        txtdurumu = new javax.swing.JTextField();
        btnekle = new javax.swing.JButton();
        btnsil = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hasta_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sıra", "Ad", "Soyad", "Yasi", "test_sonucu", "durumu"
            }
        ));
        jScrollPane2.setViewportView(hasta_tablosu);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 750, 373));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AD:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 40, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SOYAD:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("YAŞ:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TEST SONUCU:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DURUMU:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));
        getContentPane().add(txtad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 150, 30));
        getContentPane().add(txtsoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 150, 30));
        getContentPane().add(txtyasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 30));
        getContentPane().add(txttest, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 150, 30));
        getContentPane().add(txtdurumu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 150, 30));

        btnekle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnekle.setText("EKLE");
        btnekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnekleActionPerformed(evt);
            }
        });
        getContentPane().add(btnekle, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 80, 40));

        btnsil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsil.setText("SİL");
        btnsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsilActionPerformed(evt);
            }
        });
        getContentPane().add(btnsil, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 80, 40));

        guncelle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guncelle.setText("GÜNCELLE");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });
        getContentPane().add(guncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 80, 40));

        mesaj_yazisi.setText("jLabel7");
        getContentPane().add(mesaj_yazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5e23e423c03c0e0e5c78ca9b.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 760, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnekleActionPerformed
            mesaj_yazisi.setText("");
        String ad=txtad.getText();
        String soyad=txtsoyad.getText();
        String yasi=txtyasi.getText();
        String test_sonucu=txttest.getText();
        String durumu=txtdurumu.getText();
    
        
        islemler.hastaEkle(ad,soyad,yasi,test_sonucu,durumu);
        hastalariGoruntule();
        mesaj_yazisi.setText("Yeni hasta Başarıyla Eklendi...");
    }//GEN-LAST:event_btnekleActionPerformed

    
    private void hasta_tablosuMouseClicked(java.awt.event.MouseEvent evt) {                                         
        
        int selected_row = hasta_tablosu.getSelectedRow();
        txtad.setText(model.getValueAt(selected_row, 1).toString());
        txtsoyad.setText(model.getValueAt(selected_row, 2).toString());
        txtyasi.setText(model.getValueAt(selected_row, 3).toString());
        txttest.setText(model.getValueAt(selected_row, 4).toString());
        txtdurumu.setText(model.getValueAt(selected_row, 5).toString());

        
        
        
    }         
    private void btnsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsilActionPerformed

        mesaj_yazisi.setText("");
        
        int selectedrow = hasta_tablosu.getSelectedRow();
        
        if(selectedrow == -1){
            
            if(model.getRowCount() == 0){
               mesaj_yazisi.setText("hastalar tablosu şuanda boş");
            }else{
                mesaj_yazisi.setText("Lütfen silinecek bir hasta seçiniz");
            }
        }else{
            
            var sıra = (int) model.getValueAt(selectedrow, 0);
            
            islemler.hastaSil(sıra);
            
            hastalariGoruntule();
            
            mesaj_yazisi.setText("hasta başarıyla silindi");
        }
        
    }//GEN-LAST:event_btnsilActionPerformed

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        // TODO add your handling code here:
        String ad = txtad.getText();
        String soyad = txtsoyad.getText();
        String yasi = txtyasi.getText();
        String test_sonucu= txttest.getText();
        String durumu = txtdurumu.getText();
   
         int selectedrow = hasta_tablosu.getSelectedRow();
        
        if(selectedrow == -1){
            
            if(model.getRowCount() == 0){
               mesaj_yazisi.setText("hasta tablosu şuanda boş");
            }else{
                mesaj_yazisi.setText("Lütfen güncellenecek bir alan seçiniz");
            }
        }else{
            
            int sıra = (int) model.getValueAt(selectedrow, 0);
            
            islemler.hastaGuncelle(sıra,ad,soyad,yasi,test_sonucu,durumu);
            
            hastalariGoruntule();
            
            mesaj_yazisi.setText("hasta bilgileri başarıyla güncellendi");
        }
        
    }//GEN-LAST:event_guncelleActionPerformed
  public void hastalariGoruntule(){
        
        model.setRowCount(0);
        ArrayList<hst> a=new ArrayList<hst>();
        a=islemler.hastalariGetir();
        
        if (a!= null) {
            
            for (hst hasta :a) {
                Object[] eklenecek ={hasta.getSıra(), hasta.getAd(), hasta.getSoyad(), hasta.getYasi(), hasta.getTest_sonucu(), hasta.getDurumu()};
                model.addRow(eklenecek);
            }
        }
        
    }
   
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
            java.util.logging.Logger.getLogger(HastaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HastaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HastaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HastaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnekle;
    private javax.swing.JButton btnsil;
    private javax.swing.JButton guncelle;
    private javax.swing.JTable hasta_tablosu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField txtad;
    private javax.swing.JTextField txtdurumu;
    private javax.swing.JTextField txtsoyad;
    private javax.swing.JTextField txttest;
    private javax.swing.JTextField txtyasi;
    // End of variables declaration//GEN-END:variables

}
