package Revisao;

import java.util.Scanner;

/**
 *CONSUMO RACAO POR DIA
 * @author Rafael Walker
 */
public class Exe3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int peso;
        int consumo;
        System.out.print("Digite o Peso da Ração em kg : ");
        peso = teclado.nextInt();
        System.out.print("Digite o Consumo por dia em Gramas : ");
        consumo = teclado.nextInt();
        int duracao = ((peso*1000)/consumo);
        int sobra = (peso*1000) % consumo; 
        System.out.println("Duracao : " + duracao + " dias");
        System.out.println("Resto : " + sobra + " gr");
    }
}
