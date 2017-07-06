
package Validaciones;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Michael
 */
public class Validaciones extends PlainDocument {
    private JTextField editor;
    private int num;

    public Validaciones() {
    }
    
  
    public void ValidarCaracteres(java.awt.event.KeyEvent evt){
         char car=evt.getKeyChar();
        if((car<'a'|| car>'z')&&(car<'A'||car>'Z')//tecto de a a la z tanto minusculas como MYUSCULAS
                &&(car!=(char)KeyEvent.VK_BACK_SPACE)&&(car!=(char)KeyEvent.VK_SPACE)){////genera espacios en los texto ingresados
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo de admite caracteres","validar caracteres",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void ValidarNumeros(java.awt.event.KeyEvent evt){
        char num=evt.getKeyChar();
        if((num<'0'||num>'9')
                &&(num!=(char)KeyEvent.VK_BACK_SPACE)){//
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se admite numeros","validar caracteres",JOptionPane.INFORMATION_MESSAGE);
            
        }
    }
    
    public void ForzarMayusculas(java.awt.event.KeyEvent evt){
        char c=evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }
    
    public Validaciones(JTextField editor, int num) {
        this.editor = editor;
        this.num = num;
    }
        public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException{
        if((editor.getText().length()+ arg1.length()) > this.num){
            return;
        }super.insertString(arg0, arg1, arg2);
        
    } 

    public void ValidarCaracteres(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ForzarMayusculas(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
    }


