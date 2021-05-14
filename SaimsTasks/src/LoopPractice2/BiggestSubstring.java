package LoopPractice2;
import java.util.*;
public class BiggestSubstring {
    public static void main(String[] args) {
        String str = "aaabee";
        String result = "";
        char letter = ' ';
        int count = 1;
        int max = 0;

        for(int i = 0;i < str.length()-1;i++) {
            if (i + 1 > str.length()) {
                if (str.charAt(i+1) == str.charAt(i)) {
                    letter = str.charAt(i);
                    count++;
                }else if(i + 1 == str.length()){
                    result += letter + "" + count;
                }
                break;
            }
            if (str.charAt(i) == str.charAt(i + 1)) {
                letter = str.charAt(i);
                count++;
            } else if (str.charAt(i + 1) != str.charAt(i) && count > 1) {
                max = count;
                count = 1;
                result += letter + "" + max;
            }
        }
        System.out.println(result);

    }
}
