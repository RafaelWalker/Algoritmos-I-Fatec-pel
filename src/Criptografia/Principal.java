package Criptografia;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informa a Mensagem a ser Codificada: ");
        String palavra = teclado.nextLine().toLowerCase();
        System.out.print("Codificação Cesar: ");
        Criptografia.cesar(palavra);
        System.out.print("Codificação Albam: " );
        Criptografia.albam(palavra);  
     }
}
