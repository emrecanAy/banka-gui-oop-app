
package database.transactions;

import database.DbVeriMerkezi;
import database.IBilgiController;
import java.sql.ResultSet;

/**
 *
 * @author emrecan
 */
public class HesapBilgileri extends DbVeriMerkezi implements IBilgiController{
    
    /*
    * Singleton Design Pattern
    */
    private static HesapBilgileri hesapBilgileri = null;
    
    public static HesapBilgileri getInstance(){
        if (hesapBilgileri == null) {
            hesapBilgileri = new HesapBilgileri();
        }
        return hesapBilgileri;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return  !(super.kullaniciId==0);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("");
    }
    
    public void girisYap(String musteriKimlik){
        this.kullaniciyiAl(musteriKimlik);
        this.bakiyeAl();
        this.faturalarAl();
    }
    
    public void cikisYap() {
        super.kullaniciId = 0;
        super.adSoyad = null;
        super.telNo = null;
        super.musteriNo = null;
        super.tcNo = null;
        super.bakiye = 0;
        super.elektrikFaturasi = 0;
        super.suFaturasi = 0;
        super.dogalgazFaturasi = 0;
        super.internetFaturasi = 0;
    }
    
    /*
    * Kullanıcı Hesap Bilgilerini Alma
    */
    private void kullaniciyiAl(String musteriKimlik){
        String query = "SELECT * from kullanicilar WHERE "
                + "tc_no = '"+musteriKimlik+"'"
                + " OR "
                + "musteri_no='"+musteriKimlik+"'";
        
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {                
                super.kullaniciId = rs.getInt("kullanici_id");
                super.adSoyad = rs.getString("ad_soyad");
                super.tcNo = rs.getString("tc_no");
                super.telNo = rs.getString("tel_no");
                super.tcNo = rs.getString("musteri_no");
            }
        } catch (Exception e) {
        }
        
    }
    
    private void bakiyeAl(){
        if (this.bilgilerGecerliMi()) {
            String query = "Select * from kullanici_bakiye"
                    + " WHERE "
                    + "kullanici_id='"+super.getKullaniciId()+"'";
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs =statement.executeQuery(query);
                while (rs.next()) {                    
                    super.bakiye = rs.getDouble("bakiye");
                }
                
            } catch (Exception e) {
            }
            
        }
    }
    
    private void faturalarAl(){
        if (this.bilgilerGecerliMi()) {
            String query = "Select * from kullanici_faturalar WHERE "
                    + "kullanici_id='"+super.getKullaniciId()+"'";
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {                    
                    super.elektrikFaturasi = rs.getDouble("elektrik");
                    super.suFaturasi = rs.getDouble("su");
                    super.dogalgazFaturasi = rs.getDouble("dogalgaz");
                    super.internetFaturasi = rs.getDouble("internet");
                }
            } catch (Exception e) {
            }
            
        }
    }
}
