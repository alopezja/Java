/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
import java.util.*;

public class Reto {

    public static void main(String[] args) {
        //Creación del objeto tipo Colegio.
        Colegio colegio = new Colegio();
        //Creacion del objeto tipo profesor para validar el reto 2
        Profesor docentes_1 = new Profesor("Raul", 1875000);
        //Array para almacenar materias.
        Curso materia = new Curso();
        //se crea la materia matematicas en el objeto materia de tipo curso
        materia.setNombre("matematicas");
        //se crea el array tipo curso para almacenar las materias del profesor.
        ArrayList<Curso> curso = new ArrayList<Curso>();
        //Se ingresan varias material para el control de la bonificación
        curso.add(materia);
        curso.add(materia);
        curso.add(materia);
        //se adiciona el array curso, de tipo curso al profesor raul
        docentes_1.setCursos(curso);
        //System.out.println(docentes_1);
        
        //Esto hace parte del reto 1.        
        Profesor docentes_2 = new Profesor("Pedro", 1200000);
        Profesor docentes_3 = new Profesor("Juan", 1755600); 
        Profesor docentes_4 = new Profesor("Paula", 1755600);
        Profesor docentes_5 = new Profesor("Raúl", 1200000);
        
        /*Se crea el ArrayList que almacenara los objetos y el ArrayLits
        que recibira los datos del metodo liquidarPrestaciones
        */
        ArrayList<Profesor> profesor_1 = new ArrayList<>();
        ArrayList<Double> liquidacion = new ArrayList<>();
        double nomina;
        //reto1, se agregan los profesores al arraylist de tipo profesor
        profesor_1.add(docentes_1);
        profesor_1.add(docentes_2);
        profesor_1.add(docentes_3);
        profesor_1.add(docentes_4);
        profesor_1.add(docentes_5);
        
        //Se envían los objetos con la información para el caculo de las prestaciones
        liquidacion = Colegio.liquidarPrestaciones(profesor_1);
        //Se imprime en pantalla el ArrayList tipo double recibido.
        System.out.println("Este es el Array tipo double de reto 1 :");
        System.out.println(liquidacion);
        //Se imprime el objeto 1 
        //System.out.println(docentes_1);
        //Se calcula la liquidación del profesor Raul
        nomina = colegio.liquidarNominaProfe(docentes_1);
        //Se imprime el resultado 
        System.out.println("\n\n\nCalculo de liquidación de nomina profesor.");
        System.out.println("Nombre profesor : " + docentes_1.getNombre());
        System.out.println("Sueldo : " + docentes_1.getSalario());
        System.out.println("Valor a pagar despues de descuentos : "+ nomina);
        
        
        
    
    }
        
}
