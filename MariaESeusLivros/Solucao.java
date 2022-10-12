package MariaESeusLivros;

import java.util.Scanner;

public class Solucao {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] entry = sc.nextLine().split(",");
        print(entry);
        for(int i = 1; i < entry.length; i++){
            int j = i;
            while(j > 0 && entry[j].compareTo(entry[j - 1]) < 0){
                swap(entry, j, j - 1);
                j--;
            }
            print(entry);
        }
    }
    public static void print(String[] v){
        String output = "";
        for(int i = 0; i < v.length; i++){
            if(i != v.length - 1){
                output += v[i] + ", ";
            }else{
                output += v[i];
            }
        }
        System.out.println(output);
    }
    public static void swap(String[] v, int i, int j){
        String aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
