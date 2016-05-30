/**
 * 
 */
package Strings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Passagens {

    public static ArrayList<String> onibus = new ArrayList();
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        MENU:
        while (true) {
            System.out.println("============================");
            System.out.println(" 1. Vender Passagem       ");
            System.out.println(" 2. Poltronas Disponíveis ");
            System.out.println(" 3. Mapa do Ônibus        ");
            System.out.println(" 4. Relatório de Vendas   ");
            System.out.println(" 5. Sair             ");
            System.out.println("===========================");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();
            switch (opcao) {
                case 1:
                    comprar();
                    break;
                case 2:
                    listardisponiveis();
                    break;
                case 3:
                    mapa();
                    break;
                case 4:
                    listarcompradas();
                    break;
                case 5:
                    break MENU;
                default:
                    break;
            }
        }
    }
    public static int poltrona;

    public static void comprar() {
        System.out.println();
        System.out.print("Poltrona: ");
        String chave;
        poltrona = teclado.nextInt();
        if (poltrona > 0 && poltrona <= 40) {
            chave = String.valueOf(poltrona);
            if (onibus.contains(chave)) {
                System.out.println("Poltrona Indisponível");
            } else {
                onibus.add(chave);
                System.out.println("Poltrona Comprada!");
            }
        } else {
            System.out.println("Somente 40 Lugares");
        }
    }

    public static void listarcompradas() {
        System.out.println();
        System.out.println("Poltronas Compradas");
        System.out.println("===========================");
        for (int i = 0; i < onibus.size(); i++) {
            System.out.println(" " + onibus.get(i));
        }
        System.out.println("===========================");
    }

    public static void listardisponiveis() {
        int i;
        for (i = 1; i <= 40; i++) {
            if (onibus.contains("" + i)) {
            } else {
                System.out.println("Poltrona " + i + " Disponível");
            }
        }
    }

    public static void mapa() {
        int i;
        for (i = 1; i <= 40; i = i + 4) {
            String linha1;
            String linha2;
            String linha3;
            String linha4;

            linha1 = onibus.contains("" + i) ? "X" : "_";
            linha2 = onibus.contains("" + (i + 1)) ? "X" : "_";
            linha3 = onibus.contains("" + (i + 3)) ? "X" : "_";
            linha4 = onibus.contains("" + (i + 2)) ? "X" : "_";
            System.out.println(i + "" + linha1 + "  \t" + (i + 1) + "" + linha2 + "       \t" + (i + 3) + "" + linha3 + "  \t" + (i + 2) + "" + linha4);
        }
    }
}
