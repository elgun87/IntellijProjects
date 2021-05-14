package day_1;

import java.util.Arrays;

public class GoogleResultTime {
    public static void main(String[] args){
        System.out.println(resultTime("About 691,000,000 results (0.49 seconds)"));
        System.out.println(printSecond("About 691,000,000 results (0.49 seconds)"));
    }
    public static String resultTime(String str){
        String new_str[] = str.split(" ");
        String words = "";
        String digit = "";
        for(int i = 0;i < new_str[3].length();i++){
            if(new_str[3].charAt(i) == '(' || new_str[3].charAt(i) == ')' || new_str[3].charAt(i) == ' ' ){
                continue;
            }else{
                words += new_str[3].charAt(i);
            }
        }
        for(int i = 0;i < words.length();i++){
            boolean checkIfNum = Character.isDigit(words.charAt(i));
            {
                if(checkIfNum){
                    digit += words.charAt(i);
                }
            }
        }
        return digit;
    }

    public static String printSecond(String str){
        String new_str[] = str.split("\\(");
        String result = new_str[1].replaceAll("\\)","");
        return result;
    }
}
