/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list_jul28;

/**
 *
 * @author alex
 */
public class Alumno {
    
    private int id;
    private String nombre;
    private String apellido;
    
    //Constructor (método para crear el objeto)
    
    public Alumno(){}
    
    public int GetId(){return this.id;}
    public void SetId(int id){this.id=id;}
    
    
    public String GetNombre(){return this.nombre;}
    public void SetNombre(String nombre){this.nombre=nombre;}
    
    
    public String GetApellido(){return this.apellido;}
    public void SetApellido(String apellido){this.apellido=apellido;}
    
}
