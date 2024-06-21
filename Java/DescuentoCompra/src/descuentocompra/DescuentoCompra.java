/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentocompra;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class DescuentoCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorCompra, valorFinal;
        System.out.println("Ingrese el valor de la compra");
        valorCompra = input.nextFloat();
        if (valorCompra >= 1000000) {
            valorFinal = (float) (valorCompra * (1 - 0.2));
        } else if (valorCompra >= 700000 && valorCompra <= 999999) {
            valorFinal = (float) (valorCompra * (1 - 0.15));
        } else if (valorCompra >= 300000 && valorCompra <= 699999) {
            valorFinal = (float) (valorCompra * (1 - 0.1));
        } else {
            valorFinal = (float) (valorCompra * (1 - 0.05));
        }
        System.out.println("El valor a pagar es: " + valorFinal);
    }

}
