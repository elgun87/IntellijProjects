package String;

import java.util.*;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "Ah#1ssd";
        System.out.println(isPasswordValid(password));
    }

    public static boolean isPasswordValid(String password) {

        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialCase = false;
        boolean isDigit = false;

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        } else {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    isUpperCase = true;
                } else if (ch >= 'a' && ch <= 'z') {
                    isLowerCase = true;
                } else if (ch >= '0' && ch <= '9') {
                    isDigit = true;
                } else if (ch >= 32 && ch <= 64) {
                    isSpecialCase = true;
                }
            }
        }
        if (isDigit && isLowerCase && isSpecialCase && isUpperCase) {
            return true;
        } else {
            return false;
        }
    }
}
