/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_metodosjul29;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Clases_MetodosJul29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int id;
        String nombre,apellido;
        
        ArrayList <Alumno> l_Alumnos = new ArrayList<Alumno>();
        
        Alumno Obj_Alumno = new Alumno ();
        
        Obj_Alumno.SetId(1);
        Obj_Alumno.SetNombre("Alex");
        Obj_Alumno.SetApellido("López");
        
        //l_Alumnos.add(Obj_Alumno);
        
        System.out.println("Estados atributos 1\nId: "+Obj_Alumno.GetId()
                            +"\nNombre: "+Obj_Alumno.GetNombre()
                            +"\nApellido: "+Obj_Alumno.GetApellido()+"\n");
        
        Obj_Alumno.SetId(2);
        Obj_Alumno.SetNombre("Valentina");
        Obj_Alumno.SetApellido("López");
        
        //l_Alumnos.add(Obj_Alumno);
        
        System.out.println("Estados atributos 2\nId: "+Obj_Alumno.GetId()
                            +"\nNombre: "+Obj_Alumno.GetNombre()
                            +"\nApellido: "+Obj_Alumno.GetApellido()+"\n");
        
        System.out.println("INGRESANDO VALORES DE USUARIO\n");
        
        for (int i=0;i<2;i++)
        {
        System.out.print("Digite el Id: ");
        id = sc.nextInt();
        System.out.print("Digite el Nombre: ");
        nombre = sc.next();
        System.out.print("Digite el Apellido: ");
        apellido = sc.next();
        
        System.out.println("");
        
        Obj_Alumno.SetId(id);
        Obj_Alumno.SetNombre(nombre);
        Obj_Alumno.SetApellido(apellido);
        
        l_Alumnos.add(Obj_Alumno);
        
        /*
        System.out.println("Alumno #"+(i+1)+"\nId: "+Obj_Alumno.GetId()
                            +"\nNombre: "+Obj_Alumno.GetNombre()
                            +"\nApellido: "+Obj_Alumno.GetApellido()+"\n");
        */
        
        }
        
        System.out.println("IMPRIMIENDO TODOS LOS ALUMNOS\n");
        
        for (int i=0;i<l_Alumnos.size();i++)
        {
            System.out.println("Alumno #"+(i+1)+"\nId: "+l_Alumnos.get(i).GetId()
                                +"\nNombre: "+l_Alumnos.get(i).GetNombre()
                                +"\nApellido: "+l_Alumnos.get(i).GetApellido()+"\n");
        }
        
    }
    
}
