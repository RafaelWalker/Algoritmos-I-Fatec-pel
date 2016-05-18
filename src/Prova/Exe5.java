package Prova;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorParcela=0;
        System.out.print("Valor da Conta: ");
        double valorconta = teclado.nextDouble();
        System.out.print("Número de Parcelas: ");
        int numParcelas = teclado.nextInt();
        for (int i = 1; i <= numParcelas; i++) {
            valorParcela = valorconta/numParcelas;
            
            System.out.printf("Parcela " + i + " %.2f\n", valorParcela);
        }
            
        
    }
}
