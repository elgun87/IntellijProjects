package day_19;
import java.util.*;
public class IsPandemicYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = input.nextInt();
        if(year > 0 || year < 2021){
            System.out.println("Invalid year");
        }else if(year >= 1346 && year <= 1353 ){
            System.out.println("The Black Death");
        }else if(year >= 1665 && year <= 1666 ){
            System.out.println("Great Plague of London");
        }else if(year >= 1770 && year <= 1772 ){
            System.out.println("Flu pandemic");
        }else if(year == 1916){
            System.out.println("American polio epidemic");
        }else if(year >= 1918 && year <= 1920 ){
            System.out.println("Spanish Flu");
        }else if(year >= 2009 && year <= 2010 ){
            System.out.println("H1N1 Swine Flu pandemic");
        }else if(year >= 2014 && year <= 2016 ){
            System.out.println("West African Ebola epidemic");
        }else if(year == 2020 || year == 2021 ){
            System.out.println("COVID-19");
        }else{
            System.out.println("No pandemic");
        }
    }
}
