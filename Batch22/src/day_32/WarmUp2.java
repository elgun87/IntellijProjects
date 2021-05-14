package day_32;
import java.util.*;
public class WarmUp2 {
    public static void main(String[] args) {
//        String str = "About 1,810,000 results (0.68 seconds)";
//        String result [] = str.split(" ");
//        System.out.println(result[1]);
//        String secondNUm = result[result.length-2].substring(1);
//        System.out.println(secondNUm);
//
//        String cats = "bengal cat tabby cat persian cat no cat here cat";
//        int count = 0;
//        while(cats.contains("cat")){
//            count++;
//            cats = cats.replaceFirst("cat","");
//        }
//        System.out.println(count);

        String word1 = "Hello my dear!";
        String result3 = "";
        String arr2 [] = word1.split(" ");

        for(int i = arr2.length-1;i >= 0;i--){
            result3 += arr2[i] + " ";
        }
        System.out.println(result3);
    }
}
