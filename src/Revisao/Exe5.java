package Revisao;

import java.util.Scanner;

/**
 * HORA MAIS 4
 * @author Rafael Walker
 */
public class Exe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horaInicial;
        int horaFinal;
        int duracao;
        System.out.print("Digite a hora Inicial: ");
        horaInicial = teclado.nextInt();
        System.out.print("Digite a Hora Final: ");
        horaFinal = teclado.nextInt();
        if (horaInicial < horaFinal) {
            duracao = horaInicial - horaFinal;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }
        
        System.out.println("Duração: " + duracao + " horas");
    }
}
