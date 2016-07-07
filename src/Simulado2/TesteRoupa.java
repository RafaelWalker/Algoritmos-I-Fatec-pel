package Simulado2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class TesteRoupa {

    public static Scanner teclado = new Scanner(System.in);
    public static ArrayList<String> roupa = new ArrayList();
    
    
    public static void main(String[] args) {
     int opcao;
     
        do {
            System.out.println("---------------------");
            System.out.println("1. Incluir Roupa     ");
            System.out.println("2. Votar Roupa       ");
            System.out.println("3. Resultado         ");
            System.out.println("4. Imprimir Roupa    ");
            System.out.println("0. Finalizar         ");
            System.out.println("---------------------");
            System.out.println();
            System.out.print("Informe a Opção Desejada: ");
            opcao = teclado.nextInt();
            teclado.nextLine();
            
            if (opcao == 1) {
                incluirRoupa();
            } else if(opcao == 2){
                votarRoupa();
            } else if (opcao == 3){
                resultado();
            } else if (opcao == 4){
                imprimiRoupa();
            } else {
                break;
            }
        } while (opcao != 9);
        
    }
    
    public static void incluirRoupa(){
        System.out.print("informe o Tipo de Roupa: ");
        String peca = teclado.nextLine();
        roupa.add(peca + ";0");
        System.out.println("Roupa Cadastrada com Sucesso!");
        
    }
    
    public static void votarRoupa(){
        System.out.println("Roupas a Votar: ");
        System.out.println("-----------------");
        for (int i = 0; i < roupa.size(); i++) {
            System.out.println((i+1) + ". " + roupa.get(i).split(";")[0]);
        }
        
        System.out.print("N. voto: ");
        int voto = teclado.nextInt();
        int votos = Integer.parseInt(roupa.get(voto-1).split(";")[1])+1;
        roupa.set(voto-1, roupa + ";" + votos);
        System.out.println("Voto Registrado!");
        
    
    }
    
    public static void resultado(){
        System.out.println("Resultado Votação:");
        System.out.println("------------------");
        System.out.println();
        for (int i = 0; i < roupa.size(); i++) {
            System.out.println(roupa.get(i).split(";")[0]);
            System.out.println(roupa.get(i).split(";")[1]);
        }
    }
    
    public static void imprimiRoupa(){
        System.out.println("Roupas Cadastradas: ");
        for (int i = 0; i < roupa.size(); i++) {
            System.out.println(roupa.get(i).split(";")[0]);
        }
    }
}
