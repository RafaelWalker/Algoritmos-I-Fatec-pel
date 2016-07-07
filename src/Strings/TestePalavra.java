package Strings;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class TestePalavra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanho;
        String palavra;
        
        System.out.print("Informe a palavra: ");
        palavra= teclado.nextLine();
        
        tamanho = palavra.length();
        
        for (int i = tamanho-1; i >=0; i--) {
            System.out.print(palavra.charAt(i));
        }
    }
}
