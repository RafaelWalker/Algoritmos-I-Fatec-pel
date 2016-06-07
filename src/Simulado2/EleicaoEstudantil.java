package Simulado2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class EleicaoEstudantil {

    public static Scanner teclado = new Scanner(System.in);
    public static ArrayList<String> candidatos = new ArrayList();
    
    public static void main(String[] args) {
        MENU:
        while (true) {
            System.out.println();
            System.out.println("||=======================||");
            System.out.println("|| 1. Incluir Cadastro   ||");
            System.out.println("|| 2. Votar              ||");
            System.out.println("|| 3. Resultado          ||");
            System.out.println("|| 4. Finalizar          ||");
            System.out.println("||=======================||");
            System.out.println();
            System.out.print("Informe a Opção: ");
            int opcao = teclado.nextInt();
            teclado.nextLine();
            switch (opcao) {
                case 1:
                    incluirCandidato();
                    break;
                case 2:
                    votar();
                    break;
                case 3:
                    resultado();
                    break;
                case 4:
                    break MENU;
                default:
                    System.out.println("Valor de Menu Inválido!");
                    break;
            }
        }

    }

    public static void incluirCandidato() {

        String candidato;
        System.out.print("Informe o Nome do Candidato: ");
        candidato = teclado.nextLine();
        candidatos.add(candidato + ";0");

    }

    public static void votar() {
        String partes[];
        int cod;
        int numVotos;
        for (int i = 0; i < candidatos.size(); i++) {
            System.out.println((i + 1) + ". " + candidatos.get(i).split(";")[0]);

        }
        System.out.print("Digite o Código do Candidato: ");
        cod = teclado.nextInt();
        partes = candidatos.get(cod-1).split(";");
        numVotos = Integer.parseInt(partes[1])+1;
        candidatos.set(cod-1, partes[0]+";"+numVotos);
        
    }
    
    public static void resultado(){
        
        for (int i = 0; i < candidatos.size(); i++) {
            System.out.println((i+1) + ". " + candidatos.get(i));
        }
    }
}
