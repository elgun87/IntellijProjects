package String;
import java.util.*;
public class FindTheUnique {
    public static void main(String[] args){
        String str = "AAABBBCCCDEF";

        System.out.println(findTheUniqe(str));
    }

    public static String findTheUniqe(String str){
        String result = "";
        for(int i = 0;i < str.length();i++){
            int count = 0;
            for(int j = 0;j< str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                result += str.charAt(i);
            }
        }
        return result;
    }
}
