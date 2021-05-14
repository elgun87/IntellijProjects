package ArrayList;
import java.util.*;
public class Nanuk {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");list.add("10");list.add("nanuk");list.add("nanuk");list.add("nanuk");list.add("3");
        nanuk(list,2,7);
    }
    public static boolean nanuk(List<String> r,int way_stones,int boast) {
        int sum = 0;
        int countNanuk = 0;
        for(int i = 0;i < r.size();i++){
            if(!r.get(i).equals("nanuk")){
                sum += Integer.parseInt(r.get(i));
            }
            if(r.get(i).equals("nanuk")){
                countNanuk++;
            }
        }
        if(countNanuk >  way_stones || boast > sum){
            return false;
        }else{
            return true;
        }
    }
}
