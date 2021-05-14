package String_2;

import java.util.*;

public class StarOut {
    public static void main(String[] args) {
//        String str = "ab*cdhg***********jhsb*********ghdfggfg*ssg";
//        String str = "sm***eil*ly";
        String str = "stringy*";
//        String str = "str*in*gy";
        System.out.println(starOut(str));
    }
    public static String starOut(String str) {
        String result = "";
        String star = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i + 1) == '*') {
                continue;
            } else {
                result += str.charAt(i);
            }
        }

        if(result.startsWith("*")){
            result = result.substring(2);
        }
        if(result.endsWith("*")){
            result = result.substring(0,result.length()-2);
        }
        String temp = result;
        for(int i = 0;i < result.length();i++){
            if(result.charAt(i) == '*'){
                star += String.valueOf(result.charAt(i-1)) + String.valueOf(result.charAt(i)) + String.valueOf(result.charAt(i+1));
                star = star.trim();
            }
            if(temp.contains(star)){
                temp = temp.replace(star,"");
                star = " ";
            }
        }
        return temp;

    }

}

