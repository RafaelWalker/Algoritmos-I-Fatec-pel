package Criptografia;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra = teclado.nextLine();
        Criptografia.cesar(palavra);
        Criptografia.albam(palavra);  
     }
}
