package ArrayList;
import java.util.*;
public class RepeatAll {
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add(false);
        repeatAll(list);
    }
    public static void repeatAll(List<Boolean> list){
        int size = list.size() * 2;
        List<Boolean> list2 = new ArrayList<>();
        for(int i = 0,j = 0;i < size + 1;i++,j++){
            if(j <= list.size()-1){
                list2.add(list.get(j));
            }else{
                j = -1;
            }
        }
        System.out.println(list2);
    }
}
