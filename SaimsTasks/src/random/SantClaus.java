package random;

public class SantClaus {
    public static void main(String[] args){
        int givenSecond = 25009;
        int day = givenSecond / (24 * 3600);
        int hour = givenSecond / 3600;
        int minutes = givenSecond % 3600 / 60 ;
        int seconds = givenSecond % 3600 % 60;

        String report = day + " day, " + hour + " hour, " + minutes + " minutes," + seconds + " seconds";
        System.out.println(report);
    }
}
