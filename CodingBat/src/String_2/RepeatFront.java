package String_2;

public class RepeatFront {
    public static void main(String[] args) {
        String str = "Chocolate";
        int num = 3;
        System.out.println(repeatFront(str,num));
    }
    public static String repeatFront(String str, int n) {
        String result = "";
        while(n >= 0){
            String front = str.substring(0,n);
            result += front;
            n--;
        }
        return result;
    }

}
