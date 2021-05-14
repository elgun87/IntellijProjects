package Methods;
import java.util.*;
public class MergeString {
    public static void main(String[] args){
        String str1 = "java";String str2 = "selenium";
        String report = stringMergeVersion2(str1,str2);
        System.out.println(report);
    }
    public static String stringMergeVersion2(String str1,String str2){
        String result = "";
        int index = 0;
        while(str1.length() > 0 || str2.length() > 0){
            result += str1.charAt(index);
            result += str2.charAt(index);
            index++;
            if(index == str1.length()){
                result += str2.substring(index);
                break;
            }else if(index == str2.length()){
                result += str1.substring(index);
                break;
            }
        }
        return result;
    }
    public static String stringMerge(String str1,String str2){
        String result = "";
        int max = 0;
        if(str1.length() > str2.length()){
            max = str1.length();
        }else{
            max = str2.length();
        }
        for(int i = 0;i < max;i++){
            if(i < str1.length()){
                result += str1.charAt(i);
            }
            if(i < str2.length()){
                result += str2.charAt(i);
            }
        }
        return result;
    }
}
