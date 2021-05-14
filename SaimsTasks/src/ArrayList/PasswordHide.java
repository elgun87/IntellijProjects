package ArrayList;
import java.util.*;
public class PasswordHide {
    public static void main(String[] args){
        List<String> passwords = Arrays.asList("One","hi","Hold");
        passwords = hidePassword(passwords);
        System.out.println(passwords);
    }

    public static List<String> hidePassword(List<String> list){
        for(int i = 0;i < list.size();i++){
            String result = "";

            for(int j = 0;j < list.get(i).length();j++){
                result += "*";
            }
            list.set(i,result);
        }
        return list;
    }
}
