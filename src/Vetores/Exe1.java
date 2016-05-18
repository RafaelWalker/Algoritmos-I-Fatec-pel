/**
 * Elaborar um programa que leia nome e idade de 5 alunos.
 * após liste os alunos em 2 grupos: Maiores e menores de idade.
 * ex: 1 Aluno: Ana
 * Idade 23
 * printar ....
 * Maiores de idade:
 * ===============
 * Menores de idade:
 * ================
 */
package Vetores;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String aluno[] = new String[5];
        int idade[] = new int[5];
        int i;

        for (i = 0; i < 5; i++) {
            System.out.print((i+1) + "º Aluno: ");
            aluno[i] = teclado.nextLine();
            System.out.print("Idade do Aluno: ");
            idade[i] = teclado.nextInt();
            teclado.nextLine();
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Alunos Maiores de Idade");
        for (i = 0; i < 5; i++) {
            if (idade[i] >= 18) {
                System.out.println(aluno[i] + " " + idade[i]);
            }
        }
        System.out.println();
        System.out.println("----------------");
        System.out.println("Alunos Menores de Idade: ");
        for (i = 0; i < 5; i++) {
            if (idade[i] < 18) {
                System.out.println(aluno[i] + " " + idade[i]);
            }
        }
    }
}
