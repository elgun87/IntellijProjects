package Methods;
import java.util.*;
public class PrintUniqWords {
    public static void main(String[] args){
        String names = "5 swift assembly java java java";
        String str2 [] = fillArray(names);

        printUniqueWords(str2);

    }
    public static void printUniqueWords(String[] words){
        for( int i = 0; i < words.length; i++){
            boolean isUniq = true;
            for( int j = 0; j < words.length; j++){
                if(words[i].equals(words[j]) && i != j){
                    isUniq = false;
                }
            }
            if(isUniq){
                System.out.println(words[i]);
            }
        }
    }
    public static String [] fillArray(String str){
        String arr [] = str.split(" ");
        return arr;
    }
}
