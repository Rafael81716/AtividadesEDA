package AtividadesEDA.WarmUp;
/* 
import java.util.Scanner;

public class Solucao {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int multiplier = sc.nextInt();
        String values = sc.nextLine();

        String[] stringValues = values.split(" ");
        int[] finalValues = new int[stringValues.length];
        int[] intValues = new int[stringValues.length];

        for(int i = 0; i < intValues.length; i++){
            intValues[i] = Integer.parseInt(stringValues[i]);
        }

        for(int i = 0; i < finalValues.length; i++){
            finalValues[i] = intValues[i] * multiplier;
        }

        System.out.println(finalValues);
    }
}
*/
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Integer multiplier = sc.nextInt();
        String values = sc.nextLine();

        String[] stringValues = values.split(" ");
        int[] finalValues = new int[stringValues.length];
        int[] intValues = new int[stringValues.length];

        for(int i = 0; i < intValues.length; i++){
            intValues[i] = Integer.parseInt(stringValues[i]);
        }

        for(int i = 0; i < finalValues.length; i++){
            finalValues[i] = intValues[i] * multiplier;
        }

        System.out.println(finalValues);
    }
}
