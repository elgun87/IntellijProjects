package Loops;
import java.util.*;
public class PrintNTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String sum = "";

        while (num > 0){
            sum += "*";
            num--;
        }
        System.out.println(sum);
    }
}
