package Vetores.vetores2;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] nomes = new String[10];
        int i;
        
        for (i = 0;  i < 10; i++) {
            System.out.print((i+1) + "º Participante: ");
            nomes[i] = teclado.nextLine();
        }
        
        System.out.println();
        System.out.println("Homens");
        System.out.println("------");
        for (i = 0;  i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(nomes[i]);
            }
        }
        System.out.println();
        System.out.println("Mulheres");
        System.out.println("--------");
        for (i = 0;  i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(nomes[i]);
            }
        }
    }
}
