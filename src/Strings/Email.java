package Strings;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Email {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        int i;
        System.out.print("Nome do Aluno(a): ");
        nome = teclado.nextLine();
        System.out.print("Email Sugerido: ");
        String partes[] = nome.split(" ");
            for (i = 0; i < partes.length; i++) {
                System.out.print(partes[i].charAt(0));
        }
            System.out.print("@senacrs.com.br");
            System.out.println();
    }
}
