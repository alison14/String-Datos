
package estructuradatos;

import java.util.Scanner;


public class PlacaMoto {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static PlacaMoto obj2 = new PlacaMoto();
    public static void main(String[] args) {
        // TODO code application logic here
        PlacaMoto.validaMoto();
        
    }
    
     public static boolean validaMoto() {
        System.out.println(".:DIGITE LA PLACA:.");
        String a = leer.nextLine();
        a = a.trim();
        boolean b = false;
        int ciclo1 = 0;
        while (ciclo1 == 0) {

            if (a.length() != 5) {
                System.out.println("El formato debe ser: XX000." + "\n" + "Intentelo nuevamente");
                a = leer.nextLine();
                a = a.trim();
            } else if (a.substring(0, 2).matches("^[A-Z]{2}$") == true && a.substring(2, 5).matches("^[0-9]{3}$") == true) {
                System.out.println("Las placa: " + a.substring(0, 2) + "-" + a.substring(2, 5));
                System.out.println("Es valida");
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
