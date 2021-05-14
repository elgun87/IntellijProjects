package String;
import java.util.*;
public class SumOfDigit {
    public static void main(String[] args){
        String str = "Hello i have 601 apple and 5 peach";
        System.out.println(sum(str));
    }
    public static int sum(String str){
        int sum = 0;
        String digit = "";
        for(int i = 0;i < str.length();i++){
            boolean isDigit = Character.isDigit(str.charAt(i));
            if(isDigit){

                digit += str.charAt(i);
            }
            if(isDigit && !digit.isEmpty()){
                int num = Integer.valueOf(digit);
                sum += num;
                digit = "";
            }
        }
        return sum;
    }
}
