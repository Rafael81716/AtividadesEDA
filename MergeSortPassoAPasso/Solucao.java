package MergeSortPassoAPasso;

import java.util.ArrayList;
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

        sort(values, 0, values.length - 1);
        System.out.println(Arrays.toString(values));
    }
    public static void sort(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex >= rightIndex){
			return;
		}

		else{
			int middle = (leftIndex + rightIndex) / 2;
			sort(array, leftIndex, middle);
			sort(array, middle + 1, rightIndex);
            
			merge(array, leftIndex, middle, rightIndex);
            Arrays.toString(array);
		}
	}
    public static void merge(int[] v, int left,int middle, int right){
		int[] helper = new int[v.length] ;
		if(v.length > 0){
			helper = Arrays.copyOf(v, v.length);
		}

		int i = left;
		int j = middle + 1;
		int k = left;
        
		while(i <= middle && j <= right){
            if(helper[i] <= helper[j]){
                v[k] = helper[i];
				i++;
                printArray(v, left, middle);
			}else{
                v[k] = helper[j];
				j++;
                printArray(v, middle + 1, right);
			}
			k++;
		}

		while(i <= middle){
            v[k] = helper[i];
			i++;
			k++;
            printArray(v, left, middle);
		}
        
		while(j <= right){
            v[k] = helper[j];
			j++;
			k++;
            printArray(v, middle + 1, right);
		}
        
	}
    public static void printArray(int[] v, int left, int right){
        ArrayList<Integer> helper = new ArrayList<Integer>();
        for(int i = left; i < right; i++){
            helper.add(v[i]);
        }
        System.out.println(helper.toString());
    }
}
