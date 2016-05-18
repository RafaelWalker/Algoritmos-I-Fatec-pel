/*
 *  RECEBA UM NUMERO EXEMPLO 5 E DECRESCER = 5,4,3,2,1, FOGO!
 */
package Revisao2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        num = teclado.nextInt();
        for (int i = num; i > 0; i--) {
            System.out.print(i + " ");
            if (i == 1) {
                System.out.println("Fogo!");
            }
        }
    }
}
