package day_23;

public class WarmUp {
    public static void main(String[] args) {
        String word = "v";
        if (word.length() % 2 != 0) {
            if (word.length() <= 3) {
                System.out.println(word.charAt(word.length() / 2));
            } else if (word.length() == 1) {
                System.out.println(word + word + word);
            }
        } else if (word.length() % 2 == 0) {
            if (word.length() >= 4) {
                System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
            } else if (word.length() == 2) {
                System.out.println(word + word);
            }
        }
    }
}
