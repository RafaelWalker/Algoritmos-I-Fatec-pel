package Exe_Repeticoes;

import java.util.Scanner;

/**
 *IMPRIMIR ENTRE UM E NUM
 * @author Rafael Walker
 */
public class Exe1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;
        int i;

        System.out.print("Número: ");
        num = teclado.nextInt();

        System.out.println("Entre 1 e " + num);
        for (i = 1; i <= num; i = i + 1) {
            if (i < num) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
