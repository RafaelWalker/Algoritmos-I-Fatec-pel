package Prova;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * CALCULAR SALARIO MAIS BENEFICIO DE 5 EM 5
 * @author Rafael Walker
 */
public class Exe2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double salario;
        int tempo;
        int taxa;
        double beneficio;
        double salarioFinal;
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.print("Nome: ");
        nome=teclado.nextLine();
        System.out.print("Salário: ");
        salario=teclado.nextDouble();
        System.out.print("Tempo(anos): ");
        tempo=teclado.nextInt();
        
        if (tempo < 5) {
            salarioFinal = salario;
        } else {
            taxa = (tempo / 5) * 5;
            beneficio = salario * ((double)taxa / 100);
            salarioFinal = salario + beneficio;
            System.out.println("Taxa: " + taxa + "%");
            System.out.println("Beneficio R$: " + df.format(beneficio));
        }
        System.out.println("Salário Final R$: " + df.format(salarioFinal));
        
        
    }
}
