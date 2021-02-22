
package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author emrecan
 */
public class ButtonAyarlari {
    
    /*
    * Arka plan ve yazı rengi ayarları
    */
    
    private static Color originalBgColor, originalFgColor;
    
    public static void setBgFg(JButton button, Color bgColor, Color fgColor){
        
        originalBgColor = button.getBackground();
        originalFgColor = button.getForeground();
        button.setBackground(bgColor);
        button.setBackground(fgColor);
        
    }
    
    public static void setOriginalBgFg(JButton button){
        
        button.setBackground(originalBgColor);
        button.setForeground(originalFgColor);
    }
    
    
    
    
}
