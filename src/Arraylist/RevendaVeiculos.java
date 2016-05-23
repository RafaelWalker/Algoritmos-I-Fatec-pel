package Arraylist;

/**
 *
 * @author Rafael Walker
 */
import java.util.ArrayList;
import java.util.Scanner;

public class RevendaVeiculos {

    public static Scanner entrada = new Scanner(System.in);
    public static ArrayList<String> carros = new ArrayList();

    public static void main(String[] args) {
        int opcao;
        while (true) {
            System.out.println();
            System.out.println("1. Adicionar Carros");
            System.out.println("2. Listar Carros");
            System.out.println("3. Pesquisar por Modelo");
            System.out.println("4. Pesquisar por Ano");
            System.out.println("5. Vender");
            System.out.println("6. Finalizar");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            // evita erro de leitura
            entrada.nextLine();
            if (opcao == 1) {
                adiciona();
            } else if (opcao == 2) {
                lista();
            } else if (opcao == 3) {
                pesquisaModelo();
            } else {
                break;
            }
        }
    }

    public static void adiciona() {
        System.out.println();
        System.out.print("Modelo do Carro: ");
        String modelo = entrada.nextLine();
        System.out.print("Ano do Carro: ");
        int ano = entrada.nextInt();
        carros.add(modelo + ";" + ano);
        System.out.println("Ok! Carro cadastrado na Revenda");
    }

    public static void lista() {
        System.out.println();
        System.out.println("Lista de Carros Cadastrados");
        System.out.println("------------------------------");
        System.out.println("Cód. Modelo........................ Ano:");
        System.out.println();
        for (int i = 0; i < carros.size(); i++) {
            String linha = carros.get(i);
            String partes[] = linha.split(";");
            System.out.printf("%4d %-30s %4s\n", (i + 1), partes[0], partes[1]);
        }
    }

    public static void pesquisaModelo() {
        System.out.println();
        System.out.print("Modelo: ");
        String modelo = entrada.nextLine();
        int conta = 0;
        System.out.println("Lista de Carros do Modelo: " + modelo);
        System.out.println("---------------------------------------");
        System.out.println("Cód. Modelo........................ Ano:");
        System.out.println();
        for (int i = 0; i < carros.size(); i++) {
            String linha = carros.get(i);
            String partes[] = linha.split(";");
            if (modelo.equalsIgnoreCase(partes[0])) {
                System.out.printf("%4d %-30s %4s\n", (i + 1), partes[0], partes[1]);
                conta++;
            }
        }
        if (conta == 0) {
            System.out.println("Obs.: Não há carros cadastrados deste modelo");
        }
    }

}
