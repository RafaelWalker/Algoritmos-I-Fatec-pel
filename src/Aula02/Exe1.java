package Aula02;


import java.util.Scanner;


public class Exe1 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int numero;
        
        System.out.print("Digite um número: ");
        numero = teclado.nextInt();
        numero = numero + 1;
        
        System.out.print("Os 2 números seguintes digitados sao: " + numero);
        System.out.println(" e " + (numero + 1));
    }
}
