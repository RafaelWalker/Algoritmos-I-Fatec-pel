/**
 * 4. Elaborar um programa que leia o nome de 10 clubes. Após, liste os jogos com os clubes na ordem informada.
 * 1º Clube: Grêmio
 * 2º Clube: Botafogo
 * 3º Clube: Coritiba
 * 4º Clube: Inter
 * -
 * -
 * Jogos
 * ------------------------------------
 * Grêmio x Botafogo
 * Coritiba x Inter
 */
package Vetores;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] clubes = new String[10];
        System.out.println("A Seguir Informe o nome dos 10 Clubes.");
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º Clube: ");
            clubes[i] = teclado.nextLine();
        }
        System.out.println();
        System.out.println("----------JOGOS-----------");
        for (i = 0; i < 10; i++) {
            System.out.print(clubes[i] + " x " + clubes[i + 1]);
            i++;
            System.out.println();
        }
    }
}
