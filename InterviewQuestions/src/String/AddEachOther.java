package String;
import java.util.*;
public class AddEachOther {
    public static void main(String[] args){
        String str = "anar";
        String str2 = "elgun";
        String result = addStr(str,str2);
        System.out.println(result);
    }
    public static String addStr(String str,String str2){
        int len1 = str.length();int len2 = str2.length();

        int maxLen = Integer.max(len1,len2);

        String result = "";
        for(int i = 0; i < maxLen;i++){
            if(i < len1){
              result += str.charAt(i);
            }
            if(i < len2){
                result += str2.charAt(i);
            }
        }
        return result;
    }

}
