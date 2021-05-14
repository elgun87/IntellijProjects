package ArrayList;
import java.util.*;
public class CountGivenLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java","html","css","java","javascript","selenium");
        int num = getQuantityLetters(words,'a');
        System.out.println(num);

    }

    public static int getQuantityLetters(List<String> list,char ch){
        int count = 0;
        for(int i = 0;i < list.size();i++){
            for(int j = 0;j < list.get(i).length();j++){
                if(list.get(i).charAt(j) == ch){
                    count++;
                }
            }
        }
        return count;
    }
}
