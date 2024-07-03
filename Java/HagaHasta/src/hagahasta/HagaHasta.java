/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hagahasta;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class HagaHasta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1, n = 10;
        do {
            System.out.println(i);
            i++;
        } while (i < n);
        /*
        Ejercicio, centro de copiado. HH.
         */
        Scanner input = new Scanner(System.in);
        int nc = 0, sw = 1;
        float gananciasT = 0, valorCompra = 0;
        do {
            while (nc <= 0) {
                System.out.println("Ingrese la cantidad de copias:");
                nc = input.nextInt();
            }
            valorCompra = nc * 300;
            if (valorCompra >= 3000 && valorCompra <= 10000) {
                valorCompra = (float) (valorCompra + valorCompra * 0.02);
            } else if (valorCompra >= 10001 && valorCompra <= 20000) {
                valorCompra = (float) (valorCompra + valorCompra * 0.05);
            } else if (valorCompra >= 20001 && valorCompra <= 30000) {
                valorCompra = (float) (valorCompra + valorCompra * 0.1);
            } else if (valorCompra > 30000) {
                valorCompra = (float) (valorCompra + valorCompra * 0.15);
            }
            gananciasT = gananciasT + valorCompra;
            nc = 0;
            System.out.println("¿Desea continuar? 1=sí, !=1=no");
            sw = input.nextInt();
        } while (sw == 1);
        input.close();
        System.out.println("Las ganacias totales son: " + gananciasT);
    }

}
