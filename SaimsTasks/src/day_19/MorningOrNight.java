package day_19;

public class MorningOrNight {
    public static void main(String[] args) {
        int hour = 13;
       if(hour >= 00 && hour <= 06){
           System.out.println("It is night");
       }else if(hour > 06 && hour < 19){
           System.out.println("It is day time");
       }else if(hour >= 19 && hour <= 24){
           System.out.println("It is night time");
       }else{
           System.out.println("Invalid entry");
       }
    }
}

