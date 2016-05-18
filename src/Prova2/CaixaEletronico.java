package Prova2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor;

        System.out.print("Valor R$: ");
        valor = teclado.nextDouble();

        if (valor % 10 == 0) {
            System.out.println(valor + " é multiplo de 10");
            System.out.println("Você irá receber " + (valor / 10) + " notas de 10");
        } else {
            System.out.println("Valor Inválido!");
        }
    }
}
