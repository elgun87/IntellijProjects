package String_2;
import java.util.*;
public class CountLetters {
    public static void main(String[] args) throws InterruptedException{
        String word = "aaaaabbbcccc";
        String result = "";

        for(int i = 0;i < word.length();i++){
            int count = 0;
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    count ++;
                }
                if(j == word.length()-1){
                    if(!result.contains(String.valueOf(word.charAt(i)))){
                        result += word.charAt(i) + "" + count + " ";
                    }
                }
            }
        }
        System.out.println(result);
    }
}
