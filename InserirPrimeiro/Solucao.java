package InserirPrimeiro;

import java.util.Arrays;
import java.util.Scanner;

public class Solucao {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] entry = sc.nextLine().split(" ");
        int[] values = new int[entry.length];
        for(int i = 0; i < entry.length; i++){
            values[i] = Integer.parseInt(entry[i]);
        }
        
        for(int i = 0; i < values.length; i++){
            int indexMenor = i;
            for(int j = i + 1; j < values.length; j++){
                if(values[j] < values[indexMenor]){
                    indexMenor = j;
                }
            }
            swap(values, i, indexMenor);
        }

        System.out.println(Arrays.toString(values));
    }

    public static void swap(int[] v, int i, int j){
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
