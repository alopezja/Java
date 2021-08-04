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
public class Peces extends Vertebrados{
    
    private int aletas;

    public Peces() {
    }

    public Peces(int aletas, String r, String g, String c, int num_huesos) {
        super(r, g, c, num_huesos);
        this.aletas = aletas;
    }

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        this.aletas = aletas;
    }

    
    
    
}
