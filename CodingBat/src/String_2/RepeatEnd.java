package String_2;

public class RepeatEnd {
    public static void main(String[] args){
        System.out.println(repeatEnd("Hello",3));
    }
    public static String repeatEnd(String str, int n) {
        String result = "";
        String end = str.substring(str.length()-n);
        while(n > 0){
            result += end;
            n --;
        }
        return result;
    }
}
