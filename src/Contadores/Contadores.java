package Contadores;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Contadores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        int numMaiores = 0;
        int numMenores = 0;
        String confirma;
        
        System.out.println("Digite os dados ou 'Fim' no nome para Sair");
        do {
            System.out.print("Nome do Aluno: ");
            nome = teclado.nextLine();
            
            if (nome.equalsIgnoreCase("Fim")) {
                System.out.println("Confirma Saida do Sistema(S/N): ");
                confirma = teclado.nextLine();
                if (confirma.equalsIgnoreCase("S")) {
                    break;
                }else{
                    continue;
                }
            }
            
            System.out.print("Idade: ");
            idade = teclado.nextInt();
            
            if (idade >= 18) {
                numMaiores = numMaiores + 1;
            }else{
                numMenores = numMenores + 1;
            }
            
            //evia erro de leitura
            teclado.nextLine();
        } while (true);
        
        System.out.println("N. de Alunos Maiores: " + numMaiores);
        System.out.println("N de Alunos Menores: " + numMenores);
        
    }
}
