package Loops;
import java.util.*;
public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "abcXXXabc";
        int index = 0;
        int count = 0 ;

        while(index <= str.length()){
            if(index + 2 > str.length()-1){
                break;
            }
            if(str.charAt(index) == str.charAt(index +1) && str.charAt(index) == str.charAt(index+2)){
                count ++;
            }
            index ++;
        }
        System.out.println(count);
    }
}
