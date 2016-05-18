package Exe_Condicoes;

import java.util.Scanner;

public class Exe2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        char sexo;
        double altura;
        double peso_ideal;

        System.out.print("Digite o Nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite o Sexo (M ou F): ");
        sexo = teclado.next().charAt(0);

        System.out.print("Digite a Sua Altura: ");
        altura = teclado.nextDouble();

        if (sexo == 'M' || sexo == 'm') {

            peso_ideal = (72.7 * altura) - 58;

            System.out.printf("Seu Peso Ideal é de : %.2f Kilos ", peso_ideal);

        } else {
            peso_ideal = (62.1 * altura) - 44.7;

            System.out.printf("Seu Peso Ideal é de : %.2f kilos ", peso_ideal);
        }

    }
}

//%0.2f
