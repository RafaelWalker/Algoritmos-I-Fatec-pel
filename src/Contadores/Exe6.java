/*
    ELABORE UM PROGRMA QUE LEIA UN NÚMERO.
    EXIBA TODOS OS DIVISORES DESTE NUMERO.
    NUMERO: 21
    DIVISORES DO 21: 1,3,7,21 
*/

package Contadores;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int cont = 1;
        num = teclado.nextInt();
        System.out.println("o Número Digitado foi " + num);
        System.out.println("Os Divisores de " + num + " são: ");
            for (int i = 1; i <= num; i++) {
                if ((i%1 == 0) && (num%i == 0)) {
                    if (i != num) {
                        System.out.print(i + ", ");
                    } else{
                        System.out.print(i + " \n");
                    }
                    
                    
                }
        }
        
    }
}
