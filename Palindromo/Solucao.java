package Palindromo;

import java.util.Scanner;

public class Solucao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean output = eh_palindromo(word.toCharArray());
        System.out.println(output);
        sc.close();
    }

    public static boolean eh_palindromo(char[] palavra){
    
        String word = "";
        for (char p: palavra){
            word += p;
        }
        String inverted = new StringBuffer(word).reverse().toString();
        if(inverted.equals(word)){
            return true;
        } else {
            return false;
        }
    }
}
/*
 * Tempo de execução
 * 
 * 
 * 
 * Ordem de crescimento
 */
