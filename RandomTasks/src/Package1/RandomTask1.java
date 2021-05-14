package Package1;

import java.util.*;

public class RandomTask1 {
    public static void main(String[] args) {
        //Input  [ 1,2,3,4,6,8,9,13,15]
        //output [ "1-4","6","8-9","13","15"]
        int num[] = {1,2,3,4,5,6,7,8,9,13,15,19,21,22,23,25};
        List<String> list = new ArrayList<>();
        System.out.println(list = sortNumbers(num));
    }
    public static List<String> sortNumbers(int num[]) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 1; i < num.length; i++) {
            if (num[i] - num[i - 1] == 1) {
                if (!list2.contains(String.valueOf(num[i-1]))) {
                    list2.add(String.valueOf(num[i-1]));
                    list2.add(String.valueOf(num[i]));
                } else {
                    list2.add(String.valueOf(num[i]));
                }
            } else {
                if(!list2.isEmpty()){
                    list.add(list2.get(0) + "-" + list2.get(list2.size()-1));
                    list2.clear();
                }
                if(i + 1 <= num.length - 1){
                    if(num[i+1] - num[i] != 1){
                        list.add(String.valueOf(num[i]));
                    }
                }else{
                    list.add(String.valueOf(num[i]));
                }
            }
        }
       return list;
    }
}
