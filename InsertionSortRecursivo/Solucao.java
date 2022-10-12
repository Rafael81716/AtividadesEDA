package InsertionSortRecursivo;

import java.util.Arrays;
import java.util.Scanner;

public class Solucao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entry = sc.nextLine().split(" ");
        int[] values = new int[entry.length];
        for(int i = 0; i < entry.length; i++){
            values[i] = Integer.parseInt(entry[i]);
        }

        for(int i = 1; i < values.length; i++){
            insertionSort(values, i);
        }
    }

    public static int[] insertionSort(int[] values, int j){
        while(j > 0 && values[j] < values[j - 1]){
            swap(values, j, j - 1);
            j--;
            return insertionSort(values, j);
        }
        System.out.println(Arrays.toString(values)); 
        return values;
    } 
    
    public static void swap(int[] v, int i, int j){
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
