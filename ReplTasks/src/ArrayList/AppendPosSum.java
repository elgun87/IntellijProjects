package ArrayList;
import java.util.*;
public class AppendPosSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,-6,3,-8,0,4,3);
        List<Integer> newList = new ArrayList<>();
        newList = appendPosSum(list);
        System.out.println(newList);
    }

    public static List<Integer> appendPosSum(List<Integer> list){
        int sum = 0;
        List<Integer> positiveList = new ArrayList<>();
        for(int i = 0;i < list.size();i++){
            if(list.get(i) > 0){
                positiveList.add(list.get(i));
                sum += list.get(i);
            }
        }
        positiveList.add(sum);
        return positiveList;
    }
}
