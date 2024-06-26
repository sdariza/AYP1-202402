/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author sdariza
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        0,1,1,2,3,5,8,13,21,...
         */

        int a = 0, s = 1, f, i = 0, t = 0;
        while (i < 9) {
            System.out.printf("\nf(%d)=", i);
            System.out.println(a);
            t = a;
            a = s;
            s = t + s;
            i++;
        }
      
    }

}
