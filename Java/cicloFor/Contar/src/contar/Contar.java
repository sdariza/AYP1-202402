/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contar;

/**
 *
 * @author sdariza
 */
public class Contar {

    /**
     * @param args the command line arguments
     *
     * Programa para realizar un contar del 0 al 50000 de 5 en 5
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 50000; i += 5) {
            System.out.print(i + " ");
            if (i % 100 == 0) {
                System.out.println("");
            }
        }
    }

}
