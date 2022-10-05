package VetorCircular;

import java.util.Scanner;

public class Solucao {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String[] entry = sc.nextLine().split(" ");
        int number = sc.nextInt();

        int[] entryInt = new int[entry.length];
        for(int i = 0; i < entry.length; i++){
            entryInt[i] = Integer.parseInt(entry[i]);
        }
        
        System.out.println(vetorCircular(entryInt, number));
        sc.close();
    }    
    public static String vetorCircular(int[] array, int quantidadeElementos){
        String output = "";
        int i = 0;
        while(i < quantidadeElementos){
            if(quantidadeElementos - i > array.length){
                for(int j = 0; j < array.length; j++){
                    output += array[j] + " ";
                }
                i += array.length;
            }else{
                for(int j = 0; j < quantidadeElementos - i; j++){
                    output += array[j] + " ";
                }
                i += (quantidadeElementos - i);
            }
        }
        return output.trim();
    }
}
