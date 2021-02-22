
package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author emrecan
 */
public class Dialogs {
    
    public static void bosOlamazMesajiGoster(JFrame frame){
        JOptionPane.showMessageDialog(frame, "Tüm alanlar dolu olmalıdır!");
    }
    
    public static void ozelMesajGoser(JFrame frame, String message){
        JOptionPane.showMessageDialog(frame, message);
    }
    
    public static int onayMesajiGoster(JFrame frame,String message) {
        int optionType = JOptionPane.YES_NO_OPTION;
        int selected = JOptionPane.showConfirmDialog(frame, message, "UYARI", optionType);
        //System.out.println(selected);
        if(optionType == selected) {
            return 1;
        }
        return 0;
    }
}
