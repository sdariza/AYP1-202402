/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialproductoria;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class FactorialProductoria {

    /**
     * @param args the command line arguments
     *
     * Programa para calcular n!
     *
     * 1 * 2 * 3 * 4 * ... * n = n!
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el límite de la productoria");
        int n = input.nextInt();
        while (n < 1) {//validamos que n>=1
            System.out.println("Escriba el límite de la productoria");
            n = input.nextInt();
        }
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }
        System.out.println(n + "!=" + prod);
    }

}
