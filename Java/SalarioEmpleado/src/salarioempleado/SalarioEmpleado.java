/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salarioempleado;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class SalarioEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tipoEmpleado;
        float ht, salario;
        System.out.println("Ingrese las horas trabajadas");
        ht = input.nextFloat();
        System.out.println("Ingrese el tipo de empleado");
        tipoEmpleado = input.nextInt();
        if (tipoEmpleado > 0 && tipoEmpleado <= 4) {
            salario = ht * 2500 + 5000;
            switch (tipoEmpleado) {
                case 1:
                    salario = salario - 3000;
                    break;
                case 2:
                    salario = salario - 2000;
                    break;
                case 3:
                    salario = salario - 1500;
                    break;
                case 4:
                    salario = salario - 1000;
                    break;
                default:
                    System.out.println("El tipo de empleado no es válido");
            }
            System.out.println("El salario a pagar es: " + salario);
        }
    }

}
