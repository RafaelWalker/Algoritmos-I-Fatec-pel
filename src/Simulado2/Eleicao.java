package Simulado2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Eleicao {

    public static Scanner entrada = new Scanner(System.in);
    public static ArrayList<String> candidatos = new ArrayList();

    public static void main(String[] args) {
        int opcao;
        while (true) {
            System.out.println();
            System.out.println("Eleição - Grêmio Estudantil");
            System.out.println("----------------------------------");
            System.out.println("1. Incluir Candidato");
            System.out.println("2. Votar");
            System.out.println("3. Resultado");
            System.out.println("4. Finalizar");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();

            // evita erro nas próximas entradas de dados
            entrada.nextLine();

            if (opcao == 1) {
                incluir();
            } else if (opcao == 2) {
                votar();
            } else if (opcao == 3) {
                resultado();
            } else {
                break;
            }
        }
    }

    public static void incluir() {
        String nome;
        System.out.println();
        System.out.println("Inclusão de Candidato");
        System.out.println("-----------------------------------");
        System.out.print("Nome do Candidato: ");
        nome = entrada.nextLine();
        candidatos.add(nome + ";0");
        System.out.println("Ok! Candidato Cadastrado");
    }

    public static void votar() {
        int voto;
        String nome;
        int numVotos;

        System.out.println();
        System.out.println("Votação");
        System.out.println("-----------------------------------");
        for (int i = 0; i < candidatos.size(); i++) {
            System.out.println((i + 1) + ". " + candidatos.get(i).split(";")[0]);
        }
        System.out.println();
        System.out.print("Voto Nº: ");
        voto = entrada.nextInt();

        if (voto <= 0 || voto > candidatos.size()) {
            System.out.println("Erro... Número do Voto Inválido");
            return;
        }

        nome = candidatos.get(voto - 1).split(";")[0];
        numVotos = Integer.parseInt(candidatos.get(voto - 1).split(";")[1]) + 1;

        candidatos.set(voto - 1, nome + ";" + numVotos);
        System.out.println("Ok! Voto Registrado");
    }

    public static void resultado() {
        System.out.println();
        System.out.println("Resultado da Votação");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < candidatos.size(); i++) {
            System.out.printf("%2d. %-30s %3s Votos\n", i + 1,
                    candidatos.get(i).split(";")[0],
                    candidatos.get(i).split(";")[1]);
        }

    }
}
