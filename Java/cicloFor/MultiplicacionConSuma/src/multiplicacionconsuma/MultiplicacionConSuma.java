/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacionconsuma;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class MultiplicacionConSuma {

    /**
     * @param args the command line arguments
     *
     * Programa para multiplicar 2 números mediante suma
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese el número 1");
        n1 = input.nextInt();
        System.out.println("Ingrese el número 2");
        n2 = input.nextInt();
        input.close();
        int sum = 0;
        for (int i = 1; i <= n2; i++) {
            sum = sum + n1;
        }
        System.out.println(n1 + "*" + n2 + "=" + sum);
    }

}
