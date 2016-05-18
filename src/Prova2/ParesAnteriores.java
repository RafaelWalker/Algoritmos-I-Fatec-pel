package Prova2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class ParesAnteriores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int soma = 0;

        System.out.print(" Número: ");
        num = teclado.nextInt();

        System.out.print("Pares Anteriores: ");
        if (num % 2 == 0) {
            num = num - 2;
        } else {
            num = num - 1;
        }
        for (int i = num; i > num - 10; i= i - 2) {
            System.out.print(i + ", ");
            soma = soma + i;
        }
        System.out.println();
        System.out.println("Soma: " + soma);
    }
}
