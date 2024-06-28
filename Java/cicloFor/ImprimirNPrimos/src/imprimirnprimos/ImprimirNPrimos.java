/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimirnprimos;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class ImprimirNPrimos {

    /**
     * @param args the command line arguments
     *
     * Programa para imprimos los números primos desde el 2 hasta n
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba n");
        int n = input.nextInt();
        while (n < 2) {//validamos que n>=2
            System.out.println("Escriba n");
            n = input.nextInt();
        }
        System.out.println("Números primos del 2 hasta " + n);
        System.out.print("2|");
        for (int i = 3; i <= n; i += 2) {
            int contDiv = 0;// cuenta los divisores de i
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contDiv++;
                }
            }
            if (contDiv == 2) {
                System.out.print(i + "|");
            }
        }
        System.out.println("");
    }
}
