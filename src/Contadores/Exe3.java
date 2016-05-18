package Contadores;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        String nome;
        double preco;
        int qtde = 0;
        double total = 0;
        
         System.out.println("Para Encerra digite 'Fim' na Descrição");
        do {
           
            System.out.print("Digite a Descrição do Produto: ");
            nome = teclado.nextLine();
                if (nome.equalsIgnoreCase("Fim")) {
                break;
            }else{
                System.out.print("Digite o Preço do Produto: ");
                preco = teclado.nextDouble();
                qtde = qtde + 1;
                total = total + preco;
            }
                teclado.nextLine();
            
        } while (true);
            System.out.println("Quantidade de Produtos é: " + qtde + " Produtos");
            System.out.println("A Soma total dos Produtos é R$: " + df.format(total));
        
    }
}
