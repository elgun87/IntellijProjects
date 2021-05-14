package Methods;
import java.util.*;
public class TimeConversation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        String convertedTime = "";
        if(s.contains("PM")){
            int hour = Integer.valueOf(s.substring(0,s.indexOf(":")));
            if(hour != 12){
                hour += 12;
            }
            convertedTime = hour + s.substring(s.indexOf(":"),s.indexOf("PM"));
        }
        else if(s.contains("AM")){
            int hour = Integer.valueOf(s.substring(0,s.indexOf(":")));
            if(hour != 12){
                convertedTime = s.substring(0,s.indexOf("AM"));
            }else{
                convertedTime = "00" + s.substring(s.indexOf(":"),s.indexOf("AM"));
            }
        }

        System.out.println(convertedTime);
    }
}

