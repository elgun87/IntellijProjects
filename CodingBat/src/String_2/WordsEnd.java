package String_2;

import java.util.*;

public class WordsEnd {
    public static void main(String[] args) {
        String str1 = "abc1xyz1abc";
        String str2 = "b";
        System.out.println(newStr(str1, str2));
    }

    public static String newStr(String str, String word) {
        if(str.length() == word.length()){
            if(str.equals(word)){
                return word;
            }
        }
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if(i + word.length() > str.length()-1){
                if(str.substring(i,i+word.length()).equals(word)){
                    result += str.charAt(i - 1);
                }
                break;
            }

            if(str.substring(i,i+word.length()).equals(word)){
                if(i == 0 && str.startsWith(word)){
                    result += str.charAt(i + word.length());

                }else if(i == str.lastIndexOf(word)){
                    result += str.charAt(i - 1);
                    if(i != str.length()-word.length()){
                        result += str.charAt(i + word.length());
                    }

                }else{
                    result += str.charAt(i - 1);
                    result += str.charAt(i + word.length());
                }
            }
        }
        return result;
    }
}
