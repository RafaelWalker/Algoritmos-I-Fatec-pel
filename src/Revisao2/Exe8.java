/*  Ajustar o programa anterior para que a doação seja apenas do último dígito dos centavos,
    ou seja, não ultrapasse 9 centavos.
    Medicamento...: Aspirina
    Preço R$......: 12,43
    Pago R$.......: 20,00
    Se Doar R$....: 0,07
    Troco Seria R$: 7,50
 */
package Revisao2;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String produto;
        double preco;
        double pago;
        double trocoComCentavos;
        double centavos;
        double troco;
        double doar;
        System.out.print("Produto.......: ");
        produto = entrada.nextLine();
        System.out.print("Preço R$......: ");
        preco = entrada.nextDouble();
        System.out.print("Pago R$.......: ");
        pago = entrada.nextDouble();
        if (pago == preco) {
            System.out.println("Obrigado!");
        } else {
            trocoComCentavos = pago - preco;
            centavos = trocoComCentavos % 1;
            doar = centavos % 0.10;
            troco = trocoComCentavos - doar;
            System.out.printf("Se Doar R$....: %6.2f\n", doar);
            System.out.printf("Troco Seria R$: %6.2f\n", troco);
        }
    }
}
