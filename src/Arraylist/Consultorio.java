package Arraylist;

/**
 *
 * @author Rafael Walker
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Consultorio {

    public static Scanner entrada = new Scanner(System.in);
    public static ArrayList<String> pacientes = new ArrayList();

    public static void main(String[] args) {
        int opcao;
        while (true) {
            System.out.println();
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Listar Pacientes");
            System.out.println("3. Atender");
            System.out.println("4. Finalizar");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            // evita erro de leitura
            entrada.nextLine();
            if (opcao == 1) {
                adiciona();
            } else if (opcao == 2) {
                lista();
            } else if (opcao == 3) {
                atende();
            } else {
                break;
            }
        }
    }

    public static void adiciona() {
        System.out.println();
        System.out.print("Nome do Paciente: ");
        String nome = entrada.nextLine();
        pacientes.add(nome);
        System.out.println("Ok! Paciente na fila de espera");
    }

    public static void lista() {
        System.out.println();
        System.out.println("Lista de Pacientes");
        System.out.println("-------------------------");
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println((i + 1) + ". " + pacientes.get(i));
        }
    }

    public static void atende() {
        if (pacientes.isEmpty()) {
            // ou... if (pacientes.size()==0)
            System.out.println("Não há pacientes em espera");
            return;
        }
        System.out.println();
        System.out.println("Em Atendimento: " + pacientes.get(0));
        pacientes.remove(0);
    }
}
