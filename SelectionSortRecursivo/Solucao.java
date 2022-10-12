package SelectionSortRecursivo;

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

        
        for(int i = 0; i < values.length; i++){
            int minIndex = i;
            insertionSort(values, i, minIndex);
        }
    }

    public static int[] insertionSort(int[] values, int i, int position){
        for(int j = i + 1; j < values.length; j++){
            if(values[j] < values[position]){
                position = j;
                return insertionSort(values, i, position);
            }
        }
        
        if(!sort(values)){
            swap(values, i, position);
            System.out.println(Arrays.toString(values)); 
        }
        return values;
    } 
    
    public static void swap(int[] v, int i, int j){
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
    public static boolean sort(int[] v){
        boolean output = true;
        for(int i = 0; i < v.length - 1; i++){
            if(v[i] > v[i + 1]){
                output = false;
                break;
            }
        }
        return output;
    }
}

