package day_19;

import java.util.Scanner;

public class GradeLevel {
//    public static void main(String[] args) {
//        byte grade = 0;
//        if(grade >= 1 && grade <= 5){
//            System.out.println("Elementary school");
//        }else if(grade >= 6 && grade <= 8){
//            System.out.println("Middle School");
//        }else if(grade >= 9 && grade <= 12){
//            System.out.println("High School");
//        }else if(grade >= 13 && grade <= 16){
//            System.out.println("College");
//        }else if(grade >= 17 && grade <= 18){
//            System.out.println("Grade School");
//        }else{
//            System.out.println("Invalid grade");
//        }
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the username");
        scan.nextLine();
        String userName = scan.nextLine();

        System.out.println("Please enter the password");
        scan.nextLine();
        String password = scan.nextLine();


        String expUserName = "cybertek";
        String expPassword = "Abc123";

        if (userName.equalsIgnoreCase(expUserName) && (password.equals(expPassword))) {
            System.out.println("Welcome to your account");
        } else {
            System.out.println("Wrong username or password"); }

}
}
