/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compararnumeros;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class CompararNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese n1");
        n1 = input.nextInt();
        System.out.println("Ingrese n2");
        n2 = input.nextInt();
        System.out.println("Ingrese n3");
        n3 = input.nextInt();
        System.out.println("Ingrese n4");
        n4 = input.nextInt();
        if (n1 >= n2 && n1 >= n3 && n1 >= n4) {
            System.out.println(n1 + " Es el mayor");
        } else {
            if (n2 >= n1 && n2 >= n3 && n2 >= n4) {
                System.out.println(n2 + " Es el mayor");
            } else {
                if (n3 >= n1 && n3 >= n2 && n3 >= n4) {
                    System.out.println(n3 + " Es el mayor");
                } else {
                    System.out.println(n4 + " Es el mayor");
                }
            }
        }
        // Una mejor forma de realizar si sino anidados...
        if (n1 >= n2 && n1 >= n3 && n1 >= n4) {
            System.out.println(n1 + " Es el mayor");
        } else if (n2 >= n1 && n2 >= n3 && n2 >= n4) {
            System.out.println(n2 + " Es el mayor");
        } else if (n3 >= n1 && n3 >= n2 && n3 >= n4) {
            System.out.println(n3 + " Es el mayor");
        } else {
            System.out.println(n4 + " Es el mayor");
        }

    }

}
