package String;
import java.util.*;
public class SumOfDigitUpdated {
    public static void main(String[] args) {
        String str = "i have 510 book and 34 pen";
        int sum = 0;
        String digit = "";
        for(int i = 0;i < str.length();i++){

           if( Character.isDigit(str.charAt(i))){
               digit += str.charAt(i);
           }
           if(Character.isDigit(str.charAt(i)) && !Character.isDigit(str.charAt(i+1))){

               sum += Integer.parseInt(digit);
               digit = "";
           }
        }
        System.out.println(sum);
    }
}
