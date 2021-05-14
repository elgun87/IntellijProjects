package String_2;
import java.util.*;
public class PlusOut {
    public static void main(String[] args){
        String str = "123123";
        String word = "3";
        System.out.println(getPlusOut(str,word));
    }

    public static String getPlusOut(String str,String word){
        String result = "";
        for(int i = 0;i < str.length();i++){
            if(i == str.length()-1){
                if(str.endsWith(word)){
                    result += word;
                }else{
                    result += "+";
                }
                break;
            }else if(i + word.length() > str.length()-1 && !str.substring(i,i + word.length()).equals(word)){
                String lastStarts = "";
                for(int j = 0;j < word.length();j++){
                    lastStarts += "+";
                }
                result += lastStarts;
                break;
            }
            if(!str.substring(i,i+ word.length()).equals(word)){
                result += "+";
            }else{
                result += word;
                i += word.length()-1;
            }
        }
        return result;
    }
}
