package Exe_Condicoes;

import java.util.Scanner;


public class Exe4 {
    
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        numero = teclado.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("O Número Informado " + numero + " é par! ");
        }
        
        else{
            System.out.println("O Número Informado " + numero + " é ímpar! ");
        }
    }
}
