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
 * c1 = atribuição (sc = )
 * c2 = atribuição (word = )
 * c3 = atribuição (output =)
 * c4 = chamada de método (eh_polindromo()
 * c5 = atribuição (word = )
 * c6 = laço de repetição (char p: palavra) * n + 1
 * c7 = atribuição e soma (word += )
 * c8 = atribuição de variável (inverted =)
 * c9 = expressão booleana (inverted.equals(word))
 * c10 = retorno de método (return)
 * c11 = impressao de variável (System.out.println(output))
 * 
 * Função:
 * c1 + c2 + c3 + c4 + c5 + c6 * (n + 1) + c7 * n + c8 + c9 + c10 + c11
 *
 * Função Simplificada:
 * c6 * (n + 1) + c7 * n + c1 + c2 + c3 + c4 + c5 + c8 + c9 + c10 + c11
 * 
 * Ordem de crescimento:
 * Função linear de crescimento (n)
 */
