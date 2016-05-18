package Exe_Condicoes;

import java.util.Scanner;

public class Exe5 {

    public static void main(String[] args) {
        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um Número ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O Número digitado foi " + numero + " E o Próximo número par é " + (numero + 2));
        } else {
            System.out.println("O Número digitado foi " + numero + " E o Próximo número par é " + (numero + 1));
        }

    }
}
