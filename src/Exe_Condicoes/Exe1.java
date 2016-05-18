package Exe_Condicoes;

import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int anonasc;
        int idade;

        System.out.print("Digite o Seu Nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite o Ano de Nascimento: ");
        anonasc = teclado.nextInt();

        idade = 2016 - anonasc;

        if (idade >= 18) {
            System.out.print(nome + " Você tem " + idade + " anos e é Maior de Idade! \n");
        } else {
            System.out.print(nome + " Você tem " + idade + " anos e é Menor de Idade! \n");
        }

    }
}
