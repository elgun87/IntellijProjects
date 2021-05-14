package day_22;

import java.util.*;

public class CreatingAnEmail {
    //    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter teh first word:");
//        String str1 = input.next();
//        System.out.println("Enter teh second word:");
//        String str2 = input.next();
//        String report = "";
//        String email = "@cybertek.com";
//        if(str1.length() < 6 && str2.length() < 6){
//            report = "Invalid data";
//        }else{
//            report = (str1.substring(0,4) + str2.substring(str2.length() - 3) + email).toLowerCase();
//        }
//        System.out.println(report);
//    }
    public static void main(String[] args) {
       String word = "fifteen";
        //YOUR CODE HERE
        if (word.length() % 2 != 0 && word.length() > 5) {
            System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 2));
        } else {
            System.out.println("Invalid data");
        }
    }
}
