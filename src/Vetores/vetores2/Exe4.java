package Vetores.vetores2;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exe4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] filmes = new String[5];
        int[] duracao = new int[5];
        int limite;
        int i;
        int contduracao = 0;

        System.out.print("Informe o Nome de 5 Filmes e A seguir a duração: ");
        System.out.println();
        for (i = 0; i < 5; i++) {
            System.out.print((i + 1) + "º Filme: ");
            filmes[i] = teclado.nextLine();
            System.out.print("Duração do " + (i + 1) + "º Filme: ");
            duracao[i] = teclado.nextInt();
            teclado.nextLine();
        }
        System.out.print("Informe a duração limite dos Filmes: ");
        limite = teclado.nextInt();

        for (i = 0; i < 5; i++) {
            if (duracao[i] <= limite) {
                System.out.println("Filme: " + filmes[i]);

            } else {
                contduracao++;
            }

        }
        if (contduracao > 0) {
            System.out.println("Não Há Filmes com Duração Maior que " + limite + "º Minutos");
        }

    }
}
