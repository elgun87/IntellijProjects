package String3;

import java.util.*;

public class YzCounter {
    public static void main(String[] args) {
        String str = "fez day";
        int num = countYz(str);
        System.out.println(num);
    }

    public static int countYz(String str) {
        int count = 0;
        String container = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                if (!container.isEmpty()) {
                    container += str.charAt(i);
                    if (container.endsWith("y") || container.endsWith("Y")) {
                        count++;
                    } else if (container.endsWith("z") || container.endsWith("Z")) {
                        count++;
                    }
                }
            }
            if (Character.isLetter(str.charAt(i))) {
                container += String.valueOf(str.charAt(i));
            } else {
                if (container.endsWith("y") || container.endsWith("Y")) {
                    count++;
                } else if (container.endsWith("z") || container.endsWith("Z")) {
                    count++;
                }
                container = "";
            }
        }
        return count;
    }
}
