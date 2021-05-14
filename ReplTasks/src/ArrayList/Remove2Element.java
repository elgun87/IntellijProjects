package ArrayList;
import java.util.*;
public class Remove2Element {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < 5 ;i++){
            list.add(random.nextInt(20)+1);
        }
        System.out.println(list);

        int previousSize = list.size();
        for(int i = 0;i < list.size();i++){
            int num = list.get(i);
            list.remove(new Integer(num));
            i = -1;
            if(list.size() == previousSize - 4){
                break;
            }
        }
        System.out.println(list);
    }
}
//[2, 17, 17, 16, 13]