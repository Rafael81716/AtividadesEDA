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
 * c2 = atribuição (numbersString =)
 * c3 = atribuição (numbers = )
 * c4 = atribuição (i =)
 * c5 = operação booleana (i < numbersString.length ) * n + 1
 * c6 = atribuição e soma (i++) * n
 * c7 = atribuição (numbers[i] =) * n
 * c8 = acesso de posição de array (numbersString[i]) * n
 * c9 = atribuição (output =)
 * c10 = chamada de método (troca_vizinhos(numbers))
 * c11 = operação aritmética (v.length % 2)
 * c12 = operação aritmética (c11 == 0)
 * c13 = atribuição (i = 0)
 * c14 = Avaliação de expressão booleana (i < v.length - 1) * n + 1
 * c15 = atribuição e soma (i++) * n
 * c16 = operação Aritmético (i % 2 == 0) * n
 * c17 = operador de atribuição (aux =) * n
 * c18 = acesso a posição de um array (v[i]) * n
 * c19 = operador de atribuição e acesso array (v[i] = ) * n
 * c20 = operador aritmético (v[i + 1]) * n
 * c21 = operador de atribuição (v[i + 1] = ) * n
 * c22 = Avaliação de expressão booleana (String s: numbers) * n + 1
 * c23 = operador de atribuição e soma (output += s + " ") * n
 * c24 = imprimir Variavel (System.out.println())
 * 
 * função de execução:
 * c1 + c2 + c3 + c4 + c5 * (n + 1) + c6 * n + c7 * n + c8 * n + c9 + c10 + c11 + c12 + c13 + c14 * (n + 1)+  c15 * n + c16 * n + c17 * n + c18 * n + c19 * n + c20 * n + c21 * n + c22 * (i + 1) + c23 * n + c24
 * função simplificada:
 * (c5 + c14 + c22) * (n + 1) + (c6 + c7 + c8 + c15 + c16 + c17 + c18 + c19 + c20 + c21 + c23) * n + c1 + c2 + c3 + c4 + c9 + c10 + c11 + c12 + c13 + c24
 * 
 * é um algoritmo de crescimento linear
 * 
 * 
 * Ordem de Crescimento
 * 
 * Função Teta = crescimento linear (n)
 */
