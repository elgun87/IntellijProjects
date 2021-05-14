package String;

import java.util.*;

public class SortLetterAndNumberVersion2 {
    public static void main(String[] args) {
        String str = "CBA876FAG965";
        char ch[] = str.toCharArray();
        List<Integer> digit = new ArrayList<>();
        List<Integer> letter = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                letter.add(i);
                if (!digit.isEmpty()) {
                    ch = sortChar(digit, ch);
                }
            } else if (Character.isDigit(ch[i])) {
                digit.add(i);
                if (!letter.isEmpty()) {
                    ch = sortChar(letter, ch);
                }
            }
            if (i == str.length() - 1) {
                if (!digit.isEmpty()) {
                    ch = sortChar(digit, ch);
                } else if (!letter.isEmpty()) {
                    ch = sortChar(letter, ch);
                }
            }
        }
        System.out.println(ch);
    }

    public static char[] sortChar(List<Integer> list, char ch[]) {
        int startIndex = list.get(0);
        int endIndex = list.get(list.size() - 1);
        Arrays.sort(ch, startIndex, endIndex + 1);
        list.clear();
        return ch;
    }
}
