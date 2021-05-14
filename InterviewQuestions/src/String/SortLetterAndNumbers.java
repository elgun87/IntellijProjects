package String;
import java.util.*;
public class SortLetterAndNumbers {
                public static void main(String[] args) {
                    String str = "DC501GCCCA098911";
                    String nonDigit = "";
                    String digit = "";
                    String result = "";
                    for(int i = 0;i < str.length();i++){
                        boolean isDigit = Character.isDigit(str.charAt(i));
                        if(!isDigit){
                            if(!digit.isEmpty()){
                                char digitCh [] = digit.toCharArray();
                                Arrays.sort(digitCh);
                                result += String.valueOf(digitCh);
                                digit = "";
                            }
                            nonDigit += str.charAt(i);
                        }
            if(isDigit){
                digit += str.charAt(i);
                char [] arr = nonDigit.toCharArray();
                Arrays.sort(arr);
                result += String.valueOf(arr);
                nonDigit ="";
            }
            if(i == str.length()-1 && !digit.isEmpty()){
                char digitCh [] = digit.toCharArray();
                Arrays.sort(digitCh);
                result += String.valueOf(digitCh);
            }
            if(i == str.length()-1 && !nonDigit.isEmpty()){
                char arr2 [] = nonDigit.toCharArray();
                Arrays.sort(arr2);
                result += String.valueOf(arr2);
            }
        }
        System.out.println(result);

    }
}
