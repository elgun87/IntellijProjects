package day_24;
import java.util.*;
public class WarmUp2 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int secretPinCode = 1234;boolean isPinCode = true;boolean showMeOneTime = true;
      int pinCode = 0;int attempt = 0;int num = 5;
      do{
          if(showMeOneTime){
              System.out.println("You have " + num + " time attempt");
              attempt ++;
              showMeOneTime = false;
              System.out.println("Enter your pin code");
              pinCode = input.nextInt();
              if(pinCode == secretPinCode){
                  isPinCode = false;
                  System.out.println("You have entered correct pin code");
              }
          }else{
              System.out.println("You have " + (num - attempt) + " attempt left");
              attempt ++;
              System.out.println("Enter your pin code");
              pinCode = input.nextInt();
              if(attempt == 5){
                  System.out.println("No more attempt");
                  break;
              }else if(pinCode == secretPinCode){
                  System.out.println("You have entered correct pin code");
                  isPinCode = false;
              }
          }
      }while(isPinCode);

    }
}
