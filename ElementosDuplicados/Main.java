import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String entry = sc.nextLine();
        String[] stringValues = entry.split(" ");
        int[] intArray = new int[stringValues.length];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = Integer.parseInt(stringValues[i]);
        }
        boolean retorno = false;
        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j < intArray.length; j++){
                if(intArray[i] == intArray[j] && i != j){
                    retorno = true;
                }
            }
        }

        System.out.println(retorno);
    }
}