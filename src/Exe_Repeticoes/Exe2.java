package Exe_Repeticoes;

import java.util.Scanner;

/**
 *PROXIMOS NUMEROS
 * @author Rafael Walker
 */
public class Exe2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um Número: ");
        int num = in.nextInt();
        for (int i = 0; i < 10; i++) {
            num = num + 1;
            System.out.println("Próximos números: " + num);
        }
    }
            
}
