package Exe_Repeticoes;

import java.util.Scanner;

/**
 * NUMEROS PARES
 * @author Rafael Walker
 */
public class Exe3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int num = in.nextInt();
        for (int i = 1; i < num; i++) {
            if ((i%2) == 0) {
                System.out.println("Numeros Pares: " + i);
            }
        }
    }
}
