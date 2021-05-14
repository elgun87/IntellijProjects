package Methods;
import java.util.*;
public class PolindromeString {
    public static void main(String[] args) {
        String word = "Ice cream";

        System.out.println(isPolindrome(word));
    }
    public static boolean isPolindrome(String str){

        str = str.toLowerCase().replace(" ","");

        for(int i = 0;i < str.length()/2;i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
