
package semana2e;

import java.lang.Math;
public class Ejercicio3 {
    /*
    Enunciado: Escribe un programa que calcule el área y la circunferencia de un círculo dado su radio.

Dato:
•	Radio del círculo: 9.0

    */
    
    
    public static void main(String[] args) {
        double radio = 9;

        System.out.println("Para un círculo con radio " + radio + ":");
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El area: " + area);
       
        double circunferencia = 2 * Math.PI * radio;
         System.out.println("La circunferencia: " + circunferencia); 
        
        
       
        
    }
}
