package Loops;
import java.util.*;
public class CounHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String hi = "hi";
        int count = 0;
        for(int i = 0;i < str.length();i++){
            if(i + hi.length() > str.length()){
                break;
            }
            if(str.substring(i,i + hi.length()).equals(hi)){
                count ++;
            }
        }
        System.out.println(count);
    }
}
