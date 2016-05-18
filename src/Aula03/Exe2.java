
package Aula03;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int lado1;
        int lado2;
        int lado3;
                
            System.out.print("Digite o Valor Do Primeiro Lado: ");
            lado1 = teclado.nextInt();
            
            System.out.print("Digite o Valor Do Segundo lado: ");
            lado2 = teclado.nextInt();
            
            System.out.print("Digite o valor do Terceiro Lado: ");
            lado3 = teclado.nextInt();
            
            if((lado1 == lado2) && (lado2 == lado3)){
                System.out.println("Equilátero 3 lados iguais ");
                System.out.println(lado1);
                System.out.println(lado2);
                System.out.println(lado3);
                System.out.println("Podem formar um triângulo");
            }
            
            else if ((lado1 != lado2) && (lado1 != lado3) && (lado3 != lado2)){
                System.out.println("Escaleno 3 lados Diferentes ");
                System.out.println(lado1);
                System.out.println(lado2);
                System.out.println(lado3);
                
            }
            else{
                System.out.println("Isósceles 2 lados Iguais ");
                System.out.println(lado1);
                System.out.println(lado2);
                System.out.println(lado3);
            }
           
    }
}
