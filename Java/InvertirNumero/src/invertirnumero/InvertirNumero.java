/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertirnumero;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class InvertirNumero {

    /**
     * @param args the command line arguments
     *
     * Algoritmo para invertir un número entero positivo.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, contDig = 0, numInv = 0, coc = 0;
        System.out.println("Ingrese el número");
        n = input.nextInt();
        while (n < 0) {
            System.out.println("Ingrese el número");
            n = input.nextInt();
        }
        input.close();
        // Contamos los dígitos del número.
        coc = n;
        while (coc > 0) {// coc != 0 same...
            contDig++; // contDig + 1 same...
            coc = coc / 10;
        }
        System.out.println("El número ingresado tiene " + contDig + " dígitos");
        // Nececitamos expresar el número en la forma:
        // a * 10 ^ contDig + b * 10 ^ (contDig - 1)+ ... + z * 10 ^ 0
        // Donde contDig representa las centenas, decenas, unidades, etc...
        //Invertimos el número...
        contDig--; // contDig - 1;
        coc = n;
        while (coc > 0) {
            numInv += (coc % 10) * Math.pow(10, contDig);// numInv = numInv+(coc % 10) * Math.pow(10, contDig) ;
            coc = coc / 10;
            contDig--;
        }
        System.out.println("El número invertido es: " + numInv);
    }
}
