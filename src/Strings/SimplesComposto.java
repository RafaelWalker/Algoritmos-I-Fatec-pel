package Strings;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */

public class SimplesComposto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um Nome: ");
        String nome = teclado.nextLine();
        String linha = nome;
        String partes[] = linha.split(" ");
        
        if (partes.length > 1) {
            System.out.println("Nome: " + nome);
            System.out.println("Nome é Composto");
        } else {
            System.out.println("Nome: " + nome);
            System.out.println("Nome é simples");
        }
    }
}
