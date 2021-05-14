package Package1;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "BABBBBBBBCCCCCD";
        String result = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 > str.length()-1) {
                result += str.charAt(i);
                result += count;
                break;
            }
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result += str.charAt(i);
                result += count;
                count = 1;
            }
        }
        System.out.println(result);
    }
}
