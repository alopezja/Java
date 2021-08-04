/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author alex
 */

import javax.swing.*;
public class Ventanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float prom, acum=0;
        String ventana;
        int cant_notas;
        
        ventana = JOptionPane.showInputDialog(null, "Ingrese cantidad de notas");
        cant_notas = Integer.parseInt(ventana);
        
        for (int i=1;i<=cant_notas;i++)
        {
            ventana = JOptionPane.showInputDialog(null, "Ingrese nota "+i);
            acum = acum + Float.parseFloat(ventana);
        }
        
        acum = acum / cant_notas;
        
        JOptionPane.showMessageDialog(null, "El promedio de las notas es "+acum);
    }
    
}
