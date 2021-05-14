package Methods;
import java.util.*;
public class ReverseStr {
    public static void main(String[] args){
        String str = "a,b$c";
        System.out.println(reverseStrNoChar(str));

    }
    public static String reverseStrNoChar(String str){
        int len= str.length()-1;
        String result = "";

        for(int i = 0;i < str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                for(int j = len;j >= 0;j--){
                    if(Character.isLetter(str.charAt(j))){
                        result += str.charAt(j);
                        len = j-1;
                        break;
                    }
                }
            }else{
                result += str.charAt(i);
            }
        }
        return result;
    }
}
