package Revisao;

import java.util.Scanner;

/**
 *DESCONTO MEDICAMENTO
 * @author Rafael Walker
 */
public class Exe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do Medicamento: ");
        String medicamento = entrada.nextLine();
        System.out.print("Digite o Preço do Produto: ");
        double preco = entrada.nextDouble();
        double desconto = preco - Math.floor(preco);
        System.out.printf("Desconto de R$: %.2f\n", desconto);
        System.out.println("A Pagar R$: " + Math.floor(preco));
}
}
