import java.util.Scanner;
public class Solucao {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] entry = sc.nextLine().split(" ");
        int[] entryInt = new int[entry.length];
        for(int i = 0; i < entry.length; i++){
            entryInt[i] = Integer.parseInt(entry[i]);
        }
    
        System.out.println(tem_repetido(entryInt));
        sc.close();
    }

    public static boolean tem_repetido(int[] v){
        for(int i = 0; i < v.length; i++){
            for(int j = i + 1; j < v.length; j++){
                if(v[i] == v[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

