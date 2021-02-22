/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.TelNoYenileme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.IconAyarlari;
import gui.ayarlar.TextAyarlari;

/**
 *
 * @author emrecan
 */
public class AyarlarEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController{

    private TelNoYenileme telNoYenilemeObject = null;

    private String eskiTelNo = null;
    
    /**
     * Creates new form AyarlarEkrani
     */
    public AyarlarEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        ayarlarEkraniPanel.setFocusable(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        TextAyarlari.setOnlyNumber(txtTelNo);
        TextAyarlari.setMaxLimit(txtTelNo, 11);
        this.txtTelNo.setText(getHesapBilgileri().getTelNo());
        this.eskiTelNo = txtTelNo.getText();
        this.lblKullaniciAdiSoyadi.setText("Sayın " + getHesapBilgileri().getAdSoyad());
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.txtTelNo1.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public TelNoYenileme getTelNoYenilemeObject() {
        if (this.telNoYenilemeObject == null) {
            telNoYenilemeObject = new TelNoYenileme();
        }
        return telNoYenilemeObject;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayarlarEkraniPanel = new javax.swing.JPanel();
        lblKullaniciAdiSoyadi = new javax.swing.JLabel();
        previousIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTelNo = new javax.swing.JTextField();
        telNoDegistirIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTelNo1 = new javax.swing.JTextField();
        sifreDegistirIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank - Ayarlar Ekranı");
        setResizable(false);

        ayarlarEkraniPanel.setBackground(new java.awt.Color(255, 255, 204));

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Telefon Numaranız :");

        txtTelNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelNo.setEnabled(false);

        telNoDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        telNoDegistirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telNoDegistirIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telNoDegistirIconMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Şifreniz :");

        txtTelNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelNo1.setText("*********");
        txtTelNo1.setEnabled(false);

        sifreDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        sifreDegistirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreDegistirIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreDegistirIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ayarlarEkraniPanelLayout = new javax.swing.GroupLayout(ayarlarEkraniPanel);
        ayarlarEkraniPanel.setLayout(ayarlarEkraniPanelLayout);
        ayarlarEkraniPanelLayout.setHorizontalGroup(
            ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(previousIcon))
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblKullaniciAdiSoyadi)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelNo)
                        .addGap(18, 18, 18)
                        .addComponent(telNoDegistirIcon))
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelNo1)
                        .addGap(18, 18, 18)
                        .addComponent(sifreDegistirIcon)))
                .addGap(35, 35, 35))
        );
        ayarlarEkraniPanelLayout.setVerticalGroup(
            ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previousIcon)
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKullaniciAdiSoyadi)
                        .addGap(45, 45, 45)
                        .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(telNoDegistirIcon)))
                .addGap(27, 27, 27)
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sifreDegistirIcon))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_previousIconMouseClicked

    private void telNoYenile() {
        if (this.bilgilerGecerliMi()) {
            String yeniTelNo = this.txtTelNo.getText().trim();
            getTelNoYenilemeObject().setTelNo(yeniTelNo);
            if (getTelNoYenilemeObject().telNoYenilendiMi()) {
                Dialogs.ozelMesajGoser(this, "Telefon numarası " + yeniTelNo + " olarak güncellenmiştir.");
            } else {
                this.telNoYenile();
                Dialogs.ozelMesajGoser(this, "Başarısız.Bilgileri kontrol edin!");
                this.txtTelNo.setText(this.eskiTelNo);
            }
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
            this.txtTelNo.setText(this.eskiTelNo);
        }
    }
    
    private int clickCounter = 0;
    private void telNoDegistirIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telNoDegistirIconMouseClicked
        if (this.clickCounter == 0) { //daha önce tıklanmamış
            txtTelNo.setEnabled(true);
            //IconAyarlari.changeIcon(telNoDegistirIcon, "updateTelIcon2");
            clickCounter++;
        } else { //daha önce tıklanmış
            txtTelNo.setEnabled(false);
            this.telNoYenile();
            //IconAyarlari.setOriginalIcon(telNoDegistirIcon);
            clickCounter = 0;
        }
        
        
    }//GEN-LAST:event_telNoDegistirIconMouseClicked

    private void sifreDegistirIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreDegistirIconMouseClicked
        ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
    }//GEN-LAST:event_sifreDegistirIconMouseClicked

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
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyarlarEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ayarlarEkraniPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblKullaniciAdiSoyadi;
    private javax.swing.JLabel previousIcon;
    private javax.swing.JLabel sifreDegistirIcon;
    private javax.swing.JLabel telNoDegistirIcon;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtTelNo1;
    // End of variables declaration//GEN-END:variables
}
