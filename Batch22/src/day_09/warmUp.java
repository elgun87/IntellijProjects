package day_09;
import java.util.*;
public class warmUp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("name is : " + name + " and age is " + age);
    }
}