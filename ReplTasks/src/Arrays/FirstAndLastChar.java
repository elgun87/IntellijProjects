package Arrays;
import java.util.*;
public class FirstAndLastChar {
    public static void main(String[] args){
        String str [] = {"hello", "why", "by", "apple" , "note"};
        String str2 [] = new String [str.length];

        for(int i = 0;i < str.length;i++){
            str2[i] = str[i].substring(0,1) + str[i].substring(str[i].length()-1);
        }
        System.out.println(Arrays.toString(str2));
    }
}
