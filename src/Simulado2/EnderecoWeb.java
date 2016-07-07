package Simulado2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class EnderecoWeb {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String endereco;
        String sugestao = "";
        int tam;
        System.out.print("Endereço Web: ");
        endereco = entrada.nextLine();
        tam = endereco.length();
        // coloquei este System.out para exibir os caracteres com acentos.
        // Pelo debug, insira um BreakPoint na linha 16 e mude o endereco,
        // inserindo os acentos, ç, ...
        System.out.println("Endereço Web: " + endereco);
        // converte para minúsculas
        endereco = endereco.toLowerCase();

        for (int i = 0; i < tam; i++) {
            if (endereco.charAt(i) == 'ã' || endereco.charAt(i) == 'á'
                    || endereco.charAt(i) == 'à' || endereco.charAt(i) == 'â') {
                sugestao = sugestao + "a";
            } else if (endereco.charAt(i) == 'é' || endereco.charAt(i) == 'ê') {
                sugestao = sugestao + "e";
            } else if (endereco.charAt(i) == 'í') {
                sugestao = sugestao + "i";
            } else if (endereco.charAt(i) == 'ó' || endereco.charAt(i) == 'õ'
                    || endereco.charAt(i) == 'ô') {
                sugestao = sugestao + "o";
            } else if (endereco.charAt(i) == 'ú') {
                sugestao = sugestao + "u";
            } else if (endereco.charAt(i) == 'ç') {
                sugestao = sugestao + "c";
            } else if (endereco.charAt(i) == ' ') {
                // se espaço, não insere
            } else {
                // qualquer outro caracter é inserido na sugestão
                sugestao = sugestao + endereco.charAt(i);
            }
        }
        System.out.println("Sugestão: " + sugestao);
    }
}

