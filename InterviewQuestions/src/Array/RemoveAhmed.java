package Array;
import java.util.*;
public class RemoveAhmed {
    public static void main(String[] args){
        String str = "Ahmed";
       List<String> names = new ArrayList<>();
       names.add("Ahmed");
       names.add("Eric");
       names.add("John");
       names.add("Jack");
       names.add("Ahmed");
       names = removeStr(names,str);
        System.out.println(names);
    }
    public static List<String> removeStr(List<String> names,String removeMe){
        while(names.contains(removeMe)){
            names.remove(removeMe);
        }
        return names;
    }
}
