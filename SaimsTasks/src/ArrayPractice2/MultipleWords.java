package ArrayPractice2;
import java.util.*;
public class MultipleWords {
    public static void main(String[] args){
        String items [] = {"nife","wooden spoons","plates","cups","forks","pan","pot","trash can","fridge","dish washer"};
        for(int i = 0;i < items.length;i++){
           if(items[i].trim().contains(" ")){
               if(i < items.length-1){
                   System.out.print(items[i] + ", ");
               }else if(i == items.length-1) {
                   System.out.print(items[i]);
               }
           }
        }
    }
}
