
package estructuradatos;

import java.util.Scanner;


public class Chipdelacasa {

     static Scanner leer = new Scanner(System.in);
    static Chipdelacasa obj = new Chipdelacasa();
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static boolean ValidarFecha(String placa){
        
        System.out.println("Digite el chip: ");
        String a = leer.nextLine();
        a = a.trim();
        boolean b = false;
        int ciclo1 = 0;
        
        while (ciclo1==0){
            if (a.length()!=12) {
                System.out.println("El formato debe ser az-000-xxx-0000 "+" \n"+"Ingrese de nuevo");
                a=leer.nextLine();
                a=a.trim();
            }else if (a.substring(0,2).matches("^[A-Z]{2}&")== true && a.substring(2, 5).matches("^[0-9]{3}&")==true && a.substring(5, 8).matches("^[A-Z]{3}$")==true && a.substring(9, 12).matches("^[0-9]{4}$")) {
                System.out.println("La fecha "+a.substring(0, 2)+"-"+a.substring(4, 6));
                System.out.println("Son validas");
                ciclo1=1;
                
            }else{
                System.out.println("ERROR"+"\n"+"El formato debe ser: az-000-xxx-0000");
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
