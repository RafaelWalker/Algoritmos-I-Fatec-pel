package Exe_Repeticoes;

import java.util.Scanner;

/**
 * SOMA MAIOR
 * @author Rafael Walker
 */
public class Soma_maior {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num=0;
        int soma = 0;
        int maior=0;
        for (int i = 1; i < 11; i++) {
            System.out.print("Digite o " + i + " Número: ");
            if (num > maior) {
                maior = num;
            }
            num = teclado.nextInt();
            soma = soma + num;
        }
        System.out.println("A Soma dos 10 Numeros digitados é de: " + soma);
        System.out.println("O Maior Número Digitado foi o Número: " + maior);
    }
}
