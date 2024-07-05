/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productopuntoentredosvectores;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class ProductoPuntoEntreDosVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v1[] = new int[100];
        int v2[] = new int[100];
        int sum = 0, n = 0;
        //Leo la cantidad de elementos
        while (n <= 0 || n > 100) {
            System.out.println("Ingrese la cantidad de elementos");
            n = input.nextInt();
        }
        // Leo los vectores
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese v1[" + i + "]= ");
            v1[i] = input.nextInt();
            System.out.println("Ingrese v2[" + i + "]= ");
            v2[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + v1[i] * v2[i];
        }
        System.out.println("v1*v2 = " + sum);
    }

}
