package Revisao;

import java.util.Scanner;

/**
 *PRECO VEICULO
 * @author Rafael Walker
 */
public class Exe1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o Modelo do Veículo: ");
        String modelo = entrada.nextLine();
        System.out.print("Digite o preço do Veículo: ");
        int preco = entrada.nextInt();
        int acrescimo = (preco*20)/100;
        System.out.println("O Modelo do Veículo é: " + modelo);
        System.out.println("O Valor do Veículo é de : " + preco);
        System.out.println("O Valor ávista é de : " + (preco -((preco*10)/100)));
        System.out.println("Parcelado em 12x ficaria uma Entrada de R$: " + (preco/2) + " e mais 12 Parcelas de R$: " + (preco/2)/12);
        System.out.println("O Valor Parcelado em 24x ficaria uma Entrada de R$: " + ((preco + acrescimo)/2) + " e mais 24 Parcelas de R: " + (((preco * 1.2)/2)/24));
    }
}
