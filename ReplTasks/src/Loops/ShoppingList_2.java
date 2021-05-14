package Loops;
import java.util.*;
public class ShoppingList_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 0;
        double totalPrice = 0;

        while(true){
            count ++;
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice += price;
            shoppingListReport += "Item" + count + ": " + item  + " Price: " + price + ", ";
            System.out.println("Add one more item?");
            countinue = scan.next();
            if(countinue.equalsIgnoreCase("no")){
                shoppingListReport = shoppingListReport.substring(0,shoppingListReport.lastIndexOf(","));
                System.out.println(shoppingListReport);
                System.out.println("Total price: " + totalPrice);
                break;
            }
        }
    }
}
