package Revisao;

import java.util.Scanner;

/**
 *INVERTER CENTENA
 * @author Rafael Walker
 */
public class Exe6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int resto;
        int centena;
        int dezena;
        int unidade;
        System.out.print("Digite Número(Centena): ");
        numero = teclado.nextInt();
        
        if (numero >= 100 && numero <= 999) {
            centena = numero/100;
            resto = numero % 100;
            dezena = resto/10;
            unidade = resto % 10;
            
            System.out.println("Invertido: "+ unidade + dezena + centena);
        } else {
            System.out.println("Ops!...Número deve ser Centena;");
        }
        
    }
}
