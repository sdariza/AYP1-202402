/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package centrocopiado;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class CentroCopiado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op = 0;
        float gananciasTotal = 0;
        while (op == 0) {
            System.out.println("Ingrese la cantidad de copias a sacar");
            int cantidadCopias = input.nextInt();
            float valorPorCliente = cantidadCopias * 300;
            if (valorPorCliente >= 3000 && valorPorCliente <= 10000) {
                valorPorCliente = (float) (valorPorCliente + valorPorCliente * 0.02);
            } else if (valorPorCliente >= 10001 && valorPorCliente <= 20000) {
                valorPorCliente = (float) (valorPorCliente + valorPorCliente * 0.05);
            } else if (valorPorCliente >= 20001 && valorPorCliente <= 30000) {
                valorPorCliente = (float) (valorPorCliente + valorPorCliente * 0.1);
            } else if (valorPorCliente > 30000) {
                valorPorCliente = (float) (valorPorCliente + valorPorCliente * 0.15);
            }
            gananciasTotal = gananciasTotal + valorPorCliente;
            System.out.println("¿Desea sacar más copias?, 0=sí, !=0 = no");
            op = input.nextInt();
        }
        input.close();
        System.out.println("Las ganacias totales son: " + gananciasTotal);
    }

}
