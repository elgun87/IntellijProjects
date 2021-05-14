package Arrays;
import java.util.*;
public class AnalyzeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int num = input.nextInt();
        int list [] = new int[num];
        int sum = 0;
        int count = 0;

        System.out.println("Enter the numbers:");
        for(int i = 0;i < list.length;i++){
            list[i] = input.nextInt();
            sum += list[i];
        }
        int average = sum / list.length;

        for(int i = 0;i < list.length;i++){

        }

    }
}
