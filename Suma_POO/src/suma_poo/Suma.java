/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_poo;

/**
 *
 * @author alex
 */
import java.util.*;
public class Suma {
    
    public Suma(){}
    
    private int numero1;
    private int numero2;
    private int suma;
    
    public int getNumero1(){return this.numero1;}
    public void setNumero1(int numero1) {this.numero1 = numero1;}
    
    public int getNumero2(){return this.numero2;}
    public void setNumero2(int numero2) {this.numero2 = numero2;}
    
    public int getSuma(){return this.suma;}
    public void setSuma(int numero1,int numero2) {this.suma = numero1 + numero2;}
}
