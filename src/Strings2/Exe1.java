/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Strings2;

/**
 *
 * @author Rafael Walker
 */
public class Exe1 {
    public static void main(String[] args) {
        int x = 2;
         int []num =  new int[4];
        for (int i = 0; i <= 4; i++) {
            num[i] = i * x;
            x = x + 2;
        }
        
        for (int i = 0; i <= 4; i++) {
            System.out.println(num[i]);
        }
    }
}
