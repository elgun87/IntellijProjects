package ArrayPractice2;
import java.util.*;
public class test2 {
    public static void main(String[] args) {

       String str [] = {"olive","fish","pursuit","old","warning","python","java","coffee","cat","ray"};
       String result = "";
       String smallest = str[0];
       for(int i = 0;i < str.length;i++){
           if(str[i].length() < smallest.length()){
               smallest = str[i];
           }
       }
       for(int i = 0;i < str.length;i++){
           if(str[i].length() == smallest.length()){
               if(i < str.length-1){
                   result += str[i] + ",";
               }else{
                   result += str[i];
               }
           }
       }
        System.out.println(Arrays.toString(result.split("\\,")));

    }
}
