package day_20;

public class LongestWord {
    public static void main(String[] args) {
        String word1 = "java";
        int len1 = word1.length();
        String word2 = "java";
        int len2 = word2.length();
        String word3 = "computer";
        int len3 = word3.length();

        String given = "a";

        boolean isWord1HasA = false;
        boolean isWord2hasA = false;
        boolean isWord3hasA = false;

        if (word1.contains(given)) {
            isWord1HasA = true;
        }
        if (word2.contains(given)) {
            isWord2hasA = true;
        }
        if (word3.contains(given)) {
            isWord3hasA = true;
        }

        if (isWord1HasA && isWord2hasA && isWord3hasA) {
            if ((len1 > len2 && len1 > len3) || (len1 > len2 && len1 == len3) || (len1 > len3 && len1 == len2)) {
                System.out.println(word1);
            } else if ((len2 > len1 && len2 > len3) || (len2 > len1 && len2 == len3) || (len2 > len3 && len2 == len1)) {
                System.out.println(word2);
            } else if ((len3 > len1 && len3 > len2) || (len3 > len1 && len3 == len2) || (len3 > len2 && len3 == len1)) {
                System.out.println(word3);
            }
        } else if (isWord1HasA && !isWord2hasA && !isWord3hasA) {
            System.out.println(word1);
        } else if (!isWord1HasA && isWord2hasA && !isWord3hasA) {
            System.out.println(word2);
        } else if (!isWord1HasA && !isWord2hasA && isWord3hasA) {
            System.out.println(word3);
        } else if (isWord1HasA && isWord2hasA && !isWord3hasA) {
            if (len1 > len2) {
                System.out.println(word1);
            } else {
                System.out.println(word2);
            }
        } else if (isWord1HasA && !isWord2hasA && isWord3hasA) {
            if (len1 > len3) {
                System.out.println(word1);
            } else {
                System.out.println(word3);
            }
        } else if (!isWord1HasA && isWord2hasA && isWord3hasA) {
            if (len2 > len2) {
                System.out.println(word2);
            } else {
                System.out.println(word3);
            }
        } else {
            System.out.println("There is no " + given + " in this words");
        }

    }
}
