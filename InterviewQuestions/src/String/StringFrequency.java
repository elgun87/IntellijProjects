package String;
import java.util.*;
public class StringFrequency {
    public static void main(String[] args){
        //FrequencyOfChars("AAABBCDD") ==> A3B2C1D2;
        String str = "INDOOR";
        String str2 = str;
        System.out.println(countLetters(str));
    }
    public static String countLetters(String str){
        int count = 1;
        String result = "";
        for(int i = 0;i < str.length();i++){
            if(i == str.length()-1){
                result += str.charAt(i) + "" + count;
                break;
            }

            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                result += str.charAt(i) + "" + count;
                count = 1;
            }
        }
        return result;
    }
}
