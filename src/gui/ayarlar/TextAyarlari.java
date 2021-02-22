package gui.ayarlar;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author emrecan
 */
public class TextAyarlari {

    /*
    * Odaklanma ayarları
     */
    private static String originalText;
    private static Color originalFgColor;

    public static void checkTextFocusGained(JTextField textField, String org) {
        originalText = org;

        if (textField.getText().trim().equals(org)) {
            originalFgColor = textField.getForeground();
            textField.setText("");
        }

        textField.setForeground(Color.BLUE);
    }

    public static void checkTextFocusLost(JTextField textField) {

        if (textField.getText().trim().equals("")) {
            textField.setForeground(originalFgColor);
            textField.setText(originalText);
        } else {
            textField.setForeground(Color.BLACK);
        }

    }

    /*
    * Key ayarları
     */
    public static void setOnlyNumber(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume(); // event devre dışı bırakılıyor.
                }
            }

        });
    }

    public static void setOnlyAlphabetic(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isAlphabetic(c) && c!=KeyEvent.VK_SPACE) {
                    e.consume(); // event devre dışı bırakılıyor.
                }
            }

        });
    }

    /*
    * Limit Ayarları
     */
    public static int limit;

    public static void setMaxLimit(JTextField textField, int lim) {
        limit = lim;
        textField.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {

                if (str == null) {
                    return;
                }
                if ((getLength() + str.length() <= limit)) {
                    super.insertString(offs, str, a); //To change body of generated methods, choose Tools | Templates.
                }
                
            }

        });

    }
    
    public static boolean uzunlukSundanKucukMu(int length, String str){
        return (str.length()<length);
    }
    
    /*
    * Para Miktarı Ayarları
    */
    
    public static int checkTextKeyReleased(JTextField textField, int moneyLimit){
        String text = textField.getText();
        
        if (!text.equals("")) {
            int miktar = Integer.valueOf(text);
            
            if (miktar > moneyLimit) {
                miktar = moneyLimit;
                textField.setText(String.valueOf(miktar));
            }
            return miktar;
        }
        return 0;
    }
    
    /*
    * Text alanları kontrol
    */
    
    public static boolean textAlanlariDoluMu(JPanel panel){
        
        Component[] components = panel.getComponents();
        for(Component c:components){
            if (c instanceof JTextField) {
                JTextField textField = (JTextField) c;
                if (textField.getText().trim().equals("") && textField.isEnabled()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    
    /*
    *Text alanlari kontrolü
    */
    public static boolean textAlanlariDolumu(JPanel panel) {
        Component[] components = panel.getComponents();
        for(Component c:components) {
            if(c instanceof JTextField) {
                JTextField textField = (JTextField) c;
                if(textField.getText().trim().equals("") && textField.isEnabled()) {
                    return false;
                }
            }
        }
        return true;
    }
}
