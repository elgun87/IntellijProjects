package day_39;
import java.util.*;
public class WarmUp {
    public static void main(String[] args){
       String sentence = "I wrote 100 lines of code.But there was a bug on line 87 and 85.Later on me and my cowerker fixed the line 65!";
       String allDigit = "";
       String digit = "";
       for(int i = 0;i < sentence.length();i++){
           boolean isDigit = Character.isDigit(sentence.charAt(i));
           if(isDigit){
               digit += sentence.charAt(i);
           }
           if(!digit.isEmpty() && !isDigit){
               allDigit += digit + " ";
               digit = "";
           }
       }

        System.out.println(allDigit);
    }
}
