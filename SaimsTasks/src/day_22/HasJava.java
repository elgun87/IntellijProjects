package day_22;

import java.util.*;

public class HasJava {
    public static void main(String[] args) {
//        String str = "sdscjavac++";
//
//        if(str.indexOf("java") == 0 || str.indexOf("java") == 1){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        if (word.length() % 2 == 1) {
            if (word.length() >= 3) {
                System.out.println(word.charAt(word.length() / 2));

            } else if (word.length() == 1) {
                System.out.println(word + word + word);
            }
        } else if (word.length() % 2 == 0) {
            if (word.length() >= 4) {
                System.out.println(word.substring(word.length()/2,5));
            } else if (word.length() == 2) {
                System.out.println(word + word);
            }
        }

    }
}

