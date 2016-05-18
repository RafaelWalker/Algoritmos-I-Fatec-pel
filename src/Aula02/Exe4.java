package Aula02;


import java.util.Scanner;


public class Exe4 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double jantar;
        double taxa;
        double total;
        
        System.out.print("Jantar R$: ");
        jantar = entrada.nextDouble();
        
        taxa = jantar * 0.10;
        total = jantar + taxa;
        
        System.out.println("Taxa do Garçom R$: " + taxa);
        System.out.print("Total do Jantar R$: " + total);
    }
}
