package ArrayPractice1;
import java.util.*;
public class ArrayOfNumbers {
    public static void main(String[] args){
        int numbers[] = new int [100];
        int count = 1;
        while(count < 100){
            numbers[count] = count;
            count ++;
        }

        for(int num:numbers){
            System.out.print(num + " ");
        }

    }
}
