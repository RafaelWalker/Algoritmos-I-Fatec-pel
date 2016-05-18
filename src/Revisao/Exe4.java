package Revisao;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double preco;
        int quantidade;
        double valorPagar;
        System.out.print("Preço do BomBom: ");
        preco = teclado.nextDouble();
        System.out.print("Digite a Quantidade: ");
        quantidade = teclado.nextInt();
        if (quantidade > 10){
             valorPagar = (preco * quantidade)-preco;
            System.out.println("Quantidade a pagar R$: " + valorPagar);
            System.out.println("1 Bombom é Brinde!");
        } else {
            valorPagar = (preco * quantidade);
            System.out.println("Qauntidade a pagar R$: " + valorPagar);
        }
    }
}
