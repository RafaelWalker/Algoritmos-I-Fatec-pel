package Contadores;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        int somaIdade=0;
        int media=0;
        int qtde = 0;
        
        do {
            System.out.print("Digite o nome: ");
            nome = teclado.nextLine();
                if (nome.equalsIgnoreCase("Fim")) {
                break;
            }
                    System.out.print("Digite a idade: ");
                    idade = teclado.nextInt();
                    qtde = qtde + 1;
                    somaIdade = somaIdade + idade;
                
                
                teclado.nextLine();
        } while (true);
        media = somaIdade / qtde;
        System.out.println("A Média de idade dos Jogadores é de: " + media + " anos!");
        
    }
}
