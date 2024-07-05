/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambiodebaseconvector;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class CambioDeBaseConVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0, x = 0, y = 0, coc = 0, n10 = 0, i = 0, num[] = new int[100];
        boolean validarBase = false;
        while (validarBase == false) {
            validarBase = true;
            while (n <= 0) {
                System.out.println("Ingrese el número: ");
                n = input.nextInt();
            }
            while (x < 2 || x > 10) {
                System.out.println("Ingrese la base del número");
                x = input.nextInt();
            }
            coc = n;
            while (coc != 0 && validarBase) {
                if (coc % 10 >= x) {
                    validarBase = false;
                } else {
                    coc = coc / 10;
                }
            }
            if (validarBase == false) {
                n = 0;
                x = 0;
            }

        }
        while (y < 2 || y > 10) {
            System.out.println("Ingrese la base destino");
            y = input.nextInt();
        }
        coc = n;
        while (coc != 0) {
            n10 = (int) (n10 + (coc % 10) * Math.pow(x, i));
            coc = coc / 10;
            i++;
        }
        System.out.println("El número en base x=" + x + " en base 10 es: " + n10);
        coc = n10;
        i = 0;
        while (coc != 0) {
            num[i] = coc % y;
            i++;
            coc = coc / y;
        }

        for (int j = 0; j <= (i - 1) / 2; j++) {
            int t = num[j];
            num[j] = num[i - j - 1];
            num[i - j - 1] = t;
        }
        System.out.print(n + " en base " + x + " es igual a :");
        for (int j = 0; j <= (i - 1); j++) {
            System.out.print(num[j]);
        }
        System.out.print(" en base " + y);
        System.out.println("");
    }

}
