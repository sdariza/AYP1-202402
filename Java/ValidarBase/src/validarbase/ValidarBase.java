/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validarbase;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class ValidarBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, x;
        boolean validarBase = false;
        while (!validarBase) {
            validarBase = true;
            System.out.println("Ingrese el número: ");
            n = input.nextInt();
            System.out.println("Ingrese la base del número");
            x = input.nextInt();
            int coc = n;
            while (coc != 0 && validarBase) {
                if (coc % 10 >= x) {
                    validarBase = false;
                }
                coc = coc / 10;
            }
        }
        System.out.println("El número sí está en la base correcta");

    }

}
