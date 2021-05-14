package String;
import java.util.*;
public class tessst {
    public static void main(String[] args) {
        String str = "BCA985QGP";
        sortMe(str);
    }
    public static void sortMe(String str){
        List<String> digit = new ArrayList<>();
        List<String> letter = new ArrayList<>();
        String result = "";
        for(int i = 0;i < str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                digit.add(String.valueOf(str.charAt(i)));
                if(!letter.isEmpty()){
                   Collections.sort(letter);
                   for(int n = 0;n < letter.size();n++){
                       result += letter.get(n);
                   }
                   letter.clear();
                }
            }else if(Character.isLetter(str.charAt(i))){
                letter.add(String.valueOf(str.charAt(i)));
                if (!digit.isEmpty()){
                    Collections.sort(digit);
                    for(int n = 0;n < digit.size();n++){
                        result += digit.get(n);
                    }
                    digit.clear();
                }
            }
        }
        System.out.println(result);
    }
}
