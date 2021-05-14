package String_2;

public class TheEnd {
    public static void main(String[] args) {
        /*
        Given two strings, return true if either of the strings appears at the very end of the other string,
        ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
        Note: str.toLowerCase() returns the lowercase version of a string.

        endOther("Hiabc", "abc") → true
        endOther("AbC", "HiaBc") → true
        endOther("abc", "abXabc") → true
         */
        String a = "Hiabc";
        String b = "Abc";
        System.out.println(checkTheString(a, b));

    }

    public static boolean checkTheString(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.indexOf(b) >= 0) {
            if (a.endsWith(b)) {
                return true;
            } else {
                return false;
            }

        } else if (b.indexOf(a) >= 0) {
            if (b.endsWith(a)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}
