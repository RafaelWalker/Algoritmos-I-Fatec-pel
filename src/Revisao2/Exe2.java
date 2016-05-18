// Elaborar um programa que leia um número. Mostre os ímpares entre o número e 1 (decrescente).

package Revisao2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        
        num = teclado.nextInt();
        System.out.println("OS Números entre " + num + " e 1 são: ");
        for (int i = num; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            
        }
        
    }
}
