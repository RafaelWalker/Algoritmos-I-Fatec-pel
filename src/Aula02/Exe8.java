
package Aula02;

import java.util.Scanner;


public class Exe8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String produto;
        double preco;
        double leve2;
        
        System.out.print("Produto: ");
        produto = entrada.nextLine();
        
        System.out.print("Preço R$: ");
        preco = entrada.nextDouble();
        
        // Math.floor: arredonda o número
        leve2 = Math.floor(preco * 2);
        
        System.out.println("Leve 2 por apenas R$: " + leve2);
        
        
    }
}
