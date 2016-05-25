package Strings;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Data {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String data;
        
        System.out.print("Digite a Data no Formato: xx/xx/xxxx:  ");
        data = teclado.nextLine();
        String partes[] = data.split("/");
        
        switch (partes[1]){
            case "01":
                System.out.println(partes[0] + " de Janeiro de " + partes[2]);
                break;
            case "02":
                System.out.println(partes[0] + " de Fevereiro de " + partes[2]);
                break;
            case "03":
                System.out.println(partes[0] + " de Março de " + partes[2]);
                break;
            case "04":
                System.out.println(partes[0] + " de Abril de " + partes[2]);
                break;
            case "05":
                System.out.println(partes[0] + " de Maio de " + partes[2]);
                break;
            case "06":
                System.out.println(partes[0] + " de Junho de " + partes[2]);
                break;
            case "07":
                System.out.println(partes[0] + " de Julho de " + partes[2]);
                break;
            case "08":
                System.out.println(partes[0] + " de Agosto de " + partes[2]);
                break;
            case "09":
                System.out.println(partes[0] + " de Setembro de " + partes[2]);
                break;
            case "10":
                System.out.println(partes[0] + " de Outubro de " + partes[2]);
                break;
            case "11":
                System.out.println(partes[0] + " de Novembro de " + partes[2]);
                break;
            case "12":
                System.out.println(partes[0] + " de Dezembro de " + partes[2]);
                break;
            default:
                System.out.println("Data Inválida!");
               
                        
        }
    }
}
