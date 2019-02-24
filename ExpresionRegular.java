
package estructuradatos;

import javax.swing.JOptionPane;

public class ExpresionRegular {
    
        private static final String Parar = "TERMINAR";
    private static final String VALIDO = "Identificador Valido";
    private static final String INVALIDO = "Identificador Invalido";
    private static final String PATRON_VALIDO= "HoLa MuNdO"; 
    public static void main (String [] arg){
        String str, resp; 
        while (true){
            str = JOptionPane.showInputDialog(null, "Identificador: "); 
            if (str.equals("TERMINAR") ) break;{
        }
            if (str.matches(PATRON_VALIDO)) {
                resp = VALIDO;
            }else {
                resp = INVALIDO;}
       JOptionPane.showMessageDialog(null, str + ":\n " + resp); 
        }
    }
}

