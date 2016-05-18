package Vetores;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class ListaProdutos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String produto[] = new String[5];
        double preco[] = new double[5];
        double total = 0;
        int i;
        
        for (i = 0; i < 5; i++) {
            System.out.print((i + 1) + " Produto: ");
            produto[i] = teclado.nextLine();
            
            System.out.print("Preço R$: ");
            preco[i] = teclado.nextDouble();
            
            total = total + preco[i];
            
            // evita erro de leitura
            teclado.nextLine();
        }
        
        System.out.println();
        System.out.println("Lista de Compras");
        System.out.println("=================================");
        
        for (i = 0;  i < 5; i++) {
            System.out.printf(produto[i] + " - R$: %.2f \n", preco[i]);
        }
        System.out.println("================================");
        System.out.printf("Total R$: %.2f \n", total);
    }
}
