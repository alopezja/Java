/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc2;

import Modelo.Numeros;
import Controlador.Operaciones;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class MVC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Numeros obj_num = new Numeros();
        Operaciones obj_op = new Operaciones();
        
        System.out.print("Digite numero 1: ");       
        obj_num.setN1(sc.nextFloat());

        System.out.print("Digite numero 2: ");       
        obj_num.setN2(sc.nextFloat());

        obj_num = obj_op.sumar(obj_num);
        System.out.println("La suma: "+obj_num.getN1()+
                            " + "+obj_num.getN2()+" = "+obj_num.getRes());

        obj_num = obj_op.restar(obj_num);
        System.out.println("La resta: "+obj_num.getN1()+
                            " - "+obj_num.getN2()+" = "+obj_num.getRes());

        obj_num = obj_op.multiplicar(obj_num);
        System.out.println("La multiplicación: "+obj_num.getN1()+
                            " * "+obj_num.getN2()+" = "+obj_num.getRes());
        
        if (obj_num.getN2()==0)
        {
            System.out.println("La división por 0 no existe");
        }
        else
        {
            obj_num = obj_op.dividir(obj_num);
            System.out.println("La división: "+obj_num.getN1()+
                                " / "+obj_num.getN2()+" = "+obj_num.getRes());
        }
        
    }
    
}
