package String;
import java.util.*;
public class SameLetters {
    public static void main(String[] args){
        String str = "abc";
        String str2 = "cba";
        System.out.println(isSameLatter(str,str2));
    }
    public static boolean isSameLatter(String str,String str2){
        boolean check = true;
        if(str.length() == str2.length()){
            for(int i = 0;i < str.length();i++){
                if(!(str2.contains(String.valueOf(str.charAt(i))))){
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}
