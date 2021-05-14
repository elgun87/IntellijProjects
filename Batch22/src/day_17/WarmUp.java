package day_17;
import java.util.*;
public class WarmUp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter car model:");
        char model = input.next().charAt(0);
        System.out.println("Please enter trim");
        String trim = input.nextLine();
        String price = "";
        int range = 0;
        int topSpeed = 0;
        double mph = 0;
        String report = "";

      if(model == 's'){
          if(trim.equals("long range")){
              price = "$74,490";
              range = 412;
              mph = 3.1;
              report = "Car model is" + model + "\n" + "Price is " + price + "\n" + "MPH is " + mph;

          }else if(trim.equals("plaid")){
              price = "$114,490";
              range = 390;
              mph = 1.99;
              report = "Car model is" + model + "\n" + "Price is " + price + "\n" + "MPH is " + mph;
          }else if(trim.equals("plaid plus")){
              price = "$144,490";
              range = 520;
              mph = 1.99;
              report = "Car model is" + model + "\n" + "Price is " + price + "\n" + "MPH is " + mph;
          }
      }else if(model == '3'){
          if(trim.equals("Standard Range Plus")){
              price = "$33,490";
              range = 263;
              mph = 5.3;
              report = "Car model is" + model + "\n" + "Price is " + price + "\n" + "MPH is " + mph;
          }else if(trim.equals("Long Range")){
              price = "$42,490";
              range = 353;
              mph = 4.2;
              report = "Car model is" + model + "\n" + "Price is " + price + "\n" + "MPH is " + mph;
          }else if(trim.equals("plaid plus")){
              price = "$51.60";
              range = 315;
              mph = 3.1;
              report = "Car model is" + model + "\n" + "Price is " + price + "\n" + "MPH is " + mph;
          }
      }else if(model == 'x'){
          if(trim.equals("Long Range")){
              price = "$84,490";
              range = 360;
              mph = 3.8;
              report = "Car model is" + model + "\n" + "Price is " + price + "\n" + "MPH is " + mph;
          }else if(trim.equals("Plaid")){
              price = "$114,490";
              range = 340;
              mph = 2.5;
              report = "Car model is" + model + "\n" + "Price is " + price + "\n" + "MPH is " + mph;
          }
      }else{
          report = "Invalid Entry of model";
      }
        System.out.println(report);
    }
}
