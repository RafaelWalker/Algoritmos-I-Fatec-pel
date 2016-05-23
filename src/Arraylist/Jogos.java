package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogos {
    // declara um ArrayList "global" que pode ser utilizado em todos os
    // métodos desta classe. Outra forma é passá-lo por parâmetro.

    public static ArrayList<String> clube = new ArrayList();
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        MENU:
        while (true) {
            System.out.println();
            System.out.println("1. Incluir Clube");
            System.out.println("2. Listar Clubes");
            System.out.println("3. Tabela de Jogos");
            System.out.println("4. Finalizar");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            // evita erro de leitura
            entrada.nextLine();
            // escolha (a partir) da variável opcao
            switch (opcao) {
                // caso o valor de opcao == 1
                case 1:
                    incluir();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    montarTabela();
                    break;
                case 4:
                    break MENU;
                default:
                    break;
            }
        }
    }

    public static void incluir() {
        String nome;
        System.out.println();
        System.out.print("Clube: ");
        nome = entrada.nextLine();
        clube.add(nome);
        System.out.println("Ok! Clube Cadastrado!!");
    }

    public static void listar() {
        System.out.println();
        System.out.println("Clubes Cadastrados");
        System.out.println("---------------------------");
        for (int i = 0; i < clube.size(); i++) {
            System.out.println(clube.get(i));
        }
    }

    public static void montarTabela() {

        if (clube.size() % 2 == 1) {
            System.out.println("Erro... O número de clubes deve ser par");
            return;
        }

        int ultimo = clube.size() - 1;

        System.out.println();
        System.out.println("Tabela de Jogos");
        System.out.println("---------------------------");
        for (int i = 0; i < clube.size() / 2; i++) {
            System.out.println(clube.get(i) + " x " + clube.get(ultimo - i));
        }
    }
}
