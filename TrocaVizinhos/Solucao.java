package TrocaVizinhos;

import java.util.Scanner;

public class Solucao {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] numbersString = sc.nextLine().split(" ");
        int[] numbers = new int[numbersString.length];
        for(int i = 0; i < numbersString.length; i++){
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        String output = "";
        
        troca_vizinhos(numbers);
        
        for(int s: numbers){
            output += s + " ";
        }
        System.out.println(output.trim());
        
        sc.close();
    }

    public static void troca_vizinhos(int[] v){
        if(v.length % 2 == 0){
            for(int i = 0; i < v.length; i++){
                if(i % 2 == 0){
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                }
            }
        } else {
            for(int i = 0; i < v.length - 1; i++){
                if(i % 2 == 0){
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                }
            }
        }
    }

}

/*TODO fazer os tempo de execução
 * Tempo de Execução
 * 
 * c1 = atribuição (sc =)
 * c2 = atribuição (numbers =)
 * c3 = atribuição (output = "")
 * c4 = operação aritmética (numbers.length % 2)
 * c5 = operação aritmética (c4 == 0)
 * c6 = atribuição (i = 0)
 * c7 = Avaliação de expressão booleana (i < numbers.length) * n + 1
 * c8 = atribuição e soma (i++) 
 * c9 = operação Aritmético (i % 2 == 0)
 * c10 = operador de atribuição (aux = numbers[i])
 * c11 = operador de atribuição (numbers[i] = numbers[i + 1])
 * c12 = operador de atribuição (numbers[i + 1] = aux)
 * c13 = Avaliação de expressão booleana (String s: numbers) * n + 1
 * c14 = operador de atribuição e soma (output += s + " ")
 * c15 = imprimir Variavel (System.out.println())
 * 
 * função de execução:
 * c1 + c2 + c3 + c4 + c5 + c6 + (c7 * (n + 1)) + (c8 * n) + (c9 * n) + (c10 * n) + (c11 * n) + (c12 * n) + (c13 * (n + 1)) + c14 * n + c15
 * função simplificada:
 * (c7 + c13) * (n + 1) + (c8 + c9 + c10 + c11 + c12 + c14) * n + c1 + c2 + c3 + c4 + c5 + c6 + c15
 * 
 * é um algoritmo de crescimento linear
 * 
 * 
 * Ordem de Crescimento
 * 
 * Função Teta = crescimento linear (n)
 */
