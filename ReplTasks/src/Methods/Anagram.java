package Methods;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String str = "listen";
        String str2 = "Slenti";
        System.out.println(isAnagram(str,str2));
    }
    public static boolean isAnagram(String str,String str2){

        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i = 0;i < str.length();i++){
            if( !(str2.contains(String.valueOf(str.charAt(i)))) ){
                return false;
            }
        }
        return true;
    }
}
