/*   Elaborar um programa que leia o nome e o número de gols de 2 times em uma partida.
    Informe qual o time vencedor ou se houve empate. Exiba também “Foi uma Goleada!!” se a
    diferença de gols for igual ou superior a 3 ou “Jogo Equilibrado”, caso contrário.
    1º Clube: Inter
    Gols: 1
    2º Clube: Grêmio
    Gols: 4
 */
package Revisao2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String time1;
        String time2;
        int golTime1;
        int golTime2;
        int difGols;

        System.out.print("Digite o Nome do 1 Time: ");
        time1 = teclado.nextLine();
        System.out.print("Digite o Numero de Gols do " + time1 + " :");
        golTime1 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Digite o Nome do 2 Time: ");
        time2 = teclado.nextLine();
        System.out.print("Digite o Numero de Gols do " + time2 + " :");
        golTime2 = teclado.nextInt();

        difGols = Math.abs(golTime1 - golTime2);

        if (golTime1 == golTime2) {
            System.out.println("1 Clube: " + time1);
            System.out.println("Gols: " + golTime1);
            System.out.println("2 Clube: " + time2);
            System.out.println("Gols: " + golTime2);
            System.out.println("A Partida Ficou Empatada!");
        } else if (golTime1 > golTime2) {
            System.out.println("O Clube Vencedor foi: " + time1);

        } else {
            System.out.println("O Clube Vencedor foi: " + time2);
        }
        if (difGols >= 3) {
            System.out.println("Foi Goleada!");
        } else {
            System.out.println("Jogo Equilibrado!");
        }

    }
}
