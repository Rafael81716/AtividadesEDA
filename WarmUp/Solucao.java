package WarmUp;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int multiplier = sc.nextInt();
        sc.nextLine();
        String values = sc.nextLine();

        String[] stringValues = values.split(" ");

        int[] intValues = new int[stringValues.length];
        for(int i = 0; i < stringValues.length; i++){
            intValues[i] = Integer.parseInt(stringValues[i]);
        }

        int[] finalValues = new int[intValues.length];
        for(int i = 0; i < intValues.length; i++){
            finalValues[i] = intValues[i] * multiplier;
        }
        
        String output = "";
        for(int i = 0; i < finalValues.length; i++){
            output += finalValues[i] + " ";
        }

        System.out.println(output);
    }
}