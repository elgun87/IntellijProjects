package day_19;

import java.util.*;

public class SalaryCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your hourly rate:");
        //I declare variable rate and boolean rateHours.If i get expected input from user i assign it to boolean rateHours and assign true it
        double rate = input.nextDouble();
        boolean expectedRateHours = false;
        if (rate <= 0) {
            System.out.println("Hourly rate can not be zero or negative");
        } else {
            expectedRateHours = true;
        }

        System.out.println("Enter your weekly hours:");
        int weeklyHours = input.nextInt();
        boolean expectedWeeklyHour = false;
        if ( weeklyHours <= 1 || weeklyHours >= 65) {
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
        }else{
            expectedWeeklyHour = true;
        }

        System.out.println("Enter number of weeks:");
        int numberOfWeeks = input.nextInt();
        boolean expectedNumberOfWeeks = false;
        if( numberOfWeeks <= 1 || numberOfWeeks >= 52){
            System.out.println("Number of weeks cannot be less than 1 or greater than 52");
        }else{
            expectedNumberOfWeeks = true;
        }

        //Below code if i get all conditions true it is going to calculate and print the salary
        double salary = 0;
        if(expectedRateHours && expectedWeeklyHour &&expectedNumberOfWeeks) {
            salary = rate * weeklyHours * numberOfWeeks;
        }
        if(salary > 0){
            System.out.println("Your total salary is " + salary + "$");
        }else{
            System.out.println("You have entered some information not correct.Please enter all information correctly to see your salary");
        }

    }
}
