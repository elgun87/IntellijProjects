package day_32;
import java.util.*;
public class WarmUp {
    public static void main(String[] args) {
        String str = "       Hello      world     how are you     doing    today ? ";
        String result = "";
        str = str.trim();
        String arr [] = str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(arr[0]);

        for(int i = 0;i < arr.length;i++){
            if(!arr[i].isEmpty()){
                result += " " +  arr[i];
            }
        }
        result = result.trim();
        System.out.println(result);
    }
}
