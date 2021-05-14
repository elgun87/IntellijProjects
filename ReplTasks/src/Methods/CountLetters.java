package Methods;

import java.util.*;

public class CountLetters {
    public static void main(String[] args) {
        String str = "opendoor";
        String result = counter(str);
        System.out.println(result);
    }

    public static String counter(String str) {
        int count = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                if (j == str.length() - 1) {
                    if (!result.contains(String.valueOf(str.charAt(i)))) {
                        result += count + String.valueOf(str.charAt(i));
                        count = 0;
                    } else {
                        count = 0;
                    }
                }
            }
        }
        return result;
    }
}
