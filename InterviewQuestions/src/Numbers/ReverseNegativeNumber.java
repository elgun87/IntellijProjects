package Numbers;
import java.util.*;
public class ReverseNegativeNumber {
    public static void main(String[] args){
        int num = -44548;
        System.out.println(reverseNum(num));
    }
    public static int reverseNum(int num){
        int digit = 0;

        while(num != 0){
            digit = digit * 10 + num % 10;
            num /= 10;
        }
        return digit * (-1);
    }
}
