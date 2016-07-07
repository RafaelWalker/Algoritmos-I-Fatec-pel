package Simulado2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Ordem {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num[] = new int[5];
        // exemplo de uso de variáveis boolean
        // recebem valores true ou false
        // Obs.: também poderíamos usar variáveis inteiras (contadores)
        boolean ordemC = true;
        boolean ordemD = true;

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "º Número: ");
            num[i] = entrada.nextInt();
        }

        System.out.print("Os Números Informados: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(num[i] + ", ");
        }

        System.out.println();

        // for até 4, pois compara-se o elemento i do vetor com o elemento i+1
        for (int i = 0; i < 4; i++) {
            // se o primeiro for maior que o segundo (e assim sucessivamente)
            // então, ordemC recebe false
            if (num[i] > num[i + 1]) {
                ordemC = false;
            }
            // se o primeiro for menor que o segundo (e assim sucessivamente)
            // então, ordemD recebe false
            if (num[i] < num[i + 1]) {
                ordemD = false;
            }
        }

        if (ordemC) {
            System.out.println("Os números estão em ordem crescente");
        } else if (ordemD) {
            System.out.println("Os números estão em ordem decrescente");
        } else {
            System.out.println("Os números não estão em ordem");
        }
    }
}
