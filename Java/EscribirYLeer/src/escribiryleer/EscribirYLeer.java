/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escribiryleer;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class EscribirYLeer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir en consola -- Primitiva ESC() en pseudo
        System.out.println("¡Hola mundo!");//Imprime con salto de línea al final
        System.out.print("Soy un print sin el ln");//Imprime sin salto de línea al final
        System.out.printf("\neste es el número tres %d\n", 3);//no uso + para la cadena pero debo añadir \n
        System.out.println("este es el número tres " + 3);

        int a = 1, b = 2;
        System.out.println("El valor de a es: " + a + " y el valor de b es: " + b);
        System.out.printf("El valor de a es: %d  y el valor de la varible b es: %d\n", a, b);

        //Leer de consola
        //Instanciamos la variable para tomar datos del teclado
        Scanner input = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt(); // lea edad
        System.out.println("La edad ingresa es: " + edad);

        //Calcular el área de un rectángulo.
        System.out.println("Calcular el área de un rectángulo");
        float base, altura, area;
        System.out.println("Ingrese su base");
        base = input.nextFloat();
        System.out.println("Ingrese la altura");
        altura = input.nextFloat();
        area = base * altura;
        System.out.println("El área del rectángulo con base " + base + " y altura" + altura + " es: " + area);
        System.out.printf("El área del rectángulo con base %f y altura %f es: %f\n", base, altura, area);
        input.close();// cerramos el proceso de lectura
    }

}
