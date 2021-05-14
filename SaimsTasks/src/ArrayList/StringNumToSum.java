package ArrayList;
import java.util.*;
public class StringNumToSum {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123","34","513");
//        list.add("123");
//        list.add("34");
//        list.add("513");
        System.out.println(getSum(list));
    }
    public static List<Integer> getSum(List<String> str){
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < str.size();i++){
            int sum = 0;
            for(int j = 0;j < str.get(i).length();j++){
                String isDigit = String.valueOf(str.get(i).charAt(j));
                int digit = Integer.parseInt(isDigit);
                sum += digit;
            }
            list.add(sum);
        }
        return list;
    }
}
