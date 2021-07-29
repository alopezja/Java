/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list_jul28;

import java.util.*;

/**
 *
 * @author alex
 */
public class Array_List_Jul28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String v_nombre;
        ArrayList<String> lenguaje = new ArrayList<String>();
        
        lenguaje.add("Java");
        lenguaje.add("Phyton");
        lenguaje.add("C#");
        lenguaje.add("JS");
        
        System.out.println(lenguaje);
        
        ArrayList<String> nombre = new ArrayList<String>();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        v_nombre = sc.next();
        lenguaje.add(v_nombre);
        nombre.add(v_nombre);
        
        System.out.println("Arraylist lenguaje: "+lenguaje);
        System.out.println("Arraylist nombre: "+nombre);
        System.out.println("Cantidad de datos: "+lenguaje.size());
        System.out.println("Index lenguajes: "+lenguaje.get(1));
        lenguaje.set(1, "cambio");
        System.out.println("Modificar lenguaje: "+lenguaje);
        
        for (int i=0;i<lenguaje.size();i++)
        {
            System.out.println(lenguaje.get(i));
        }
        
        for (int i=0;i<lenguaje.size();i++)
        {
            if (lenguaje.get(i).equals("Alex"))
            {
                System.out.println("Encontrado en la posición ("+(i+1)+")");
            }
        }
        
        lenguaje.clear();
        System.out.println("Lista borrada: "+lenguaje);

    }
    
}
