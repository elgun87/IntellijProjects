package day_37;
import java.util.*;
public class WarmUp {
    public static void main(String[] args) {
        System.out.println(sum(1, 3));
        System.out.println(sum(1, 3));
        System.out.println(sum(1, 3, 5));
        System.out.println(sum("Hello", "Wordl"));


        printNames("wordl","my city","baku");
    }

    public static void printNames(String ... str){
        for(String each : str){
            System.out.println("hello " + each);
        }
    }

    public static int sum(int num1, int num2 ) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double sum(int num1, int num2, double num3) {
        return num1 + num2 - num3;
    }

    public static String sum(String str, String str2) {
        return str + " " + str2;
    }

}
