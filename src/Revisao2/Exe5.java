/*  Elaborar um programa que leia o valor da hora de uso de um computador em uma Lan House e
    quanto tempo um cliente o utilizou (em minutos). Informe o valor a ser pago pelo cliente (cobrar
    horas inteiras, sem tolerância).
    Valor de hora R$: 3.00
    Tempo Usado (min): 75
    Pagar R$: 6.00
*/

package Revisao2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorHora;
        double tempo;
        double pagar;
        double horas;
        DecimalFormat dc = new DecimalFormat("#0.00");
        
        System.out.print("Digite o Valor Da Hora: ");
        valorHora = teclado.nextDouble();
        System.out.print("Informe o Tempo Utilizado em (min): ");
        tempo = teclado.nextInt();
        horas = Math.ceil(tempo/60);
        pagar = valorHora * horas;
        
            System.out.println("Valor da Hora R$: " + dc.format(valorHora));
            System.out.println("Tempo Usado: " + tempo);
            System.out.println("Pagar R$: " + dc.format(pagar));
                
    }
}
