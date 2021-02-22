/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.ParaCekme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;

/**
 *
 * @author emrecan
 */
public class ParaCekmeEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController{

    private ParaCekme paraCekmeObject = null; 
    
    private int cekilecekMiktar = 0;
    
    
    
    public ParaCekmeEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        paraCekmeEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(txtCekilecekMiktar);
        TextAyarlari.setMaxLimit(txtCekilecekMiktar, 4);
        this.lblKullaniciAdiSoyadi.setText("Sayın "+this.getHesapBilgileri().getAdSoyad());
        this.lblBakiye.setText(String.valueOf(this.getHesapBilgileri().getBakiye()));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.txtCekilecekMiktar.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public ParaCekme getParaCekmeObject() {
        if (this.paraCekmeObject==null) {
            paraCekmeObject=new ParaCekme();
        }
        return paraCekmeObject;
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraCekmeEkraniPanel = new javax.swing.JPanel();
        lblKullaniciAdiSoyadi = new javax.swing.JLabel();
        lblLimitUyari = new javax.swing.JLabel();
        lblToplamBakiyeniz = new javax.swing.JLabel();
        lblBakiye = new javax.swing.JLabel();
        lblCekeceginizMiktar = new javax.swing.JLabel();
        txtCekilecekMiktar = new javax.swing.JTextField();
        btnParaCek = new javax.swing.JButton();
        previousIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank - Para Çekme Ekranı");
        setResizable(false);

        paraCekmeEkraniPanel.setBackground(new java.awt.Color(204, 204, 255));

        lblKullaniciAdiSoyadi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblKullaniciAdiSoyadi.setForeground(new java.awt.Color(255, 0, 0));
        lblKullaniciAdiSoyadi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblKullaniciAdiSoyadi.setText("Sayın [KULLANICI ADI SOYADI]");

        lblLimitUyari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLimitUyari.setText("Tek seferde 5000 TL ve altını çekebilirsiniz.");

        lblToplamBakiyeniz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblToplamBakiyeniz.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblToplamBakiyeniz.setText("Toplam Bakiyeniz :");

        lblBakiye.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBakiye.setText("[BAKİYE]");

        lblCekeceginizMiktar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCekeceginizMiktar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCekeceginizMiktar.setText("Çekeceğiniz Miktar :");

        txtCekilecekMiktar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCekilecekMiktar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCekilecekMiktarKeyReleased(evt);
            }
        });

        btnParaCek.setBackground(new java.awt.Color(255, 204, 204));
        btnParaCek.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnParaCek.setText("Para Çek");
        btnParaCek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParaCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaCekActionPerformed(evt);
            }
        });

        previousIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        previousIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paraCekmeEkraniPanelLayout = new javax.swing.GroupLayout(paraCekmeEkraniPanel);
        paraCekmeEkraniPanel.setLayout(paraCekmeEkraniPanelLayout);
        paraCekmeEkraniPanelLayout.setHorizontalGroup(
            paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paraCekmeEkraniPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnParaCek, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblCekeceginizMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCekilecekMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                                .addComponent(lblToplamBakiyeniz, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblLimitUyari)))
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblKullaniciAdiSoyadi))
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(previousIcon)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        paraCekmeEkraniPanelLayout.setVerticalGroup(
            paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previousIcon)
                .addGap(33, 33, 33)
                .addComponent(lblKullaniciAdiSoyadi)
                .addGap(45, 45, 45)
                .addComponent(lblLimitUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblToplamBakiyeniz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCekeceginizMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCekilecekMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnParaCek, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paraCekmeEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBakiye, lblLimitUyari, lblToplamBakiyeniz});

        paraCekmeEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCekeceginizMiktar, txtCekilecekMiktar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmeEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmeEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCekilecekMiktarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCekilecekMiktarKeyReleased
       this.cekilecekMiktar = TextAyarlari.checkTextKeyReleased(txtCekilecekMiktar, 5000);     
    }//GEN-LAST:event_txtCekilecekMiktarKeyReleased

    private void btnParaCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaCekActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.paraCek();
        }else{
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_btnParaCekActionPerformed

    private void paraCek(){
        this.getParaCekmeObject().setCekilecekMiktar(cekilecekMiktar);
        
        if (getParaCekmeObject().paraCekildiMi()) {
            Dialogs.ozelMesajGoser(this, "Para Çekme İşlemi Başarılı!\n"
                    + "Çekilen Miktar:"+this.cekilecekMiktar+" TL");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        }else{
            Dialogs.ozelMesajGoser(this, "Bakiye Yetersiz!");
        }
    }
    private void previousIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_previousIconMouseClicked

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
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaCekmeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnParaCek;
    private javax.swing.JLabel lblBakiye;
    private javax.swing.JLabel lblCekeceginizMiktar;
    private javax.swing.JLabel lblKullaniciAdiSoyadi;
    private javax.swing.JLabel lblLimitUyari;
    private javax.swing.JLabel lblToplamBakiyeniz;
    private javax.swing.JPanel paraCekmeEkraniPanel;
    private javax.swing.JLabel previousIcon;
    private javax.swing.JTextField txtCekilecekMiktar;
    // End of variables declaration//GEN-END:variables
}
