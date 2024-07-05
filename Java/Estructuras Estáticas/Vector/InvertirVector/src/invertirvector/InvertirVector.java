/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertirvector;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class InvertirVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vec[] = new int[100], n = 0, t;
        //Leo la cantidad de elementos
        while (n <= 0 || n > 100) {
            System.out.println("Ingrese la cantidad de elementos");
            n = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese v1[" + i + "]= ");
            vec[i] = input.nextInt();
        }
        System.out.println("El vector leído es: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d|", vec[i]);
        }
        System.out.println("");
        for (int i = 0; i <= -1 + n / 2; i++) {
            t = vec[i];
            vec[i] = vec[n - i - 1];
            vec[n - i - 1] = t;
        }
        System.out.println("El vector invertido es:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d|", vec[i]);
        }
        System.out.println("");
    }

}
