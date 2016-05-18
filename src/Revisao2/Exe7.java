/*  Uma rede de Farmácias está propondo aos seus clientes doarem os centavos do troco de
    uma compra para uma entidade filantrópica. Elabore um programa que leia descrição, preço
    e o valor pago pelo cliente. Informe os centavos que poderiam ser doados e o troco do
    cliente. Se pagamento for exato exiba apenas “Obrigado”.
    Medicamento...: Aspirina
    Preço R$......: 12,43
    Pago R$.......: 20,00
    Se Doar R$....: 0,57
    Troco Seria R$: 7,00
*/

package Revisao2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String descricao;
        double preco;
        double valorPago;
        double centavos;
        double troco;
        double trococomcentavos;
        DecimalFormat dc = new DecimalFormat("#0.00");
        
        System.out.print("Digite a Nome do Medicamento: ");
        descricao = teclado.nextLine();
        System.out.print("Digite o Preço do Medicamento: ");
        preco = teclado.nextDouble();
        System.out.print("Digite o Valor Pago pelo Cliente: ");
        valorPago = teclado.nextDouble();
        
            if (valorPago == preco) {
                System.out.println("Obrigado!");
        } else {
                trococomcentavos = valorPago - preco;
                troco = Math.floor(trococomcentavos);
                centavos = trococomcentavos - troco;
                System.out.println("Se doar: " + dc.format(centavos));
                System.out.println("Troco seria de: " + dc.format(troco));
            }
        
    }
}
