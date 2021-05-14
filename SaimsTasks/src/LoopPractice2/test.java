package LoopPractice2;

import java.util.*;

public class test {
    public static void main(String[] args) {
        String str = "aabbcccc";
        int count = 0;
        int max = 0;
        String biggest = "";
        String result = "";
        for (int i = 0; i < str.length() - 1; i++) {
            char ch1 = str.charAt(i);
            for (int j = 0; j < str.length() ; j++) {
                char ch2 = str.charAt(j);
                if (ch1 == ch2) {
                    count ++;
                    biggest += ch1;
                }else{// i only added this line to your code so when char is not same i made the biggest string empty
                    biggest = "";
                    count = 0;
                }
                if (biggest.length() > result.length()) {
                    result = biggest;
                }

            }
        }
        System.out.println(result + " is repeated " + count + " times");
    }
}

