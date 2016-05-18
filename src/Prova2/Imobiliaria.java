package Prova2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Imobiliaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String endereco;
        double valor;
        double taxa;
        double propr;
        
        System.out.print("Endereco: ");
        endereco = teclado.nextLine();
        System.out.print("Aluguel R$: ");
        valor = teclado.nextDouble();
        
        taxa = valor * 0.10;
        propr = valor * 0.90;
        
        System.out.println("Taxa de  Locação R$: " + taxa);
        System.out.println("Proprietário R$: " + propr);
    }
}
