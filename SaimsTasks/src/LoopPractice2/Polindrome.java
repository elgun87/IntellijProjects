package LoopPractice2;
import java.util.*;
public class Polindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String result = "";

        for(int i = str.length()-1;i >=0;i--){
            result += str.charAt(i);
        }
        if(str.equalsIgnoreCase(result)){
            System.out.println(str + " is polindrome");
        }else{
            System.out.println(str + " is not polindrome");
        }

    }
}
