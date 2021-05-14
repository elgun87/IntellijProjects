package day_09;
import java.util.*;
public class GroceryShopping {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         String food[] = {"milk","bread","cucumber"};
         int pricec = 0;
         for(int i = 0;i < food.length;i++){
             System.out.println("Enter price for " + food[i] + " :");
             int price = input.nextInt();
             System.out.println("Price for " + food[i] + " is " + price + ".");
         }
    }
}
