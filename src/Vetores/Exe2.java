/**
 * Elaborar um programa que leia 10 números. Após liste apenas os números pares. Informe também, quantos
 * pares foram digitados.
 */
package Vetores;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[10];
        int i = 0;
        int cont = 0;
        System.out.println("Digite 10 Números: ");
        for (i = 0; i < 10; i++) {
            System.out.print((i+1) + "º Número: ");
            num[i] = teclado.nextInt();
            if (num[i] % 2 ==0 ) {
                cont++;
            }
        }
        System.out.print("Os Números pares digitados foram: ");
        
        for (i = 0;  i< 10; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
        System.out.print("A quantidade de números pares digitadas foram: " + cont);
        System.out.println();
    }
}
