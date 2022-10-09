package PotenciaRecursiva;

import java.util.Scanner;

public class Solucao {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int position = 1;


        System.out.println(power(i, j, position, i));
    }
    public static int power(int i, int j, int position, int value) {
        if(j == 0){
            return 1;
        }else if(!(position == j)){   
            position++;
            i *= value;
            return power(i, j, position, value);
        }else{
            return i;
        }
    }
}
