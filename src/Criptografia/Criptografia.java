package Criptografia;

import java.util.Scanner;

public class Criptografia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        int tam;
        int pos;
        String[] normal = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","X","Y","Z"};
        String[] cesar = {"D","E","F","G","H","I","J","K","L","M","N",
          "O","P","Q","R","S","T","U","V","X","Y","Z","A","B","C"};
        String[] atbash = {"..."};
        System.out.print("Informe a Palavra a ser Criptografada: ");
        palavra = teclado.nextLine();
        tam = palavra.length();
        String[] caracter = palavra.split("");
        
    }
}
