package String_2;

public class BobThere {
    public static void main(String[] args) {
        String str = "bbc";
        System.out.println(isBobThere(str));
    }

    public static boolean isBobThere(String str) {
        boolean isThere = false;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                isThere = true;
                break;
            }
        }
        return isThere;
    }
}
