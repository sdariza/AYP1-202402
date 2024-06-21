/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parimpar;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el número");
        num = input.nextInt();
        if (num > -1) {
            if (num % 2 == 0) {
                System.out.println(num + " es par");
            } else {
                System.out.println(num + " es impar");
            }
        }
    }

}
