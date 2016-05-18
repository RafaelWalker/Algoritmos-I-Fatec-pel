package Prova2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class LojaEletro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String produto;
        double preco;
        int parcela;
        double valEntrada;
        double valParcela;
        
        System.out.print("Produto: ");
        produto = teclado.nextLine();
        System.out.print("Preço R$: ");
        preco = teclado.nextDouble();
        System.out.print("Parcelas: ");
        parcela = teclado.nextInt();
        
        valEntrada = preco / 2;
        System.out.println("Entrada R$: " + valEntrada);
        
        valParcela = valEntrada / (parcela - 1);
        
            for (int i = 2; i <= parcela; i++) {
                System.out.println(i + " ParcelaR$: " + valParcela);
        }
    }
}
