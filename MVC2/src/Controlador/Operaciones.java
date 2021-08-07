/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Numeros;

/**
 *
 * @author alex
 */
public class Operaciones {
    
    public Numeros sumar (Numeros n)
    {
        n.setRes(n.getN1()+n.getN2());
        return n;
    }
    
    public Numeros restar (Numeros n)
    {
        n.setRes(n.getN1()-n.getN2());
        return n;
    }
    
    public Numeros multiplicar (Numeros n)
    {
        n.setRes(n.getN1()*n.getN2());
        return n;
    }
    
    public Numeros dividir (Numeros n)
    {
        n.setRes(n.getN1()/n.getN2());
        return n;
    }
    
}
