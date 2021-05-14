package Package1;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        passwordCheck("cRdgdk#");
        char ch [] = {'a','f','b','e','d'};
        Arrays.sort(ch,0,3);
        System.out.println(ch);
    }
    public static void passwordCheck(String str) {
        if (str.length() >= 6 && !str.contains(" ")) {
            List <Boolean> list = new ArrayList<>();
            int index =0;
            for (int i = 0; i < str.length(); i++) {
                if (!(str.charAt(i) > 'A' && str.charAt(i) < 'Z')) {
                    list.add(true);
                } else if (!(str.charAt(i) > 'a' && str.charAt(i) < 'z')) {
                    list.add(true);
                } else if (!(str.charAt(i) > '0' && str.charAt(i) < '9')) {
                    list.add(true);
                } else if (!(str.charAt(i) >= 32 && str.charAt(i) <= 64)) {
                    list.add(true);
                }else{
                    list.add(false);
                }
            }
            System.out.println(list);

            if (list.contains(false)) {
                System.out.println("one requirement is missing");
            } else {
                System.out.println("Correct password");
            }
        } else {
            System.out.println("short password");
        }
    }
}

