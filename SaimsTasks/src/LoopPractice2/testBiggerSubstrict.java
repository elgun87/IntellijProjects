package LoopPractice2;
import java.util.*;
public class testBiggerSubstrict {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int count = 0;
        int max= 0;
        char letter = ' ';
        for(int i = 0;i < str.length();i++){
            count = 0;
            for(int j = 0;j < str.length();j++){

                if(str.charAt(i) == str.charAt(j) && i != j){
                    count++;
                }
                if(count > max){
                    max = count;
                    letter = str.charAt(i);
                }
            }
        }
        if(max == 0){
            System.out.println("no duplicate chars");
        }else{
            System.out.println("The \"" + letter + "\" count is " + (max + 1));
        }
    }
}
