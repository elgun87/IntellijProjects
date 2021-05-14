package day_43_Array_List;
import java.util.*;
public class MethodWithReturn {
    public static void main(String[] args) {
        List<Integer> list = getRandomList(10);
        System.out.println(list);

    }
    public static List<Integer> getRandomList(int size){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < size;i++){
            if(!list.contains(random)){
                list.add(random.nextInt(100));
            }else{
                i--;
            }
        }
        return list;
    }
}
