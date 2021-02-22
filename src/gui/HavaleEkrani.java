/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgiController;
import database.transactions.Havale;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;

/**
 *
 * @author emrecan
 */
public class HavaleEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController{
    
    private Havale havaleObject = null;
    
    private final String MUSTERI_NO_TEXT_ORIGINAL = "Müşteri No";
    private int gonderilecekMiktar = 0;
    /**
     * Creates new form HavaleEkrani
     */
    public HavaleEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        havaleEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(txtGonderilecekMiktar);
        TextAyarlari.setMaxLimit(txtGonderilecekMiktar, 5);
        TextAyarlari.setOnlyNumber(txtHavaleAlacakKisi);
        txtHavaleAlacakKisi.setText(MUSTERI_NO_TEXT_ORIGINAL);
        this.lblKullaniciAdiSoyadi.setText("Sayın "+this.getHesapBilgileri().getAdSoyad());
        this.lblBakiye.setText(String.valueOf(getHesapBilgileri().getBakiye()));
        
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.txtGonderilecekMiktar.getText().equals("")
                || this.txtHavaleAlacakKisi.getText().equals(this.MUSTERI_NO_TEXT_ORIGINAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public Havale getHavaleObject(){
        if (this.havaleObject==null) {
            havaleObject=new Havale();
        }
        return havaleObject;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        havaleEkraniPanel = new javax.swing.JPanel();
        lblKullaniciAdiSoyadi = new javax.swing.JLabel();
        lblLimitUyari = new javax.swing.JLabel();
        lblToplamBakiyeniz = new javax.swing.JLabel();
        lblBakiye = new javax.swing.JLabel();
        lblGondereceginizMiktar = new javax.swing.JLabel();
        txtGonderilecekMiktar = new javax.swing.JTextField();
        btnHavale = new javax.swing.JButton();
        previousIcon = new javax.swing.JLabel();
        txtHavaleAlacakKisi = new javax.swing.JTextField();
        lblYatiracaginizMiktar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        havaleEkraniPanel.setBackground(new java.awt.Color(255, 204, 255));

        lblKullaniciAdiSoyadi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblKullaniciAdiSoyadi.setForeground(new java.awt.Color(255, 0, 0));
        lblKullaniciAdiSoyadi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblKullaniciAdiSoyadi.setText("Sayın [KULLANICI ADI SOYADI]");

        lblLimitUyari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLimitUyari.setText("Tek seferde 20.000 TL ve altını yatırabilirsiniz.");

        lblToplamBakiyeniz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblToplamBakiyeniz.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblToplamBakiyeniz.setText("Toplam Bakiyeniz :");

        lblBakiye.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBakiye.setText("[BAKİYE]");

        lblGondereceginizMiktar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblGondereceginizMiktar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGondereceginizMiktar.setText("Göndereceğiniz Miktar :");

        txtGonderilecekMiktar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGonderilecekMiktar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGonderilecekMiktarKeyReleased(evt);
            }
        });

        btnHavale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHavale.setText("Havale Yap");
        btnHavale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHavale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHavaleActionPerformed(evt);
            }
        });

        previousIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        previousIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousIconMouseClicked(evt);
            }
        });

        txtHavaleAlacakKisi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHavaleAlacakKisi.setForeground(new java.awt.Color(153, 153, 153));
        txtHavaleAlacakKisi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHavaleAlacakKisiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHavaleAlacakKisiFocusLost(evt);
            }
        });

        lblYatiracaginizMiktar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblYatiracaginizMiktar1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblYatiracaginizMiktar1.setText("Havale Alacak Kişi :");

        javax.swing.GroupLayout havaleEkraniPanelLayout = new javax.swing.GroupLayout(havaleEkraniPanel);
        havaleEkraniPanel.setLayout(havaleEkraniPanelLayout);
        havaleEkraniPanelLayout.setHorizontalGroup(
            havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addComponent(lblGondereceginizMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGonderilecekMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addComponent(lblToplamBakiyeniz, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addComponent(lblYatiracaginizMiktar1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHavaleAlacakKisi, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 101, Short.MAX_VALUE))
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblLimitUyari))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblKullaniciAdiSoyadi))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(previousIcon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, havaleEkraniPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnHavale)
                .addGap(142, 142, 142))
        );
        havaleEkraniPanelLayout.setVerticalGroup(
            havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previousIcon)
                .addGap(33, 33, 33)
                .addComponent(lblKullaniciAdiSoyadi)
                .addGap(45, 45, 45)
                .addComponent(lblLimitUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblToplamBakiyeniz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGondereceginizMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGonderilecekMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYatiracaginizMiktar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHavaleAlacakKisi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnHavale, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havaleEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havaleEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGonderilecekMiktarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGonderilecekMiktarKeyReleased
        this.gonderilecekMiktar = TextAyarlari.checkTextKeyReleased(txtGonderilecekMiktar, 20000);
    }//GEN-LAST:event_txtGonderilecekMiktarKeyReleased

    private void btnHavaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHavaleActionPerformed
        if(this.bilgilerGecerliMi()) {
            this.havaleYap();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_btnHavaleActionPerformed

    private void havaleYap() {
        getHavaleObject().setGonderilecekMiktar(this.gonderilecekMiktar);
        getHavaleObject().setHavaleAlacakKisi(this.txtHavaleAlacakKisi.getText());
        
        if(getHavaleObject().havaleYapildiMi()) {
            Dialogs.ozelMesajGoser(this, "Havale işlemi başarıyla gerçekleşmiştir.\n"
                    + "Gönderilen müşteri numarası:" + this.txtHavaleAlacakKisi.getText()
                    + "\nGönderilen Miktar:" + this.gonderilecekMiktar + " TL");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoser(this, "Havale işlemi gerçekleştirilemedi.\n"
                    + "Lütfen bilgilerinizi kontrol edin!");
        }
    }
    
    private void previousIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_previousIconMouseClicked

    private void txtHavaleAlacakKisiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHavaleAlacakKisiFocusGained
        TextAyarlari.checkTextFocusGained(txtHavaleAlacakKisi, MUSTERI_NO_TEXT_ORIGINAL);
    }//GEN-LAST:event_txtHavaleAlacakKisiFocusGained

    private void txtHavaleAlacakKisiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHavaleAlacakKisiFocusLost
        TextAyarlari.checkTextFocusLost(txtHavaleAlacakKisi);
    }//GEN-LAST:event_txtHavaleAlacakKisiFocusLost

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
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HavaleEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHavale;
    private javax.swing.JPanel havaleEkraniPanel;
    private javax.swing.JLabel lblBakiye;
    private javax.swing.JLabel lblGondereceginizMiktar;
    private javax.swing.JLabel lblKullaniciAdiSoyadi;
    private javax.swing.JLabel lblLimitUyari;
    private javax.swing.JLabel lblToplamBakiyeniz;
    private javax.swing.JLabel lblYatiracaginizMiktar1;
    private javax.swing.JLabel previousIcon;
    private javax.swing.JTextField txtGonderilecekMiktar;
    private javax.swing.JTextField txtHavaleAlacakKisi;
    // End of variables declaration//GEN-END:variables
}
