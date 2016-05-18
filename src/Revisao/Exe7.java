package Revisao;

import java.util.Scanner;

/**
 *REPETIR PALAVRA QUANTIDADE NUM
 * @author Rafael Walker
 */
public class Exe7 {
    public static void main(String[] args) {
        String palavra;
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma Palavra: ");
        palavra = teclado.nextLine();
        System.out.print("Digite o Número: ");
        num = teclado.nextInt();
        for (int i = 1; i <num; i++) {    
            System.out.print(palavra + " * ");
            
        }
    }
}
