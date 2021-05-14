package day_18;
import java.util.*;
public class CybertekClassHours {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cybertek School Schedule Information");
        System.out.println("Please enter your Location:");
        String branch = input.next();
        System.out.println("Are your morning batch or evening batch?");
        String batch = input.next();

        if(branch.equals("US") || branch.equals("us")){
            if(batch.equals("Morning") || batch.equals("morning")){
                System.out.println("Class time are 10am - 5pm EST.M,T,Th,F");
            }else if(batch.equals("Evening") || batch.equals("evening")){
                System.out.println("Class time are 7pm - 10pm EST.M,T,Th,F");
            }
        }else if(branch.equals("EU") || branch.equals("eu")){
            System.out.println("Class times are  10am-5pm EST. M, T, W, Th, F");
        }
    }
}
