/*
 * ELABORE UM PROGRAMA QUE LEIA UM NÚMERO E APÓS, EXIBA:
 * - OS PARES ENTRE 1 E O NÚMERO
 * - QUANTOS PARES FORAM EXIBIDOS
 * - AS SOMAS DOS PARES
 * - NUMERO: 12
 * - PARES: 2,4,6,8,10,12
 * - QUANTIDADE: 6
 * - SOMA: 42

 */

package Contadores;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int cont=0;
        int soma = 0;
        
        num = teclado.nextInt();
        System.out.println("Os Números pares entre 1 e " + num + " são:");
            for (int i = 1; i <= num; i++) {
                if (i%2 == 0) {
                    cont = cont+1;
                    soma = soma + i;
                    if (i != num) {
                    System.out.print(i + ",");    
                    } else{
                        System.out.print(i + " ");
                    }   
                }
            } 
            System.out.println("\nA quantidade de números pares é: " + cont);
            System.out.println("A Soma dos números pares é: " + soma);
            System.out.println("O Número Digitado foi: " + num);
    }
}
