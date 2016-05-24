package Strings;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Nome2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        String nomeprimeiro = "";
        do {
            System.out.print("Digite o Nome Completo: ");
            String nome = teclado.nextLine();
            String partes[] = nome.split(" ");
            nomeprimeiro = partes[0];
            if (partes.length != 1) {
                break;
            }
            
        } while (true);
        
        System.out.println("1° Nome: " + nomeprimeiro);

    }
}
