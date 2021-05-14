package day_11;
import java.util.*;
public class IsDivisible {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = input.nextInt();
        int divisibleNum1 = 2;int divisibleNum2 = 3;int divisibleNum3 = 5;

        boolean isDivisible = (num % divisibleNum1 == 0) ? true : false;
        String report = num + " is divisible by " + divisibleNum1 + " : " + isDivisible;
        System.out.println(report);

        isDivisible = (num % divisibleNum2 == 0) ? true : false;
        report = num + " is divisible by " + divisibleNum2 + " : " + isDivisible;
        System.out.println(report);

        isDivisible = (num % divisibleNum3 == 0) ? true : false;
        report = num + " is divisible by " + divisibleNum3 + " : " + isDivisible;
        System.out.println(report);
    }
}
