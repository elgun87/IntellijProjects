package ArrayPractice2;
import java.util.*;
public class ReverseEach {
    public static void main(String[] args) {
        String str = "It started to snow in Chicago";
        String words [] = str.split(" ");

        for(int i = 0;i < words.length;i++){
            String reverse = "";
            int len  = words[i].length()-1;
            while(len >= 0){
                reverse += words[i].charAt(len);
                len--;
            }
            words[i] = reverse;
        }
        System.out.println(Arrays.toString(words));
    }
}
