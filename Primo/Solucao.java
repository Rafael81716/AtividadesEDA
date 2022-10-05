package Primo;

import java.util.Scanner;

public class Solucao {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(eh_primo(number));
        sc.close();
    }
    public static boolean eh_primo(int n){
        boolean output = false;
        int count = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 1){
            output = true;
        }

        return output;
    }

}
