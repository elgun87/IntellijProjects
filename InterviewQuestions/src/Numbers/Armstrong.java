package Numbers;
import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        int num = 1634;
        System.out.println(isArmstrong(num));
    }
    public static boolean isArmstrong(int num){
        //Only converted num to string here just to find the how many digits it has so i can use in loop
        String numInString = String.valueOf(num);
        int len = numInString.length();
        if(numInString.length() <= 1){
            len++;
        }

        int sum = 0;
        int num2 = num;

        while(num2 != 0){
            int remainder = num2 % 10;
            int n = 1;
            for(int i = 0;i < len ;i++){
                n *= remainder;
            }
            sum += n;
            num2 /= 10;
        }
        if(sum == num){
            return true;
        }else{
            return false;
        }
    }
}
