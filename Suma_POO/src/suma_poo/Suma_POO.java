/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Suma_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        Suma Obj_suma = new Suma();
        ArrayList <Suma> l_Suma = new ArrayList<Suma>();
        
        System.out.print("Digite número 1: ");
        n1 = sc.nextInt();
        System.out.print("Digite número 2: ");
        n2 = sc.nextInt();
        
        Obj_suma.setNumero1(n1);
        Obj_suma.setNumero1(n2);
        Obj_suma.setSuma(n1,n2);
        
        l_Suma.add(Obj_suma);
        
        System.out.println("La suma es: "+Obj_suma.getSuma());
        
        
        
    }
    
}
