package String_2;

public class Polindrome {
    public static void main(String[] args) {
        String str = "civic";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                System.out.println("not polindrome");
                break;
            } else {
                System.out.println("polindrome");
                break;
            }
        }
    }
}