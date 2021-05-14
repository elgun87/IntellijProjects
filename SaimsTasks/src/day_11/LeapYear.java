package day_11;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;

        String report = (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) ? "it is a leap year" : "it is not a leap yer";
        System.out.println(report);
    }
}
