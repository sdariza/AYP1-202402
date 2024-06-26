/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitosizqder;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class DigitosIzqDer {

    /**
     * @param args the command line arguments
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
        coc = numInv;
        while (coc != 0) {
            System.out.println("Dígito: " + coc % 10);
            coc = coc / 10;
        }
    }

}
