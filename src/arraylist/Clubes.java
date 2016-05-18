/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael Walker
 */
public class Clubes {
    public static Scanner teclado = new Scanner(System.in);
    public static ArrayList<String> clube = new ArrayList();
    public static void main(String[] args) {
       
        int opcao;
        
        MENU:
        while (true) {
            System.out.println();
            System.out.println("Menu Principal");
            System.out.println("------------------------");
            System.out.println("1. Adicionar Clubes");
            System.out.println("2. Listar Clubes");
            System.out.println("3. Listar Jogos");
            System.out.println("4. Finalizar");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();
            
            // ESCOLHA APARTIR DO VALOR DE OPCAO
            switch (opcao) {
                case 1:
                    Adiciona();
                    break;
                case 2:
                    Lista();
                    break;
                case 3:
                    VeJogos();
                    break;
                case 4:
                    break MENU;
                default:
                    break;
            }
        }
    }
    
    public static void Adiciona(){
        String nome;
        System.out.println();
        System.out.print("Clube: ");
        nome = teclado.nextLine();
        clube.add(nome);
        System.out.println("Ok! Clube Cadastrado!");
    
    }
    
    public static void Lista(){
        System.out.println();
        System.out.println("Lista dos Clubes Cadastrados");
        System.out.println("-------------------------------------");
        
        for (int i = 0; i < clube.size(); i++) {
            System.out.println(clube.get(i));
        }
    }
    
    public static void VeJogos(){
    
    }
}
