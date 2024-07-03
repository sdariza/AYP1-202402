/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vec[] = new int[100];
        int n, sum = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Ingrese el número de elementos del vector");
            n = input.nextInt();
        } while (n < 0 || n > 99);
        // leo el vector
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese vec[%d]", i);
            vec[i] = input.nextInt();
        }
        //Imprimo el vector
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + "|");
        }
        System.out.println("");
        // calculo la suma de los elementos del vector 
        for (int i = 0; i < n; i++) {
            sum = sum + vec[i];
        }
        System.out.println("La suma de todos los elementos de vec es: " + sum);
    }

}
