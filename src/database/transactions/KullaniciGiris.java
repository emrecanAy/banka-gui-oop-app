
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.ResultSet;

/**
 *
 * @author emrecan
 */
public class KullaniciGiris extends DbConnection implements IBilgiController{
    
    private String musteriKimlik = null;
    private String sifre = null;

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.musteriKimlik ==null
                || this.sifre==null);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public String getMusteriKimlik() {
        return musteriKimlik;
    }

    public void setMusteriKimlik(String musteriKimlik) {
        this.musteriKimlik = musteriKimlik;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    public boolean girisBilgileriDogruMu(){
        if (bilgilerGecerliMi()) {
            if (girisBasariliMi()) {
                this.getHesapBilgileri().girisYap(musteriKimlik);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    private boolean girisBasariliMi(){
        String query = "Select tc_no,musteri_no,sifre from kullanicilar"
                + " WHERE "
                + "(tc_no = '" + this.musteriKimlik + "'"
                + " OR "
                + "musteri_no = '"+this.musteriKimlik+"')"
                + " AND "
                + "sifre='"+this.sifre+"'";
        
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {                
                return true;
            }
        } catch (Exception e) {
        }
        return false;
        
        
    }
    
}
