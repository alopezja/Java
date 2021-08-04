/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author alex
 */
public abstract class Animales {
    private String reino;
    private String genero;
    private String clase;
    
    public Animales(){}
    public Animales(String r, String g, String c)
    {
        this.reino = r;
        this.genero = g;
        this.clase = c;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
    public void Respirar(){}
    
    public void Crecer(){}
    
    
}
