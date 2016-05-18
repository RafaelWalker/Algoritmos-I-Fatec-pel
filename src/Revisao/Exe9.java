package Revisao;

import java.util.Scanner;

/**
 *IMPRIMIR NUMERO + , PELA QTDE DE VEZES NUM
 * @author Rafael Walker
 */
public class Exe9 {

    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um Número: ");
        num = teclado.nextInt();
        if (num < 5) {
            System.out.println("Ops! Número deve ser maior ou igual a 5");
        } else {
            for (int i = 5; i <= num; i = i + 5) {
                System.out.print(i + ", ");
            }
           // System.out.println(i);
        }
    }
}
