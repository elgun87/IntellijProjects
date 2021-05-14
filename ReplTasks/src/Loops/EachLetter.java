package Loops;
import java.util.*;
public class EachLetter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        for(int i = 0;i < word.length();i++){
            System.out.println(word.substring(i,i+1));
        }
    }
}
