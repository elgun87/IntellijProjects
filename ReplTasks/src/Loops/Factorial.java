package Loops;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long num1 = n;
        long sum = 0;

        for (long i = n; i > 0; i--) {
            if (i == num1) {
                sum = i * (i - 1);
            }else if(i - 1 != 0){
                sum = sum * ( i - 1);
            }
        }
        System.out.println(sum);
    }
}
