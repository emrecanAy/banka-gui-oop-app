/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgiController;
import database.transactions.FaturaOdemeleri;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;

/**
 *
 * @author emrecan
 */
public class OdemelerEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController{

    private FaturaOdemeleri faturaOdemeleriObject = null;
    
    /**
     * Creates new form OdemelerEkrani
     */
    public OdemelerEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        setFocusable(true);
        this.lblKullaniciAdiSoyadi.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.lblElektrikBorc.setText(String.valueOf(getHesapBilgileri().getElektrikFaturasi()));
        this.lblSuBorc.setText(String.valueOf(getHesapBilgileri().getSuFaturasi()));
        this.lblDogalgazBorc.setText(String.valueOf(getHesapBilgileri().getDogalgazFaturasi()));
        this.lblInternetBorc.setText(String.valueOf(getHesapBilgileri().getInternetFaturasi()));
        
    }

    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public FaturaOdemeleri getFaturaOdemeleriObject() {
        if (this.faturaOdemeleriObject == null) {
            faturaOdemeleriObject = new FaturaOdemeleri();
        }
        return faturaOdemeleriObject;
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odemelerEkraniPanel = new javax.swing.JPanel();
        lblKullaniciAdiSoyadi = new javax.swing.JLabel();
        previousIcon = new javax.swing.JLabel();
        lblElektrikBorc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnElektrikOde = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblSuBorc = new javax.swing.JLabel();
        btnSuOde = new javax.swing.JButton();
        lblDogalgazBorc = new javax.swing.JLabel();
        btnDogalgazOde = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnInternetOde = new javax.swing.JButton();
        lblInternetBorc = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank - Ödemeler Ekranı");
        setResizable(false);

        odemelerEkraniPanel.setBackground(new java.awt.Color(204, 255, 204));

        lblKullaniciAdiSoyadi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblKullaniciAdiSoyadi.setForeground(new java.awt.Color(255, 0, 0));
        lblKullaniciAdiSoyadi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblKullaniciAdiSoyadi.setText("Sayın [KULLANICI ADI SOYADI]");

        previousIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        previousIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousIconMouseClicked(evt);
            }
        });

        lblElektrikBorc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblElektrikBorc.setForeground(new java.awt.Color(51, 0, 204));
        lblElektrikBorc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElektrikBorc.setText("[ELEKT BORC]");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Toplam Elektrik Faturası Borcunuz :");

        btnElektrikOde.setBackground(new java.awt.Color(204, 204, 255));
        btnElektrikOde.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnElektrikOde.setText("ÖDE");
        btnElektrikOde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElektrikOde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElektrikOdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElektrikOdeMouseExited(evt);
            }
        });
        btnElektrikOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElektrikOdeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Toplam Su Faturası Borcunuz :");

        lblSuBorc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSuBorc.setForeground(new java.awt.Color(51, 0, 204));
        lblSuBorc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuBorc.setText("[SU BORC]");

        btnSuOde.setBackground(new java.awt.Color(255, 204, 255));
        btnSuOde.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSuOde.setText("ÖDE");
        btnSuOde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuOde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSuOdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSuOdeMouseExited(evt);
            }
        });
        btnSuOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuOdeActionPerformed(evt);
            }
        });

        lblDogalgazBorc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDogalgazBorc.setForeground(new java.awt.Color(51, 0, 204));
        lblDogalgazBorc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDogalgazBorc.setText("[DGLGZ BORC]");

        btnDogalgazOde.setBackground(new java.awt.Color(255, 255, 204));
        btnDogalgazOde.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnDogalgazOde.setText("ÖDE");
        btnDogalgazOde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDogalgazOde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDogalgazOdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDogalgazOdeMouseExited(evt);
            }
        });
        btnDogalgazOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDogalgazOdeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Toplam Doğalgaz Faturası Borcunuz :");

        btnInternetOde.setBackground(new java.awt.Color(204, 255, 255));
        btnInternetOde.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnInternetOde.setText("ÖDE");
        btnInternetOde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInternetOde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInternetOdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInternetOdeMouseExited(evt);
            }
        });
        btnInternetOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternetOdeActionPerformed(evt);
            }
        });

        lblInternetBorc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInternetBorc.setForeground(new java.awt.Color(51, 0, 204));
        lblInternetBorc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInternetBorc.setText("[INT BORC]");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Toplam İnternet Faturası Borcunuz :");

        javax.swing.GroupLayout odemelerEkraniPanelLayout = new javax.swing.GroupLayout(odemelerEkraniPanel);
        odemelerEkraniPanel.setLayout(odemelerEkraniPanelLayout);
        odemelerEkraniPanelLayout.setHorizontalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previousIcon)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblElektrikBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnElektrikOde, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblKullaniciAdiSoyadi)
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSuBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblInternetBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInternetOde, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDogalgazBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDogalgazOde, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        odemelerEkraniPanelLayout.setVerticalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previousIcon)
                .addGap(8, 8, 8)
                .addComponent(lblKullaniciAdiSoyadi)
                .addGap(62, 62, 62)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElektrikBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElektrikOde, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDogalgazBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDogalgazOde, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInternetBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInternetOde, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_previousIconMouseClicked

    /*
    * Buton Renklendirmeleri
    */
    
    private void setBgFg(Component c){
        ButtonAyarlari.setBgFg((JButton) c, Color.black, Color.white);
    }
    
    private void btnElektrikOdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElektrikOdeMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_btnElektrikOdeMouseEntered

    private void btnElektrikOdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElektrikOdeMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_btnElektrikOdeMouseExited

    private void btnSuOdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuOdeMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_btnSuOdeMouseEntered

    private void btnSuOdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuOdeMouseExited
       ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_btnSuOdeMouseExited

    private void btnDogalgazOdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDogalgazOdeMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_btnDogalgazOdeMouseEntered

    private void btnDogalgazOdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDogalgazOdeMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_btnDogalgazOdeMouseExited

    private void btnInternetOdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInternetOdeMouseEntered
       this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_btnInternetOdeMouseEntered

    private void btnInternetOdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInternetOdeMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_btnInternetOdeMouseExited
    
    /*
    * Actions
    */
    
    private void btnElektrikOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElektrikOdeActionPerformed
        double elektrikTutari = Double.valueOf(this.lblElektrikBorc.getText());
        if (this.faturaOncedenOdenmisMi(elektrikTutari)) {
            Dialogs.ozelMesajGoser(this, "Elektrik faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("elektrik", elektrikTutari);
        }
    }//GEN-LAST:event_btnElektrikOdeActionPerformed

    private void btnSuOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuOdeActionPerformed
        double suTutari = Double.valueOf(this.lblSuBorc.getText());
        if (this.faturaOncedenOdenmisMi(suTutari)) {
            Dialogs.ozelMesajGoser(this, "Su faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("su", suTutari);
        }
    }//GEN-LAST:event_btnSuOdeActionPerformed

    private void btnDogalgazOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDogalgazOdeActionPerformed
        double dogalgazTutari = Double.valueOf(this.lblDogalgazBorc.getText());
        if (this.faturaOncedenOdenmisMi(dogalgazTutari)) {
            Dialogs.ozelMesajGoser(this, "Su faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("dogalgaz", dogalgazTutari);
        }
    }//GEN-LAST:event_btnDogalgazOdeActionPerformed

    private void btnInternetOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInternetOdeActionPerformed
        double internetTutari = Double.valueOf(this.lblInternetBorc.getText());
        if (this.faturaOncedenOdenmisMi(internetTutari)) {
            Dialogs.ozelMesajGoser(this, "İnternet faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("internet", internetTutari);
        }
    }//GEN-LAST:event_btnInternetOdeActionPerformed

    private boolean faturaOncedenOdenmisMi(double odenecekTutar) {
        return odenecekTutar == 0.0;
    }
    
    private void faturayiOde(String faturaIsmi, double faturaTutari) {
        this.getFaturaOdemeleriObject().setFaturaIsmi(faturaIsmi);
        this.getFaturaOdemeleriObject().setFaturaTutari(faturaTutari);

        if (getFaturaOdemeleriObject().faturaOdendiMi()) {
            Dialogs.ozelMesajGoser(this, "Faturanız başarıyla ödenmiştir.");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoser(this, "Ödeme işlemi gerçekleştirilemedi!");
        }
    }
    
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
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemelerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDogalgazOde;
    private javax.swing.JButton btnElektrikOde;
    private javax.swing.JButton btnInternetOde;
    private javax.swing.JButton btnSuOde;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblDogalgazBorc;
    private javax.swing.JLabel lblElektrikBorc;
    private javax.swing.JLabel lblInternetBorc;
    private javax.swing.JLabel lblKullaniciAdiSoyadi;
    private javax.swing.JLabel lblSuBorc;
    private javax.swing.JPanel odemelerEkraniPanel;
    private javax.swing.JLabel previousIcon;
    // End of variables declaration//GEN-END:variables
}
