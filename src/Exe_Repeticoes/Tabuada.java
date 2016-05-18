package Exe_Repeticoes;

import java.util.Scanner;

/**
 *TABUADA
 * @author Rafael Walker
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int i;

        System.out.print("Número: ");
        num = entrada.nextInt();

        System.out.println("Tabuada do " + num);
        System.out.println("-------------------------");

        for (i = 1; i <= 10; i = i + 1) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println("--------------------------");
    }
}
