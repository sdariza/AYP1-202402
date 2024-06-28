/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatoriapotenciasde2;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class SumatoriaPotenciasDe2 {

    /**
     * @param args the command line arguments
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
            sum += Math.pow(2, i - 1);
        }
        System.out.println("El valor de la sumatoria es: " + sum);
    }

}
