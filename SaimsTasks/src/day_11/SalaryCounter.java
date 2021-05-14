package day_11;
import java.util.*;
public class SalaryCounter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your salary amount");
        int salary = input.nextInt();
        System.out.println("Are you full time or not ?");
        boolean fullTime = input.nextBoolean();
        salary = (fullTime) ? salary + 2_0000 : salary - 5_000;
        System.out.println("Your final salary is " + salary);
    }
}
