package String_2;

import java.util.*;

public class XyBalance {
    public static void main(String[] args) {
        String str = "yaaxbb";
        System.out.println(isXyBalance(str));
    }

    public static boolean isXyBalance(String str) {
        if (str.isEmpty() || str.indexOf('x') == -1 && str.indexOf('y') == -1) {
            return true;
        } else if (str.lastIndexOf('y') == -1 || str.indexOf('y') == -1 || str.lastIndexOf('x') > str.lastIndexOf('y')) {
            return false;
        } else {
            return true;
        }
    }
}

