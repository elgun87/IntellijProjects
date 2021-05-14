package hackerRank;

public class TimeConversation {
    public static void main(String[] args) {
        String s = "12:00:00AM";
        if (s.contains("PM")) {
            int timeInNum = Integer.valueOf(s.substring(0, 2));
            if (timeInNum == 12) {
                s = s.substring(0, s.length() - 2);
            }else{
                timeInNum += 12;
                s = timeInNum + s.substring(2, s.length() - 2);
            }
        } else if (s.contains("AM")) {
            int timeInNum = Integer.valueOf(s.substring(0, 2));
            if (timeInNum == 12) {
                timeInNum -= 12;
                s = 0 + "" + timeInNum + s.substring(2, s.length() - 2);
            }else{
                s = s.substring(0, s.length() - 2);
            }
        }
        System.out.println(s);
    }
}
