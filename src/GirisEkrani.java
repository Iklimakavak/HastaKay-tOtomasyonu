/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iklima
 */
public class GirisEkrani extends javax.swing.JFrame {
    
    hasta_islem islemler= new hasta_islem();

    /**
     * Creates new form GirisEkrani
     */
    public GirisEkrani() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblkuladi = new javax.swing.JLabel();
        lblsifre = new javax.swing.JLabel();
        btngiris = new javax.swing.JButton();
        txtkuladi = new javax.swing.JTextField();
        mesaj = new javax.swing.JLabel();
        sifre = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblkuladi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblkuladi.setForeground(new java.awt.Color(255, 255, 255));
        lblkuladi.setText("KULLANICI ADI:");
        getContentPane().add(lblkuladi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        lblsifre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblsifre.setForeground(new java.awt.Color(255, 255, 255));
        lblsifre.setText("ŞİFRE:");
        lblsifre.setRequestFocusEnabled(false);
        getContentPane().add(lblsifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        btngiris.setBackground(new java.awt.Color(0, 0, 0));
        btngiris.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btngiris.setForeground(new java.awt.Color(255, 255, 255));
        btngiris.setText("GİRİŞ");
        btngiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngirisActionPerformed(evt);
            }
        });
        getContentPane().add(btngiris, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 90, 40));
        getContentPane().add(txtkuladi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 150, 30));

        mesaj.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mesaj.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(mesaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 210, 20));
        getContentPane().add(sifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-1209679043-612x612.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngirisActionPerformed
        // TODO add your handling code here:
         
        mesaj.setText("");
        String kul_adi=txtkuladi.getText();
        String parola= new String(sifre.getPassword());
        boolean girisbasarili =islemler.girisYap(kul_adi, parola);
        if (girisbasarili) {
          HastaEkrani hastaEkrani=new HastaEkrani(this,true);
            setVisible(false);
            hastaEkrani.setVisible(true);
            System.exit(0);
        }
        else{
            mesaj.setText("Giriş Başarısız");
        }
    }//GEN-LAST:event_btngirisActionPerformed

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblkuladi;
    private javax.swing.JLabel lblsifre;
    private javax.swing.JLabel mesaj;
    private javax.swing.JPasswordField sifre;
    private javax.swing.JTextField txtkuladi;
    // End of variables declaration//GEN-END:variables
}