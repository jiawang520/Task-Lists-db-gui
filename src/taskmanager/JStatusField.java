/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager;
import javax.swing.JTextField;
import javax.swing.text.Document;
/**
 *
 * @author 00220682
 */
public class JStatusField extends JTextField {
    public JStatusField(){
        super();
    }
    @Override
    protected Document createDefaultModel(){
        String[] accept = {"Y","y","N","n"};
        return new RestrictedDocument(accept);
    }
}
