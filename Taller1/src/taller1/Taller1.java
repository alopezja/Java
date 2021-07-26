/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            String diasem;
            int dia=0;
            System.out.println("DÍA DE LA SEMANA");
            System.out.println("---");
            System.out.print("Escriba el día de la semana: ");
            Scanner sc = new Scanner(System.in);
            diasem = sc.next().toUpperCase();
            
            switch (diasem)
            {
                case "LUNES": dia = 1;
                break;
                case "MARTES": dia = 2;
                break;
                case "MIÉRCOLES": dia = 3;
                break;
                case "JUEVES": dia = 4;
                break;
                case "VIERNES": dia = 5;
                break;
                case "SÁBADO": dia = 6;
                break;
                case "DOMINGO": dia = 7;
                break;
                default: System.out.println("Día inválido");
                break;
            }
            if (dia>=1 && dia<=7)
            {
                System.out.println("El día "+diasem+" corresponde al "+dia+"° de la semana");
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
        
        try{
            double factura,desc=0;
            int bolita;
            System.out.println("\n---");
            System.out.println("PROMOCIÓN");
            System.out.println("---");
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite el valor de la factura del cliente: ");
            factura = sc.nextDouble();
            System.out.print("Seleccion la bolita que sacó el cliente:\n1. Blanco\n2. Verde\n3. Amarillo\n4. Azul\n5. Rojo\n>> ");
            bolita = sc.nextInt();
            
            switch (bolita)
            {
                case 1: desc = 0;
                break;
                case 2: desc = 0.1;
                break;
                case 3: desc = 0.25;
                break;
                case 4: desc = 0.5;
                break;
                case 5: desc = 1;
                break;
                default: System.out.println("No aplica el descuento");
            
            }
            if (bolita>=1 && bolita<=5)
            {
                factura = factura * (1-desc);
                System.out.println("El valor a pagar es: $"+Math.round(factura));
            }
        }
        catch(Exception e){
        System.out.println("Error");
        }
        
        try{
            int mes,dia;
            String signo="";
            System.out.println("\n---");
            System.out.println("SIGNO ZODIACAL");
            System.out.println("---");
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite el mes de nacimiento: ");
            mes = sc.nextInt();
            System.out.print("Digite el día de nacimiento: ");
            dia = sc.nextInt();
            
            
            switch (mes)
            {
                case 1: 
                    if (dia>=1 && dia<=20)
                    {
                        signo = "Capricornio";
                    }
                    else
                    {
                        signo = "Acuario";
                    }
                break;
                
                case 2:
                    if (dia>=1 && dia<=19)
                    {
                        signo = "Acuario";
                    }
                    else
                    {
                        signo = "Piscis";
                    }
                break;
                
                case 3:
                    if (dia>=1 && dia<=20)
                    {
                        signo = "Piscis";
                    }
                    else
                    {
                        signo = "Aries";
                    }
                break;
                
                case 4:
                    if (dia>=1 && dia<=20)
                    {
                        signo = "Aries";
                    }
                    else
                    {
                        signo = "Tauro";
                    }
                break;
                
                case 5:
                    if (dia>=1 && dia<=21)
                    {
                        signo = "Tauro";
                    }
                    else
                    {
                        signo = "Geminis";
                    }
                break;
                
                case 6:
                    if (dia>=1 && dia<=21)
                    {
                        signo = "Geminis";
                    }
                    else
                    {
                        signo = "Cáncer";
                    }
                break;
                
                case 7:
                    if (dia>=1 && dia<=23)
                    {
                        signo = "Cáncer";
                    }
                    else
                    {
                        signo = "Leo";
                    }
                break;
                
                case 8:
                    if (dia>=1 && dia<=23)
                    {
                        signo = "Leo";
                    }
                    else
                    {
                        signo = "Virgo";
                    }
                break;
                
                case 9:
                    if (dia>=1 && dia<=23)
                    {
                        signo = "Virgo";
                    }
                    else
                    {
                        signo = "Libra";
                    }
                break;
                
                case 10:
                    if (dia>=1 && dia<=23)
                    {
                        signo = "Libra";
                    }
                    else
                    {
                        signo = "Escorpio";
                    }
                break;
                
                case 11:
                    if (dia>=1 && dia<=22)
                    {
                        signo = "Escorpio";
                    }
                    else
                    {
                        signo = "Sagitario";
                    }
                break;
                
                case 12:
                    if (dia>=1 && dia<=21)
                    {
                        signo = "Sagitario";
                    }
                    else
                    {
                        signo = "Capricornio";
                    }
                break;
                
                default: System.out.println("El mes ingresado no aplica");
            
            }
            if (mes>=1 && mes<=12)
            {
                System.out.println("Su signo zodiacal es: "+signo);
            }
        }
        catch(Exception e){
        System.out.println("Error");
        }
        
    }
    
}
