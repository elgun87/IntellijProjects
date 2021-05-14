package String_2;

public class XyzThere {
    public static void main(String[] args) {
        String str = "1.xyz.xyz2.xyz";
        System.out.println(isXyzThere(str));
    }

    public static boolean isXyzThere(String str) {
        boolean check = false;
        String given = "xyz";
        int count = 0;
        if (str.startsWith(given)) {
            check = true;
        } else {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 3).equalsIgnoreCase(given)) {
                    int index = i;
                    if (str.charAt(index - 1) != '.') {
                        check = true;
                        break;
                    }
                }
            }
        }
        return check;
    }
}