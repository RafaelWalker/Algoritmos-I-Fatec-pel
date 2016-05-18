
package Exe_Condicoes;

import java.util.Scanner;

public class Exe3 {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String produto;
        double preco;
        double parcela;
        
        System.out.print("Digite o produto: ");
        produto = teclado.nextLine();
        
        System.out.print("Digite o Preço do Produto R$: ");
        preco = teclado.nextDouble();
        
        if(preco < 100){
            System.out.println("Valor inferior a R$: 100,00 Somente Ávista! ");
        } else {
            System.out.println("O Valor do produto é de " + preco);
            System.out.println("Você poderá pagar esse valor em 3x de " + (preco/3));
        }
    }
}
