package Exe_Condicoes;

import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Exe6 {

        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            int horaBrasil;
            int horaFranca;
            
            System.out.print("Hora do Brasil: ");
            horaBrasil = teclado.nextInt();
            
            horaFranca = horaBrasil + 5;
            
            if (horaFranca > 24){
                horaFranca = horaFranca - 24;
            }
            
            System.out.println("Hora na França : " + horaFranca);
    }
}
