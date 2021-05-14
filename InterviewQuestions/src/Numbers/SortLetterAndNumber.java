package Numbers;
import java.util.*;
public class SortLetterAndNumber {
    public static void main(String[] args) {
        String str = "DC5021GCCCA08951BHYTGFA";
        String result = "";String result2 = "";
        for(int i = 0; i < str.length()-1;i++){
            if(Character.isLetter(str.charAt(i))){
                result += str.charAt(i);
                if(Character.isDigit(str.charAt(i+1))){
                    result += ".";
                }
            }else{
                result += str.charAt(i);
                if(Character.isLetter(str.charAt(i+1))){
                    result += ".";
                }
            }
        }
        String strArr[] = result.split("\\.");
        for(int i = 0;i < strArr.length;i++){
            char ch [] = strArr[i].toCharArray();
            Arrays.sort(ch);
            result2 += String.valueOf(ch);
        }
        System.out.println(result2);
    }
}
