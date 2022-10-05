package TrocaVizinhos;

import java.util.Scanner;

public class Solucao2 {
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
        for(int i = 0; i < numbers.length; i++){
            if(i != numbers.length - 1){
                output += numbers[i] + ", ";
            }else{
                output += numbers[i];
            }
        }
        System.out.println("[" + output.trim() + "]\n");

        sc.close();
    }
}
