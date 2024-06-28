/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatorianumerosnaturales;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class SumatoriaNumerosNaturales {

    /**
     * @param args the command line arguments
     *
     * Programa para calcular:
     *
     * 1 + 2 + 3 + 4 + 5 + 6 + ... + n
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el límite de la sumatoria");
        int n = input.nextInt();
        while (n < 1) {//validamos que n>=1
            System.out.println("Escriba el límite de la sumatoria");
            n = input.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("La sumatoria de 1 hasta " + n + " es: " + sum);
    }

}
