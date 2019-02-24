
package estructuradatos;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class PlacaCarro {

    
    static Scanner leer = new Scanner(System.in);
    static PlacaCarro obj1 = new PlacaCarro();
    public static void main(String[] args) {
        // TODO code application logic here
        
         PlacaCarro.validaCar();
        
    }
    
   

public static boolean validaCar() {
        System.out.println(".:DIGITE LA PLACA:.");
        String a = leer.nextLine();
        a = a.trim();
        boolean b = false;
        int ciclo1 = 0;
        while (ciclo1 == 0) {

            if (a.length() != 6) {
                System.out.println("El formato debe ser: XXX000." + "\n" + "Intentelo nuevamente");
                a = leer.nextLine();
                a = a.trim();
            } else if (a.substring(0, 3).matches("^[A-Z]{3}$") == true && a.substring(3, 6).matches("^[0-9]{3}$") == true) {
                System.out.println("La placa: " + a.substring(0, 3) + "-" + a.substring(3, 6));
                System.out.println("Es valida");
                ciclo1 = 1;
            } else {
                System.out.println(".:ERROR:." + "\n" + "El formato debe ser: XXX000");
                System.out.println("Intentelo nuevamente");
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
