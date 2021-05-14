package day_18;
import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade:");
        int grade = input.nextInt();
        switch (grade){
            case 1:
                report("Apple Orchard",3,"Ms.Smith");
                break;
            case 2:
                report("Zoo",7,"Mr.Lee");
                break;
            case 3:
                report("Aquarium",5,"Ms. Wilson");
                break;
            case 4:
                report("Movie theater",2,"Ms. Reyes");
                break;
            case 5:
                report("Museum",5,"Ms. Lela");
                break;
            case 6:
                report("Six Flags",8,"Mr. Watt");
                break;
            default:
                System.out.println("Invalid entry of grade");

        }
    }
    public static void report(String str,int num,String str1){
        String report = "Location - " + str + "\n" + "Number of Groups - " + num + "\n" + "Teacher in charge - " + str1;
        System.out.println(report);
    }
}
