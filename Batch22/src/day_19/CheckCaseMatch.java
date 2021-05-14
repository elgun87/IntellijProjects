package day_19;
import java.util.*;
public class CheckCaseMatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String name = scan.nextLine();
        if(name.equals("Maxe Payne") || name.equals("ALan Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }


    }
}
