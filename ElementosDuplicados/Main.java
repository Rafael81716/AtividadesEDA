import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] entry = sc.nextLine().split(" ");
    
        boolean retorno = false;
        for(int i = 0; i < entry.length; i++){
            for(int j = i + 1; j < entry.length; j++){
                if(entry[i].equals(entry[j])){
                    retorno = true;
                }
            }
        }

        System.out.println(retorno);
        sc.close();
    }
}