package EncontraPrimeiroNegativo;

import java.util.Scanner;

public class Solucao {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] entry = sc.nextLine().split(" ");
        int[] numbers = new int[entry.length];
        int position = 0;

        for(int i = 0; i < entry.length; i++){
            numbers[i] = Integer.parseInt(entry[i]);
        }

        System.out.println(locateNegative(numbers, position));

    }

    public static String locateNegative(int[] numbers, int position){

        if(numbers[position] < 0){
            return numbers[position] + "";
        }else if(numbers.length - 1 == position){
            return "-";
        }else{
            position++;
            return locateNegative(numbers, position);
        }
    }
}
