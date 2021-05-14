package LoopPractise;
import java.util.*;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;int num1 = 0;int num2 = 0;int num3 = 0;int num4 = 0;int num5 = 0;

        while (counter <= 5) {
            System.out.println("Enter the " + counter + " number");
            if(counter == 1){
                System.out.println("Enter the " + counter + " number");
                num1 = input.nextInt();
            }else if(counter == 2){
                System.out.println("Enter the " + counter + " number");
                num2 = input.nextInt();
            }else if(counter == 3){
                System.out.println("Enter the " + counter + " number");
                num3 = input.nextInt();
            }else if(counter == 4){
                System.out.println("Enter the " + counter + " number");
                num4 = input.nextInt();
            }else if(counter == 5){
                System.out.println("Enter the " + counter + " number");
                num5 = input.nextInt();
            }
            if(counter == 5){
                if (num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5) {
                    System.out.println(num1 + " is minimum number");
                } else if (num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5) {
                    System.out.println(num2 + " is minimum number");
                } else if (num3 <= num1 && num3 <= num2 && num3 <= num4 && num1 <= num5) {
                    System.out.println(num3 + " is minimum number");
                } else if (num4 <= num1 && num4 <= num2 && num4 <= num3 && num1 <= num5) {
                    System.out.println(num4 + " is minimum number");
                } else if (num5 <= num1 && num5 <= num2 && num5 <= num3 && num5 <= num4) {
                    System.out.println(num5 + " is minimum number");
                }
            }
            if(counter == 5){
                if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {
                    System.out.println(num1 + " is maximum number");
                } else if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5) {
                    System.out.println(num2 + " is maximum number");
                } else if (num3 >= num1 && num3 >= num2 && num3 >= num4 && num1 >= num5) {
                    System.out.println(num3 + " is maximum number");
                } else if (num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5) {
                    System.out.println(num4 + " is maximum number");
                } else if (num5 >= num1 && num5 >= num2 && num5 >= num3 && num5 >= num4) {
                    System.out.println(num5 + " is maximum number");
                }
            }
            counter++;
        }
    }
}
