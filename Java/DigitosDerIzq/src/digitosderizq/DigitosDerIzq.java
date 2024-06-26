/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitosderizq;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class DigitosDerIzq {

    /**
     * @param args the command line arguments
     *
     * Algoritmo para imprimir los dígitos de un número de derecha a izquierda.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, coc;
        System.out.println("Ingrese el número");
        n = input.nextInt();
        while (n < 0) {
            System.out.println("Ingrese el número");
            n = input.nextInt();
        }
        input.close();
        coc = n;
        while (coc != 0) {
            System.out.println("Dígito: "+coc % 10);
            coc = coc / 10;
        }
    }

}
