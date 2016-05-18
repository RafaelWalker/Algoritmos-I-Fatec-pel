package Contadores;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int numPar=0;
        int numImpar=0;
        
        do {
            System.out.print("Digite um Numero: ");
            num = teclado.nextInt();
            if (num == 0) {
                break;
            }else{
                if (num % 2 == 0) {
                    numPar = numPar + 1;
                }else{
                    numImpar = numImpar + 1;
                }
            }
        } while (true);
        
        System.out.println("Numeros Pares: " + numPar);
        System.out.println("Numeros Impares: " + numImpar);
    }
}
