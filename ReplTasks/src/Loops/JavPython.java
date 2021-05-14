package Loops;

import java.util.*;

public class JavPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String java = "java";
        String python = "python";
        int countForJava = 0;
        int countForPython = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (i + python.length() > sentence.length()) {
                break;
            }
            if (sentence.substring(i, i + java.length()).equals(java)) {
                countForJava++;
            }
            if (sentence.substring(i, i + python.length()).equals(python)) {
                countForPython++;
            }
        }

        if (countForJava == countForPython) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
