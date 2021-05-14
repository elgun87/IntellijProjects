package ArrayPractice1;
import java.util.*;
public class MaxAndMin {
    public static void main(String[] args){
        Random anyNumber = new Random();
//        int number [] = {12,45,78,96,54,78,5,56,78,1};
        int number [] = new int[10];

        int max = 0;
        int min = 2;

        for(int i = 0;i < number.length; i++ ){

            number[i] = anyNumber.nextInt(20)+1;

            if(number[i] > max){
                max = number[i];
            }
            if(number[i] < min){
                min = number[i];
            }
            System.out.println(number[i]);
        }
        System.out.println(max + " max");
        System.out.println(min + " min");

    }
}
