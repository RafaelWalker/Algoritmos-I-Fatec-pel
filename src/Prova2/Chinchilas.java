package Prova2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Chinchilas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int meses;
        
        System.out.print("N Inicial de Chinchilas: ");
        num = teclado.nextInt();
        System.out.print("N Meses: ");
        meses = teclado.nextInt();
        
            for (int i = 1; i <= meses; i++) {
                System.out.println(i + " mês: " + num);
                num = num * 2;
        }
    }
}
