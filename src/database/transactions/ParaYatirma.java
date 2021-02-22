/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.transactions;

import database.DbConnection;
import database.IBilgiController;

/**
 *
 * @author emrecan
 */
public class ParaYatirma extends DbConnection implements IBilgiController{

    private int yatirilacakMiktar=0;
    
    public boolean paraYatirildiMi(){
        if (bilgilerGecerliMi()) {
            String query = "UPDATE kullanici_bakiye "
                    +"SET bakiye = bakiye +'"+this.yatirilacakMiktar+"'"
                    +" WHERE kullanici_id = '"+getHesapBilgileri().getKullaniciId()+"'";
            
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye()+this.yatirilacakMiktar);
            } catch (Exception e) {
            }
            
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.yatirilacakMiktar==0);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public int getYatirilacakMiktar() {
        return yatirilacakMiktar;
    }

    public void setYatirilacakMiktar(int yatirilacakMiktar) {
        this.yatirilacakMiktar = yatirilacakMiktar;
    }
    
    
    
}
