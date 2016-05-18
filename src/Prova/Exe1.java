package Prova;

import java.util.Scanner;

/**
 * PALAVRAS ACRESCENTAR 0.50 PO PALAVRA DEPOIS DE 20
 * @author Rafael Walker
 */
public class Exe1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.print("Digite o numero de palavras: ");
        num = teclado.nextInt();
        double valor = 8.00;
        if (num <=20){
            System.out.println("Numero de Palavras: " + num);
            System.out.printf("Valor R$: %.2f\n", valor);
        } else if (num > 20){
        for (int i = 20; i < num; i++) {
            valor = valor + 0.50;
            
            }
            System.out.println("Palavras " + num);
            System.out.printf("Valor %.2f\n", valor);
        }
        
    }
}
