package Loops;
import java.util.*;
public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guesstName = "";
        String guestList = "Guest's list: ";
        String addMore = "";
        int count = 1;

        for(int i = 0 ;i < count ; i ++){
            count ++;
            System.out.println("Please enter guest name:");
            guestList += input.next() + ", ";
            System.out.println("Do you want to enter new guest name:");
            addMore = input.next();
            if(addMore.equalsIgnoreCase("no")){
                guestList = guestList.substring(0,guestList.lastIndexOf(","));
                System.out.println(guestList);
                count--;
            }
        }
    }
}
