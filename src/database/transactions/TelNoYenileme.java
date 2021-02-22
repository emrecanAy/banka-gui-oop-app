/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import gui.ayarlar.TextAyarlari;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;

/**
 *
 * @author emrecan
 */
public class TelNoYenileme extends DbConnection implements IBilgiController{
    
    private String telNo = null;
    
    public boolean telNoYenilendiMi() {
        if(bilgilerGecerliMi()) {
            String query = "UPDATE kullanicilar "
                    + "SET tel_no = '" + this.telNo + "'"
                    + " WHERE kullanici_id = '" + getHesapBilgileri().getKullaniciId() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getHesapBilgileri().setTelNo(this.telNo);
            } catch (SQLException ex) {
                
            }
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.telNo == null
                || TextAyarlari.uzunlukSundanKucukMu(11, telNo));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    
    
    
}
