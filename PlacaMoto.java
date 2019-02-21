
package estructuradatos;

import static estructuradatos.PlacaCarro.leer;
import java.util.Scanner;


public class PlacaMoto {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static PlacaMoto obj = new PlacaMoto();
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
     public static boolean ValidarPlacaMoto(String placa){
        
        System.out.println("Digite la placa: ");
        String a = leer.nextLine();
        a = a.trim();
        boolean b = false;
        int ciclo1 = 0;
        
        while (ciclo1==0){
            if (a.length()!=5) {
                System.out.println("El formato debe ser XXX000 "+" \n"+"Ingrese de nuevo");
                a=leer.nextLine();
                a=a.trim();
            }else if (a.substring(2, 5).matches("^[0-9]{3}$")== true && a.substring(0, 2).matches("^[A-Z]{2}&")) {
                System.out.println("Las Placas "+a.substring(0, 3)+"-"+a.substring(4, 6));
                System.out.println("Son validas");
                ciclo1=1;
                
            }else{
                System.out.println("ERROR"+"\n"+"El formato debe ser: XXX000");
                System.out.println("Intentelo nuevamente");
                a=leer.nextLine();
                a=a.trim();
            }
        }
        if (ciclo1==1) {
            b=true;
        }
        return b;
    }
    
}
