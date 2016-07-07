package Simulado2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class TesteOrdem {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[5];
        boolean ordemC = true;
        boolean ordemD = true;
        System.out.println("Informe 5 Numeros:");
        for (int i = 0; i < 5; i++) {
            num[i] = teclado.nextInt();
        }
        System.out.println("Numeros Informados:   ");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "º Número: " + num[i]);
        }

        for (int i = 0; i < 4; i++) {
            if (num[i] > num[i+1]) {
                ordemC = false;
            }
            
            if (num[i] < num[i+1]) {
                ordemD = false;
            }

        }
        if (ordemC) {
            System.out.println("Ordem Crescente");
        } else if (ordemD) {
            System.out.println("Ordem Decrescente");
        } else {
            System.out.println("Não estao em ordem");
        }
    }

}
