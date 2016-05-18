
package Aula03;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        
        System.out.print("Digite o Primeiro Número: ");
        numero1 = teclado.nextInt();
        
        System.out.print("Digite o Segundo Número: ");
        numero2 = teclado.nextInt();
        
        System.out.print("Digite o Terceiro Número: ");
        numero3 = teclado.nextInt();
        
        if (numero1 < numero2 && numero1 < numero3){
            System.out.println(numero2 + numero3);
        }
        else if(numero2 < numero1 && numero2 < numero3){
            System.out.println(numero1 + numero3);
        }
        else{
            System.out.println(numero1 + numero2);
        }
      
    }
}
