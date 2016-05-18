package Vetores.vetores2;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exe2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] num = new int[10];
        int i = 0;
            for (i = 0;  i< 10; i++) {
                System.out.print((i+1) + "º Numero: ");
                num[i] = teclado.nextInt();
        }
            System.out.println("Números ajustados ");
            for (i = 0;  i< 10; i++) {
                if (num[i] % 2 != 0) {
                    System.out.println(num[i] + 1);
                } else{
                    System.out.println(num[i]);
                }
        }
    }
}
