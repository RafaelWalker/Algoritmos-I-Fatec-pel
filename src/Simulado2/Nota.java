package Simulado2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Nota {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome[] = new String[5];
        double nota[] = new double[5];
        double soma = 0;
        double media;

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "º Aluno: ");
            nome[i] = entrada.nextLine();
            System.out.print("Nota: ");
            nota[i] = entrada.nextDouble();
            entrada.nextLine();
            soma = soma + nota[i];
        }
        media = soma / nome.length;

        System.out.println();
        System.out.printf("Média da Turma: %4.1f\n", media);
        System.out.println();
        System.out.println("Alunos com Notas Acima da Média");
        System.out.println("------------------------------------");

        for (int i = 0; i < 5; i++) {
            if (nota[i] > media) {
                System.out.println(nome[i] + " - " + nota[i]);
            }
        }
    }
}
