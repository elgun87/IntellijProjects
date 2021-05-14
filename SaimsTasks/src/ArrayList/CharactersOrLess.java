package ArrayList;
import java.util.*;
public class CharactersOrLess {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple","tree","loop","cat","animal","shrotcut");
        get4CharacterOrLes(words);
    }

    public static void get4CharacterOrLes(List<String> list){
        for(int i = 0;i < list.size();i++){
            if(list.get(i).length() <= 4){
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
