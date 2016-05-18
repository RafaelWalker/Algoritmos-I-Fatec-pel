/**
 * 3. Elaborar um programa que leia nome e saldo de 5 clientes de um banco. Após, listar os clientes com saldo
 * negativo. Caso nenhum cliente tenha saldo negativo, exiba “Não há clientes com saldo negativo”
 * 1º Cliente: Frederico Santos
 * Saldo R$: 180,00
 * 2º Cliente: Michele Costa
 * Saldo R$: -420,00
 * Clientes com saldo negativo
 * ------------------------------------
 * Michele Costa – R$ -420,00
 */
package Vetores;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nome = new String[5];
        double[] saldo = new double[5];
        int i = 0;
        int contaNeg = 0;

        for (i = 0; i < 5; i++) {
            System.out.print((i+1) + "º Nome: ");
            nome[i] = teclado.nextLine();
            System.out.print("Digite o Saldo: ");
            saldo[i] = teclado.nextDouble();
            teclado.nextLine();
        }
        System.out.println();
        System.out.println("Clientes com saldo Negativo: ");
        System.out.println("-----------------------------");
        for (i = 0; i < 5; i++) {
            if (saldo[i] < 0) {
                System.out.println("Nome: " + nome[i] + " - Saldo R$: " + saldo[i]);
                contaNeg++;
            }
        }
            if (contaNeg == 0) {
                System.out.println("Não há clientes com Saldo Negativo");
        }
    }
}
