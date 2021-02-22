/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.DbConnection;
import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciGiris;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

/**
 *
 * @author emrecan
 */
public final class GirisEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController{

    private KullaniciGiris kullaniciGirisObject = null;
    
    private final String KIMLIK_TEXT_ORIGINAL = "T.C. No / Müşteri No";
    private final String SIFRE_TEXT_ORIGINAL = "**********";
    
    public GirisEkrani() {
        initComponents();
        getEdits();
        new DbConnection();
    }

    @Override
    public void getEdits() {
        girisEkraniPanel.setFocusable(true);
        txtKimlik.setText(KIMLIK_TEXT_ORIGINAL);
        txtSifre.setText(SIFRE_TEXT_ORIGINAL);
        TextAyarlari.setOnlyNumber(txtKimlik);
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.txtKimlik.getText().equals(this.KIMLIK_TEXT_ORIGINAL) || String.valueOf(this.txtSifre.getPassword()).equals(this.SIFRE_TEXT_ORIGINAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public KullaniciGiris getKullaniciGirisObject() {
        if (this.kullaniciGirisObject==null) {
            kullaniciGirisObject = new KullaniciGiris();
        }
        return kullaniciGirisObject;
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisEkraniPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtKimlik = new javax.swing.JTextField();
        txtSifre = new javax.swing.JPasswordField();
        btnGiris = new javax.swing.JButton();
        lblHosgeldiniz = new javax.swing.JLabel();
        btnBasvur = new javax.swing.JButton();
        lblSifreUnut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank - Giriş Ekranı");
        setResizable(false);

        girisEkraniPanel.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SWEET BANKAYA HOŞGELDİNİZ");

        txtKimlik.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtKimlik.setForeground(new java.awt.Color(102, 102, 102));
        txtKimlik.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtKimlikFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtKimlikFocusLost(evt);
            }
        });

        txtSifre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtSifre.setForeground(new java.awt.Color(102, 102, 102));
        txtSifre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSifreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSifreFocusLost(evt);
            }
        });

        btnGiris.setBackground(new java.awt.Color(255, 204, 204));
        btnGiris.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGiris.setText("Giriş");
        btnGiris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGiris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGirisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGirisMouseExited(evt);
            }
        });
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });

        lblHosgeldiniz.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHosgeldiniz.setText("Hâlâ müşterimiz değil misiniz?");

        btnBasvur.setBackground(new java.awt.Color(255, 255, 204));
        btnBasvur.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBasvur.setText("Başvur");
        btnBasvur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBasvur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBasvurMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBasvurMouseExited(evt);
            }
        });
        btnBasvur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBasvurActionPerformed(evt);
            }
        });

        lblSifreUnut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSifreUnut.setForeground(new java.awt.Color(51, 0, 204));
        lblSifreUnut.setText("Şifreyi mi unuttun?");
        lblSifreUnut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSifreUnut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSifreUnutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout girisEkraniPanelLayout = new javax.swing.GroupLayout(girisEkraniPanel);
        girisEkraniPanel.setLayout(girisEkraniPanelLayout);
        girisEkraniPanelLayout.setHorizontalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtKimlik, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                        .addComponent(lblHosgeldiniz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBasvur, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSifreUnut))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        girisEkraniPanelLayout.setVerticalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(txtKimlik, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblSifreUnut)
                .addGap(18, 18, 18)
                .addComponent(btnGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHosgeldiniz)
                    .addComponent(btnBasvur, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBasvur, btnGiris, lblHosgeldiniz});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(girisEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(girisEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Buton Renklendirmeleri
    */
    private void btnGirisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGirisMouseEntered
        ButtonAyarlari.setBgFg(btnGiris, Color.cyan, Color.blue);
    }//GEN-LAST:event_btnGirisMouseEntered

    private void btnGirisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGirisMouseExited
        ButtonAyarlari.setOriginalBgFg(btnGiris);
    }//GEN-LAST:event_btnGirisMouseExited

    private void btnBasvurMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBasvurMouseEntered
        ButtonAyarlari.setBgFg(btnBasvur, Color.magenta, Color.green);
    }//GEN-LAST:event_btnBasvurMouseEntered

    private void btnBasvurMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBasvurMouseExited
        ButtonAyarlari.setOriginalBgFg(btnBasvur);
    }//GEN-LAST:event_btnBasvurMouseExited

    /*
    * Text Odaklanmaları
    */
    
    private void txtKimlikFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKimlikFocusGained
        TextAyarlari.checkTextFocusGained(txtKimlik, KIMLIK_TEXT_ORIGINAL);        
    }//GEN-LAST:event_txtKimlikFocusGained

    private void txtKimlikFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKimlikFocusLost
        TextAyarlari.checkTextFocusLost(txtKimlik);
    }//GEN-LAST:event_txtKimlikFocusLost

    private void txtSifreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSifreFocusGained
        TextAyarlari.checkTextFocusGained(txtSifre, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_txtSifreFocusGained

    private void txtSifreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSifreFocusLost
        TextAyarlari.checkTextFocusLost(txtSifre);
    }//GEN-LAST:event_txtSifreFocusLost

    /*
    * Button Actions
    */
    
    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
        if (this.bilgilerGecerliMi()) {
            String musteriKimlik=this.txtKimlik.getText().trim();
            String sifre=String.valueOf(this.txtSifre.getPassword());
            this.girisYap(musteriKimlik, sifre);
        }else{
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_btnGirisActionPerformed

    private void girisYap(String musteriKimlik, String sifre){
        
        this.getKullaniciGirisObject().setMusteriKimlik(musteriKimlik);
        this.getKullaniciGirisObject().setSifre(sifre);
        
        if (getKullaniciGirisObject().girisBilgileriDogruMu()) {
            ActionAyarlari.setVisible(this, new HesapEkrani());
        }
        else{
            Dialogs.ozelMesajGoser(this, "Giriş Bilgileri Hatalı!\n"
                    + "Lütfen bilgileri kontrol edin...");
        }
        
    }
    
    private void btnBasvurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBasvurActionPerformed
        ActionAyarlari.setVisible(this, new BasvuruEkrani());
    }//GEN-LAST:event_btnBasvurActionPerformed

    private void lblSifreUnutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSifreUnutMouseClicked

        ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
    }//GEN-LAST:event_lblSifreUnutMouseClicked
  
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
    private javax.swing.JButton btnBasvur;
    private javax.swing.JButton btnGiris;
    private javax.swing.JPanel girisEkraniPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHosgeldiniz;
    private javax.swing.JLabel lblSifreUnut;
    private javax.swing.JTextField txtKimlik;
    private javax.swing.JPasswordField txtSifre;
    // End of variables declaration//GEN-END:variables
}
