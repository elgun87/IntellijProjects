package ArrayPractice2;
import java.util.*;
public class LongestPolindrome {
    public static void main(String[] args) {
        String str [] = {"java","longer word","civic","apple","racecar","mom","anna"};
        String polindrome = "";
        int biggest = 0;
        boolean isPolindrome = false;
        for(int i = 0;i < str.length;i++){
            if(str[i].charAt(0) == str[i].charAt(str[i].length()-1)){
                if(str[i].length() > biggest){
                    biggest = str[i].length();
                    polindrome = str[i];
                }
                isPolindrome = true;
            }
        }
        if(!isPolindrome){
            System.out.println("No polindrome");
        }else{
            System.out.println("The biggest polindrome is " + polindrome);
        }
    }
}
