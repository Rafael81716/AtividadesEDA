package SomaDois;

import java.util.Scanner;

public class Solucao {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] numbersString = sc.nextLine().split(" ");
        int result = sc.nextInt();
        int[] numbers = new int[numbersString.length];
        for(int i = 0; i < numbersString.length; i++){
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        int[] finalValue = two_sum(numbers, result);

        String output = "[" + finalValue[0] + ", " + finalValue[1] + "]";
        System.out.println(output);
        sc.close();
    }

    public static int[] two_sum(int[] v, int target){
        int[] output = new int[2];
        boolean done = false;
        for(int i = 0; i < v.length; i++){
            if(done == true){
                break;
            }
            for(int j = i; j < v.length; j++){
                if(v[i] + v[j] == target){
                    output[0] = v[i];
                    output[1] = v[j];
                    done = true;
                }
            }
        }

        return output;
    }

        

}
