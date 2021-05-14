package random;
import java.util.*;
public class SeperateParts {
    public static void main(String[] args) {
        Test test1 = new Test();
        test1.name = "sdsd";
        System.out.println( test1.name);

        String str = "ABCD123$%#@&456EFG!";
        String [] arr = str.split("");
        List<String> list = Arrays.asList(arr);
        List<Character> digit = new ArrayList<>();
        List<Character> letter = new ArrayList<>();
        List<Character> specialCharacter = new ArrayList<>();
        list.forEach(each ->{
            char ch = each.charAt(0);//a little trick to convert String to Char from ArrayList if String consist of is One Character
            if(Character.isDigit(ch)){
                digit.add(ch);
            }else if(Character.isLetter(ch)){
                letter.add(ch);
            }else{
                specialCharacter.add(ch);
            }

        });
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(specialCharacter);
    }
}
