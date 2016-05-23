/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class InvertePalavra {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        int tam;
        int i;

        System.out.print("Qual a palavra? ");
        palavra = teclado.nextLine();

        tam = palavra.length();

        System.out.print("Soletrando: ");

        for (i = tam -1; i >=0; i--) {
            System.out.print(palavra.charAt(i));
            System.out.println();
        }
    }
}
