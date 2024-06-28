/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatoriaprocuctoria;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class SumatoriaProcuctoria {

    /**
     * @param args the command line arguments
     *
     * Programa para calcular:
     *
     * 1/1+ 2/1 + 4/1 + 8/2 + 16/6 + 32/120 + ... + 2^n/fib(n)!
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el límite de la sumatoria");
        int n = input.nextInt();
        while (n < 1) {//validamos que n>=1
            System.out.println("Escriba el límite de la sumatoria");
            n = input.nextInt();
        }
        float sum = 0;
        int num, den;
        for (int i = 1; i <= n; i++) {
            num = (int) Math.pow(2, i - 1);// 2^(i-1)
            /*
            Calculo el fibonacci(i-1), este queda en a.
             */
            int a = 0, s = 1, t, ite = 0;
            while (ite < i - 1) {
                t = a;
                a = s;
                s = t + s;
                ite++;
            }
            //como a = fib(i-1) entonces calculamos a!
            System.out.printf("fib(%d-1)=%d\n", i, a);
            /*
                calculamos fib(i-1)! = a!
             */
            den = 1;
            for (int j = 1; j <= a; j++) {
                den = den * j;
            }
            // guardamos lo que vamos sumando...
            sum = sum + num / den;
        }
        System.out.println("La sumatoria es: " + sum);
    }

}
