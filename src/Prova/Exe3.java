package Prova;

import java.util.Scanner;

/**
 * ESTACIONAMENTO
 * @author Rafael Walker
 */
public class Exe3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor;
        double troco;
        double trinta = 0.75;
        double sessenta = 1.50;
        double centoevinte = 2.50;
        
        System.out.print("Coloque o valor de Moedas no terminal ");
        valor = teclado.nextDouble();
        if (valor >= trinta && valor < sessenta) {
            troco = valor - trinta;
            System.out.printf("Valor depositado %.2f\n", valor);
            System.out.println("Tempo: 30 Minutos");
            System.out.printf("Troco R$: %.2f\n" ,troco);
        } if (valor >= sessenta && valor < centoevinte) {
            troco = valor - sessenta;
            System.out.printf("Valor depositado %.2f\n", valor);
            System.out.println("Tempo: 60 Minutos");
            System.out.printf("Troco R$: %.2f\n" ,troco);
        } if (valor >= centoevinte) {
            troco = valor - centoevinte;
            System.out.printf("Valor depositado %.2f\n", valor);
            System.out.println("Tempo: 120 Minutos");
            System.out.printf("Troco R$: %.2f\n" ,troco);
        } else {
            System.out.println("Valor Insuficiente");
        }
        
        
    }
}
