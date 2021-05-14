package Loops;
import java.util.*;
public class RepeatSeperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result = "";
        for(int i = 0;i < count;i++){
            if(count - i > 1){
                result += word + separator;
            }else{
                result += word;
            }
        }
        System.out.println(result);

    }
}
