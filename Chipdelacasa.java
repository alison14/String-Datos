
package estructuradatos;

import java.util.Scanner;


public class Chipdelacasa {

     static Scanner leer = new Scanner(System.in);
    static Chipdelacasa obj3 = new Chipdelacasa();
    public static void main(String[] args) {
        // TODO code application logic here
        Chipdelacasa.Validarchip();
    }  
    
    public static boolean Validarchip(){
        
        System.out.println(".:DIGITE EL CHIP:.");
        String a = leer.nextLine();
        a = a.trim();
        boolean b = false;
        int ciclo1 = 0;
        while (ciclo1 == 0) {

            if (a.length() != 12) {
                System.out.println("El formato debe ser: XX000XXX0000." + "\n" + "Intentelo nuevamente");
                a = leer.nextLine();
                a = a.trim();
            } else if (a.substring(0, 2).matches("^[A-Z]{2}$") == true && a.substring(2, 5).matches("^[0-9]{3}$") == true && a.substring(5, 8).matches("^[A-z]{3}$")== true && a.substring(8, 12).matches("^[0-9]{4}$")==true) {
                System.out.println("El chip: " + a.substring(0, 2) + "-" + a.substring(2, 5)+ "-" + a.substring(5, 8) + "-" + a.substring(8, 12));
                System.out.println("Es valido");
                ciclo1 = 1;
            } else {
                System.out.println(".:ERROR:." + "\n" + "El formato debe ser: XX000");
                System.out.println("Ingreselo nuevamente");
                a = leer.nextLine();
                a = a.trim();
            }
        }
        if (ciclo1 == 1) {
            b = true;
        }
        return b;
    }
    
    
}
