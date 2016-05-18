package Aula02;


import java.util.Scanner;


public class Exe2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int dias;
        int horas;
        int total;
        
        System.out.print("Digite Quantos dias Durou a Viagem: ");
        dias = teclado.nextInt();
        System.out.print("Digite Quantas Horas durou a Viagem: ");
        horas = teclado.nextInt();
        
        total = (dias * 24) + horas;
        System.out.println("Total de Horas: " + total);
              
    }
}
