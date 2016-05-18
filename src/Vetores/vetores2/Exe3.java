package Vetores.vetores2;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exe3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] aluno = new String[5];
        double [] nota = new double[5];
        int i = 0;
        System.out.println("Informar Nome e nota ");
            for (i = 0;  i< 5; i++) {
                System.out.print((i+1) + "º Aluno: ");
                aluno[i] = teclado.nextLine();
                System.out.print((i+1) + " º Nota: ");
                nota[i] = teclado.nextDouble();
                teclado.nextLine();
        }
            System.out.println();
            System.out.println("Resultados: ");
            
            for (i = 0;  i< 5; i++) {
                if (nota[i] >= 7) {
                    System.out.println(aluno[i] + " Aprovado(a)");
                } else {
                    System.out.println(aluno[i] + " Reprovado(a)");
                }
        }
    }
}
