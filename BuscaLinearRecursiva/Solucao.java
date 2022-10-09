package BuscaLinearRecursiva;

import java.util.Scanner;

public class Solucao {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] entry = sc.nextLine().split(" ");
        int number = sc.nextInt();
        int[] numbersInt = new int[entry.length];
        for(int i = 0; i < entry.length; i++){
            numbersInt[i] = Integer.parseInt(entry[i]); 
        }

        int position = 0;
        System.out.println(search(numbersInt, number, position));
    }

    public static int search(int[] array, int number, int position){
        if(array[position] == number){
            return position;
        } else if (array.length - 1 == position){
            return -1;
        }
        else{
            position++;
            return search(array, number, position);
        }
    }
}
