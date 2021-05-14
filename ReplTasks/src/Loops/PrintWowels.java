package Loops;
import java.util.*;
public class PrintWowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();

        String wowels = "aeiou";

        String result = "";

        for(int i = 0;i < word.length();i ++){

            for(int j = 0;j < wowels.length();j++){

                if(word.charAt(i) == wowels.charAt(j)){
                    result += word.charAt(i);
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
