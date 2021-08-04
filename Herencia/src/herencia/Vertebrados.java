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
public abstract class Vertebrados extends Animales {
    
    protected int num_huesos;

    public Vertebrados() {
    }

    public Vertebrados(String r, String g, String c, int num_huesos) {
        super(r,g,c);
        this.num_huesos = num_huesos;
    }

    public int getNum_huesos() {
        return num_huesos;
    }

    public void setNum_huesos(int num_huesos) {
        this.num_huesos = num_huesos;
    }
    
    
}
