package LoopPractice2;

import java.util.*;

public class GetNonDuplicateChars {
    public static void main(String[] args) {
        String str = "jakgdgdgtdgvkjvaolkiuy";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            boolean check = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    check = false;
                    break;
                }
                if (check && j == str.length() - 1) {
                    if (!result.contains(str.charAt(i) + "")) {
                        result += str.charAt(i);
                    }
                }
            }
        }
        System.out.println(result + " - is the non duplicate character in the String");
    }
}