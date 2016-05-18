package Prova;

import java.util.Scanner;

/**
 * ETIQUETA REPETIDOR
 * @author Rafael Walker
 */
public class Exe4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Nome do produto: ");
        String nome = teclado.nextLine();
        System.out.print("Número de Etiqueta: ");
        int numero = teclado.nextInt();
        System.out.print("---------------------------");
        for (int i = 0; i < numero; i++) {
            
            if (i%2 ==0) {
                System.out.println("");
            }
            System.out.print(nome + " ");
        }
        System.out.println("");
        System.out.print("---------------------------\n");
    }
}
