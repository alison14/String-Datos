
package estructuradatos;

import static estructuradatos.Chipdelacasa.leer;
import java.util.Scanner;


public class Fecha {

    static Scanner leer = new Scanner(System.in);
    static Fecha obj = new Fecha();
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha.ValidarFecha();
    }
    
   public static boolean ValidarFecha(){
        
        System.out.println(".:DIGITE LA FECHA:.");
        String a = leer.nextLine();
        a = a.trim();
        boolean b = false;
        int ciclo1 = 0;
        while (ciclo1 == 0) {

            if (a.length() != 10) {
                System.out.println("El formato debe ser: 00/00/0000." + "\n" + "Intentelo nuevamente");
                a = leer.nextLine();
                a = a.trim();
            } else if (a.substring(0, 1).matches("^[0-3]{1}$") == true && a.substring(1, 2).matches("^[0-9]{1}$") == true && a.substring(2, 3).matches("^[/]{1}$")== true && a.substring(3, 5).matches("^[0-9]{2}$")==true && a.substring(5, 6).matches("[/]{1}$")==true && a.substring(6, 10).matches("[0-9]{4}$")==true) {
                System.out.println("La fecha: " + a.substring(0, 2) + "/" + a.substring(3, 5)+ "/" + a.substring(6, 10) );
                System.out.println("Es valida");
                ciclo1 = 1;
            } else {
                System.out.println(".:ERROR:." + "\n" + "El formato debe ser: 00/00/0000");
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
