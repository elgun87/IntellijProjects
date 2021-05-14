package day_07;

public class Employee {
    public static void main(String[] args){
        String firstName = "Mike";
        String lastName = "Jacob";
        String companyname = "Tesla";
        double salary = 104000.0;
        int startDay = 21;
        String startMonth = "January ";
        int startYear = 2021;
        boolean areTheyFullTime = true;
        String jobTittle = "STDET";
        String officeAddress = "100 S LaneHampton, VA 13312";
        String email = "agoodworker@yahoo.com";

        String info = "******  TESLA NEW HIRE INFORMATION  *****";
        String welcoming = " ---- Welcome to the board Mike ----- ";
        String message = "Your start day as a " + jobTittle + " will be on " + startMonth + startDay + " " + startYear + "\n" +
                "Your are full time : " + areTheyFullTime + " and will be making " + salary + " per year." + " \n" +
                "The office is located at : " + "\n" + officeAddress + " \n" + "\n" + "\t" + " Office information:" + "\n" +
                "New hire name : " + firstName + " " + lastName + "\n" + "Starts on: " + startMonth + " " +  startDay + " " + startYear + "\n" +
                "Email generated " + email + "\n" + "Your expected salary after 3 year " + (salary + (1000 * 3));
        System.out.println(info);
        System.out.println(welcoming);
        System.out.println(message);
    }
}
