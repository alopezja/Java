/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola_mundo;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Hola_mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Java MINTIC UPB");
        System.out.println("   -   -   -   ");
        int n1=1; int n2=2;
        int a=10, b=20;
        String cadena;
        
        System.out.println("El número 2 es: "+n2+"\nEl número a es: "+a+"\nEl número b es: "+b+"\n\n");
        System.out.println("El número 1 es: "+n1);
        System.out.println("El número 2 es: "+n2);
        System.out.println("El número a es: "+a);
        System.out.println("El número b es: "+b);
        
        cadena = "Esto es una cadena";
        
        System.out.println("El valor del string es: "+cadena);
        
        Integer i=null;
        i = 59;
        System.out.println("\nEntero: "+i);
        
        Double d=null;
        d = 5.5;
        System.out.println("Doble: "+d);        

        Scanner sc = new Scanner(System.in);
        String nombre, apellido;
        
        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese apellido: ");
        apellido = sc.nextLine();
        
        System.out.println("Bienvenido "+nombre+" "+apellido);        

        
    }
    
}
