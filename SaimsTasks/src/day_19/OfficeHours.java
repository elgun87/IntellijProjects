package day_19;
public class OfficeHours {
    public static void main(String[] args) {
        String day = "Tuesday";
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wendesday":
                System.out.println("Office hours at 5:30 - 6:45 EST");
                break;
            case "Thursday":
                System.out.println("Soft Skills day");
                break;
            case "Friday":
                System.out.println("Day off");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Already a long day, no office hours.");
                break;
            default:
                System.out.println("Invalid day given");
        }
    }

}