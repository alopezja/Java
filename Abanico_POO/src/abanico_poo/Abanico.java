/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abanico_poo;
import java.util.*;
/**
 *
 * @author alex
 */
public class Abanico {
    
    public Abanico(){}
    
    private boolean estado;
    
    public boolean getEstado(){return this.estado;}
    public void setEstado(boolean estado) {this.estado = estado;}
    
    public void Encender()
    {
        this.setEstado(true);
        System.out.println("Encendido");
    }
    public void Apagar()
    {
        this.setEstado(false);
        System.out.println("Apagado");
    }
    
    
}
