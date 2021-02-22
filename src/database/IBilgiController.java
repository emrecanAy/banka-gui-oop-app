
package database;

import database.transactions.HesapBilgileri;

/**
 *
 * @author emrecan
 */
public interface IBilgiController {
    
    public boolean bilgilerGecerliMi();
    
    public HesapBilgileri getHesapBilgileri();
    
}
