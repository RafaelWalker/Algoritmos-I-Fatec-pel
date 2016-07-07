package Simulado2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class TesteAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nome = new String[5];
        double[] nota = new double[5];
        double soma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o Nome do " + (i+1) + "º aluno: ");
            nome[i] = teclado.nextLine();
            System.out.print("Informe a nota do " + (i+1) + "º aluno: ");
            nota[i] = teclado.nextDouble();
            teclado.nextLine();
            soma = soma + nota[i];
        }
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + "º Aluno: " + nome[i] +" ");
            System.out.print("Nota: " + nota[i]+"");
            System.out.println();
        }
        System.out.println();
        double media = soma / nota.length;
        System.out.printf("A média da turma é: %.2f",media);
        
        System.out.println("Os Alunos que Obtiveram nota Maior que a Média da turma Foram: ");
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            if (nota[i] > media) {
                System.out.print(nome[i] + " ");
                System.out.print(nota[i]+ " ");
            }
            
        }
    }
}
