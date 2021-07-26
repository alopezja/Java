/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jul23_ciclos;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Jul23_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 1, iteracion = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Cantidad de interaciones: ");
        iteracion = sc.nextInt();
        
        do {
            System.out.println("En do while es: "+cont);
            cont = cont + 1;
        } while (cont<=iteracion);
        
        System.out.println("\nFOR\n");      
        
        for (int i = 1; i <= iteracion ; i++)
        {
            System.out.println("En for es: "+i);
        }
            
    }
    
}
