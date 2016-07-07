package Simulado2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class LetraNome {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome;
        String partes[];
        char letra;
        int conta = 0;

        System.out.print("Nome: ");
        nome = entrada.nextLine();

        System.out.print("Letra: ");
        letra = entrada.next().charAt(0);

        partes = nome.split(" ");

        System.out.println("A letra '" + letra + "' consta em:");
        System.out.println("--------------------------");

        for (int i = 0; i < partes.length; i++) {
            // pode-se utilizar o indexOf ou o contains
            // o contains exige uma string. Então, pode converter char em
            // string usando Character.toString(char)
            // toUpperCase deixa partes e letra em maiúscula
            if (partes[i].toUpperCase().contains(Character.toString(letra).toUpperCase())) {
                System.out.println(partes[i]);
                conta++;
            }
        }

        if (conta == 0) {
            System.out.println("Obs.: Nenhuma ocorrência encontrada");
        }
    }
}
