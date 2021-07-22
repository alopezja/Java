/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jul21;
import java.util.*;

/**
 *
 * @author alex
 */
public class Jul21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner sc = new Scanner(System.in);
            int edad;
            String permiso;
            System.out.print("Ingrese la edad: ");
            edad = sc.nextInt();
            if (edad >= 18)
            {
                System.out.println("Es mayor de edad y puede ingresar");
            }
            else
            {
                System.out.println("Usted es menor de edad y no puede ingresar");
                System.out.print("Tiene permiso?: ");
                permiso = sc.next();
                if (permiso.equals("Si") || permiso.equals("si"))
                {
                    System.out.println("Bienvenido");
                }
                else
                {
                    System.out.println("No puede ingresar");
                }
            }
        }
        catch (Exception e){
            System.out.println("Ha digitado un dato errado");
        }
        
        System.out.println("Valor mínimo: "+Math.min(10,50));
        System.out.println("Valor máximo: "+Math.max(10,50));
        System.out.println("Valor PI: "+Math.PI);
        System.out.println("Valor aleatorio: "+Math.random());
        System.out.println("Valor redondear: "+Math.round(2.6));

        
    }
    
}
