/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Jul16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, sum, dif, mul, div, res;
        
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese primer valor: ");
            n1 = Integer.parseInt(sc.next());

            System.out.print("Ingrese primer valor: ");
            n2 = Integer.parseInt(sc.next());

            sum = n1 + n2;
            dif = n1 - n2;
            mul = n1 * n2;
            div = n1 / n2;
            res = n1 % n2;

            System.out.println("La suma es: "+sum);
            System.out.println("La resta es: "+dif);
            System.out.println("La multiplicación es: "+mul);
            System.out.println("La división es: "+div);
            System.out.println("El residuo es: "+res);
        }
        catch (Exception e)
        {
            System.out.println("La división por 0 no es válida >>"+e.getMessage()+"<<");
        }
        /*finally
        {
            System.out.println("La división por 0 no es válida");        
        }*/
    }
    
}
