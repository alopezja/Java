/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abanico_poo;

/**
 *
 * @author alex
 */
public class Abanico_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Abanico Obj_Abanico = new Abanico();
        
        System.out.println("Estado inicial: "+Obj_Abanico.getEstado());
        Obj_Abanico.Encender();
        
        System.out.println("Estado 2: "+Obj_Abanico.getEstado());
        Obj_Abanico.Apagar();
        
        System.out.println("Estado 3 : "+Obj_Abanico.getEstado());
        
    }
    
}
