
package semana2e;

import java.lang.Math;
public class Ejercicio2 {
    /*
    Escribe un programa que calcule la media, la desviación estándar y el rango de una serie de números.
Dato:
•	Serie de números: 10, 20, 30, 40, 50

    */
   
    
    public static void main(String[] args) {
      double n1 = 10;
        double n2 =20;
        double n3= 30;
        double n4 = 40;
        double n5 = 50;

        
        double[] numeros = {n1, n2, n3, n4, n5};
        System.out.println("los numeros son: " +n1 +", "+n2+", " +n3+" ," +n4+" ," +n5);
        int n = numeros.length;
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        double media = suma / n;
System.out.println("La Media es: " + media);
     
        double sumaCuadrados = 0;
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        double desviacionEstandar = Math.sqrt(sumaCuadrados / n);
        
 System.out.println("La desviacion estandar es: " + desviacionEstandar);
      
        double maximo = numeros[0];
        double minimo = numeros[0];
        for (double num : numeros) {
            maximo = Math.max(maximo, num);
            minimo = Math.min(minimo, num);
        }
        double rango = maximo - minimo;
        
        System.out.println("El rango es: " + rango);
    } 
}
