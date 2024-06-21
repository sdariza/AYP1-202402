/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaderectangulo;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class AreaDeRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float nota1, nota2, nota3, promedio;
        System.out.println("Ingrese la nota 1");
        nota1 = input.nextFloat();
        System.out.println("Ingrese la nota 2");
        nota2 = input.nextFloat();
        System.out.println("Ingrese la nota 3");
        nota3 = input.nextFloat();
        input.close();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio de las 3 notas es: " + promedio);
    }

}
