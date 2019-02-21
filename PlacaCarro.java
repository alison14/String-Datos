/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradatos;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class PlacaCarro {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static PlacaCarro obj = new PlacaCarro();
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
    }
    
    public static boolean ValidarPlaca(String placa){
        
        System.out.println("Digite la placa: ");
        String a = leer.nextLine();
        a = a.trim();
        boolean b = false;
        int ciclo1 = 0;
        
        while (ciclo1==0){
            if (a.length()!=6) {
                System.out.println("El formato debe ser XXX000 "+" \n"+"Ingrese de nuevo");
                a=leer.nextLine();
                a=a.trim();
            }else if (a.substring(0, 3).matches("^[A-Z]{3}$")== true && a.substring(4, 6).matches("[0-9]{3}")) {
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
