package day_11;
import java.util.*;
public class OxygenLevel {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How deep you are diving:");
        int deepness = input.nextInt();
        String report = "";
        if(deepness > 90){
            report = "Your tank is full";
        }else if(deepness > 80){
            report = "Still ok";
        }else if(deepness > 70){
            report = "Dont go to far";
        }else if(deepness > 60){
            report = "Start to head back";
        }else if(deepness > 50){
            report = "Be careful now you at at 50%";
        }else{
            report = "Invalid entry";
        }
        System.out.println(report);
    }
}
