
package Vetores.vetores2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exe1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#0.00");
        String [] modelo = new String[5];
        double [] preco = new double[5];
        int i = 0;
       double frete = 500.00;
        
        for (i = 0; i < 5; i++) {
            System.out.print("Digite o Modelo do " + (i+1) + " º Veículo: ");
            modelo[i] = teclado.nextLine();
            System.out.print("Informe o Valor do Veículo R$: ");
            preco[i] = teclado.nextDouble();
            teclado.nextLine();
        }
        System.out.println();
        System.out.println("Frete no Valor de R$: 500,00");
        System.out.println("=============================");
        
            for (i = 0;  i< 5; i++) {
                System.out.println(modelo[i] + " - " + dc.format(preco[i] + frete));
        }
    }
}
