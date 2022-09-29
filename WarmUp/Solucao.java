package WarmUp;
import java.util.Scanner;

class Solucao{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int multiplier = Integer.parseInt(sc.nextLine());
        String[] values = sc.nextLine().split(" ");
        
        String output = "";
        for(String s: values){
            output += Integer.parseInt(s) * multiplier + " ";
        }

        System.out.println(output.trim());
    }
}