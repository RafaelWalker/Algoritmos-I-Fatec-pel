package Strings;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Nome {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o Nome Completo: ");
        String nome = teclado.nextLine();
        String partes[] = nome.split(" ");
        System.out.println("1° Nome: " + partes[0]);
        }
    }

