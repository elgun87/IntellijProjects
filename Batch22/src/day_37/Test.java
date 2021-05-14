package day_37;
import java.util.*;
import day_38.StringUtilities;
public class Test {
    public static void main(String[] args){
        String str = "i am 33 year old";
        String digit = "";

        for(int i = 0;i < str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                digit += str.charAt(i);
            }
        }
        System.out.println(digit);

    }
}
