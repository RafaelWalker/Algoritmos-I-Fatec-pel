 // Elaborar um programa que leia 2 símbolos e um número. Após, preencha o espaço indicado pelo
 // número com os símbolos, conforme o exemplo.
 // 1º Símbolo: -
 // 2º Símbolo: *
 // Número: 5
 // -*-*-

package Revisao2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String simbolo1;
        String simbolo2;
        int num;
        
        simbolo1 = teclado.nextLine();
        simbolo2 = teclado.nextLine();
        num = teclado.nextInt();
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print(simbolo1);
            }else{
                System.out.print(simbolo2);
            }
                 
        }
        System.out.println("");
    }
}
