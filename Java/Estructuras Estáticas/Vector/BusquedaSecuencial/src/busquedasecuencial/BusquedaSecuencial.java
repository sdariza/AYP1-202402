/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedasecuencial;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class BusquedaSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vec[] = new int[100], n = 0, x;
        boolean sw = false;
        //Leo la cantidad de elementos
        while (n <= 0 || n > 100) {
            System.out.println("Ingrese la cantidad de elementos");
            n = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese v1[" + i + "]= ");
            vec[i] = input.nextInt();
        }
        System.out.println("Ingrese el valor a buscar: ");
        x = input.nextInt();
        int i = 0;
        while (i < n && !sw) {
            if (vec[i] == x) {
                sw = true;
            } else {
                i++;
            }
        }
        if (sw) {
            System.out.println("Elemento encontrado en la pos: " + i);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }

}
