/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("EJERCICIO 1");
        for (num = 1;num<=1000;num++)
        {    
            suma = suma + num;
        }
        System.out.println("La suma es: "+suma);
        
        //---------------------------------------
        
        System.out.println("\nEJERCICIO 2");
        double edadH=0, edadM=0, hombres, mujeres, aux=0;
        System.out.print("Cuantas mujeres conforman el grupo: ");
        mujeres = sc.nextInt();
        System.out.print("Cuantos hombres conforman el grupo: ");
        hombres = sc.nextInt();
        
        int cont = 1;
        while (cont <= mujeres)
        {
            System.out.print("Digite edad Mujer "+cont+": ");
            aux = sc.nextInt();
            edadM = edadM + aux;
            cont = cont + 1;
        }
        
        cont = 1;
        while (cont <= hombres)
        {
            System.out.print("Digite edad Hombre "+cont+": ");
            aux = sc.nextInt();
            edadH = edadH + aux;
            cont = cont + 1;
        }
        
        System.out.println("El promedio de edad de las mujeres es: "+(edadM/mujeres));
        System.out.println("El promedio de edad de los hombres es: "+(edadH/hombres));
    }
    
}
