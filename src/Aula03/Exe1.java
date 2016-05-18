
package Aula03;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        int idade;
        double psalario;
        
        System.out.print("Digite o seu Nome: ");
        nome = teclado.nextLine();
        
        System.out.print("Digite a sua Idade: ");
        idade = teclado.nextInt();
        
        System.out.println("Digite a sua Pretensão Salárial: ");
        psalario = teclado.nextDouble();
        
        if ((idade >= 20 && idade <= 30) && (psalario >= 2000 && psalario <= 3000)){
            System.out.println(nome + " Você foi selecionado");
    } 
        else{
            System.out.println(nome + " Procure outra vaga!");
        }
            
    }
}
