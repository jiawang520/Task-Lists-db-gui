/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager;
import javax.swing.JOptionPane;
import javax.swing.text.*;
/**
 *
 * @author 00220682
 */
public class RestrictedDocument extends PlainDocument {
    String[] charList;
    
    public RestrictedDocument(String[] charList){
        this.charList = charList;
    }
    
    public boolean validate(String exp){
        int len = charList.length;
        for(int i=0; i<len; i++){
            if(exp.equals(charList[i]))
                return true;
        }
        return false;
    }
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
        if(str == null || !validate(str)){
            return;
        }
        super.insertString(offs, str, a);
    }
}
