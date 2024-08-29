
package semana2e;

import java.lang.Math;
public class Ejercicio1 {
/*
Enunciado: Escribe un programa que calcule la hipotenusa de un triángulo rectángulo dados los dos catetos.
    Dato:
•	Cateto 1: 9
•	Cateto 2: 12

    */
    

    public static void main(String[] args) {
       double cateto1 = 9;
        double cateto2 =12;
System.out.println("Los catetos del triangulo son " + cateto1 + " y " + cateto2);
        // Calcular la hipotenusa
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("La hipotenusa del triangulo es "+ hipotenusa);
    }
    
}
