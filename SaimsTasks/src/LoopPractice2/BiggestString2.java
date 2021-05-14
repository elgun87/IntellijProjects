package LoopPractice2;

public class BiggestString2 {
    public static void main(String[] args) {
        /**
         * TODO: there is still big in code.when last character is single.Please fix it
         */
        String str = "abbcccccddddaaadeeew";
        int count = 1;
        String result = "";
        String letter = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (i + 1 > str.length() - 1) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    letter += str.charAt(i);
                    count++;
                    if (!(result.contains(letter))) {
                        result += letter;
                        letter = "";
                    }
                    result += count;
                }
                break;
            }
            if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
                count++;
                if (!result.contains(str.substring(i, i + 1))) {
                    result += str.substring(i, i + 1);
                }
            } else if (str.charAt(i) != str.charAt(i + 1)) {
                if (count > 1) {
                    result += count;
                    count = 1;
                }
            }
        }
        System.out.println(result);

//        System.out.println(repeated(str));
    }

//    public static String repeated(String str) {
//        String build = "";
//        for (int i = 0; i < str.length() - 1; i++) {
//            String temp = String.valueOf(str.charAt(i));
//            if (str.charAt(i) != str.charAt(i + 1)) {
//                temp = "" + str.charAt(i) + ",";
//            }
//            build += temp;
//        }
//        build += str.charAt(str.length() - 1);
//        String[] arr = build.split(",");
//        String last = "";
//        for (String s : arr) {
//            last += s.charAt(0) + "" + s.length();
//        }
//        return last;
//    }

}
