/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int longitud = 0;
        String nombre;
        Scanner sc = new Scanner(System.in);
        
//        int [] vector1 = new int[5]; //Arreglo o vector unidimensional
//        
//        String [] new_vector;
//        System.out.print("Digite la longitud del vector: ");
//        longitud = sc.nextInt();
//        new_vector = new String [longitud];
//        
//        for (int i=0;i<longitud;i++)
//        {
//            System.out.print("Ingrese nombre "+(i+1)+": ");
//            nombre = sc.next();
//            new_vector[i] = nombre;
//        }
//        
//        for (int i=0;i<longitud;i++)
//        {
//            System.out.println("El vector es "+(i+1)+": "+new_vector[i]);
//        }
        
        System.out.println("\nMATRICES");
        
        String matriz [][];
        int filas = 0;
        int columnas = 0;
        
        System.out.print("Ingrese cantidad de filas: ");
        filas = sc.nextInt();
        
        System.out.print("Ingrese cantidad de columnas: ");
        columnas = sc.nextInt();
        
        matriz = new String[filas][columnas];
        String edad;
        for (int i=0;i<filas;i++)
        {
            for (int j=0;j<columnas;j++)
            {
                System.out.print("Digite la edad ["+(i+1)+","+(j+1)+"]: ");
                edad = sc.next();
                matriz [i][j] = edad;
            }
        }
        for (int i=0;i<filas;i++)
        {
            for (int j=0;j<columnas;j++)
            {
                System.out.println("Las edades son: "+matriz[i][j]);
            }
        }
    }
    
}
