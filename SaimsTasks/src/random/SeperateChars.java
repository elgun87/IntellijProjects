package random;
import java.util.*;
public class SeperateChars {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        List<List<String>> list3 = new ArrayList<>();
        list3 = seperatePart(str);
        System.out.println(list3);
        System.out.println("---------------------");
        list3.forEach(i -> System.out.println(i));
    }
    public static List<List<String>> seperatePart(String str){
        List<String> letter = new ArrayList<>();
        List<String> chars = new ArrayList<>();
        List<String> digit = new ArrayList<>();
        for(int i = 0;i < str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                letter.add(String.valueOf(str.charAt(i)));
            }else if(Character.isDigit(str.charAt(i))){
                digit.add(String.valueOf(str.charAt(i)));
            }else{
              chars.add(String.valueOf(str.charAt(i)));
            }
        }
        List<List<String>> list = new ArrayList<>();
        list.add(letter);
        list.add(digit);
        list.add(chars);
        return list;
    }
}
