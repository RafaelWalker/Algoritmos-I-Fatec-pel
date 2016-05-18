
package Aula03;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe3 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        int anonasc;
        int anotrab;
        int idade;
        int tempotrab;
        
        System.out.print("Digite o Seu Nome: ");
        nome = teclado.nextLine();
        
        System.out.print("Digite o Ano de Nascimento: ");
        anonasc = teclado.nextInt();
        
        System.out.print("Digite o Ano que Começou a Trabalhar na Empresa: ");
        anotrab = teclado.nextInt();
        
        idade = 2016 - anonasc;
        tempotrab = 2016 - anotrab;
        
        if ((idade>=65 || tempotrab >= 30) || (idade >=60 && tempotrab>=25)){
            System.out.println("Nome: " + nome);
            System.out.println("Ano De Nascimento: " + anonasc);
            System.out.println("Ano que começou a Trabalhar: " + anotrab);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Tempo de Serviço: " + tempotrab + " anos");
            System.out.println(nome + " Você Requer Aposentadoria!");
        }
        else{
            System.out.println("Nome: " + nome);
            System.out.println("Ano De Nascimento: " + anonasc);
            System.out.println("Ano que começou a Trabalhar: " + anotrab);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Tempo de Serviço: " + tempotrab + " anos");
            System.out.println(nome + " Você não Requer Aposentadoria!");
        }
    }
}
