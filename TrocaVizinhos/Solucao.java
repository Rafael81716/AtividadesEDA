package TrocaVizinhos;

import java.util.Scanner;

public class Solucao {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        String output = "";
        
        if(numbers.length % 2 == 0){
            for(int i = 0; i < numbers.length; i++){
                if(i % 2 == 0){
                    String aux = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = aux;
                }
            }
        } else {
            for(int i = 0; i < numbers.length - 1; i++){
                if(i % 2 == 0){
                    String aux = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = aux;
                }
            }
        }
        for(String s: numbers){
            output += s + " ";
        }
        System.out.println(output.trim());

        sc.close();
    }
}

/*TODO fazer os tempo de execução
 * Tempo de Execução
 * 
 */
