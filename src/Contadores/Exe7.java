/*
NUMERO: 13
13 É PRIMO
NUMERO: 15
15 NÃO É PRIMO
*/
package Contadores;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        num = teclado.nextInt();
            if ((num % 1 == 0) && (num % num == 0)) {
                System.out.println(num + " é um número Primo!");
        } else {
                System.out.println(num + " não é um número Primo!");
            }      
}
}
