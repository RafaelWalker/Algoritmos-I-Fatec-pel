package Exe_Condicoes;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;
        double raiz;

        System.out.print("Número: ");
        num = teclado.nextInt();

        raiz = Math.sqrt(num);

        if (Math.floor(raiz) == raiz) {
            System.out.println("Raiz é: " + raiz);
        } else {
            System.out.println("Não há Raiz exata para " + num);
        }

    }
}
