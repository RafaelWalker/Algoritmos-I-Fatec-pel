//  Elaborar um programa que leia nome, sexo e idade de um aluno. Repetir até ser digitada uma
//  aluna maior de idade. Informe quantos alunos foram anteriormente rejeitados.

package Revisao2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int cont = 0;
        String nome;
        char sexo;
        int idade;
        
        do {
            nome = teclado.nextLine();
            sexo = teclado.next().charAt(0);
            idade = teclado.nextInt();
            teclado.nextLine();
            if ((sexo == 'f') && (idade >= 18 )) {
                break;
            } else {
                cont = cont + 1;
            }
            
        } while (true);
        System.out.println("Parabens " + nome + " você foi selecionado(a)");
        System.out.println(cont + " Alunos Rejeitados");
        
        
        
    }
}
