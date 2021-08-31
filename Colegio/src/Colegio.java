
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class Colegio {
    
    ArrayList <Profesor> profesores = new ArrayList <>();
    
    public static ArrayList<Double> liquidarPrestaciones (ArrayList<Profesor>profesores){
    ArrayList <Double> Obj_profesor = new ArrayList <Double>();
    for (int i=0; i<profesores.size();i++){
        if (profesores.get(i)==null){
        return Obj_profesor;
}else {
    double primaDeServicio=profesores.get(i).getSalario()*8.33/100;
    double cesantias=profesores.get(i).getSalario()*8.33/100;
    double intdeCesantias=(cesantias*12)/100;
    double vacaciones=profesores.get(i).getSalario()*4.16/100;
    double liquidacion=primaDeServicio+cesantias+intdeCesantias+vacaciones;
    Obj_profesor.add(liquidacion);
    System.out.println("Cesantias: "+"Nombre: "+profesores.get(i)+"\n Liquidación: "+liquidacion);
        }

    
    }
return Obj_profesor;
}

    public static double liquidarNominaProfe(Profesor profesor)
    {
       int materias, bono; 
       double nominaTotal,prestaciones,nominaNeta;
       
       materias= profesor.getCursos().size();
       bono = 180000*(materias-1);
       nominaTotal =profesor.getSalario()+bono;
       prestaciones=(nominaTotal*8)/100;
       nominaNeta =nominaTotal-prestaciones;
       
        System.out.println("Nómina a pagar: "+nominaNeta);
        
       return nominaNeta; 
}
    
   public static ArrayList <Double> liquidarSegSocial (ArrayList<Profesor> profesores){
      ArrayList <Double> Obj_profesor2 = new ArrayList <Double>();
      //liquidarNominaProfe liquidar = new liquidarNominaProfe();

    for (int i=0; i<profesores.size();i++){
        if (profesores.get(i)==null){
        return Obj_profesor2;

}else {
    int curso = profesores.get(i).getCursos().size();
    double bono = (curso-1)*180000;
    double totalSalario = profesores.get(i).getSalario() + bono;
    double salud=totalSalario*8.5/100;
    double pension=totalSalario*12/100;
    double riesgosLaborales=totalSalario*0.522/100;
    
    double seguridadSocial=salud+pension+riesgosLaborales;
    Obj_profesor2.add(seguridadSocial);
    //double totalSegSocial = totalSalario-;
    System.out.println("Cesantias: "+"Nombre: "+profesores.get(i)+"\n Seguridad Social: "+seguridadSocial);
        
        }
       
}
return Obj_profesor2;
 }

    public static void contratarProfe(){

    }

    public ArrayList <Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    
}
