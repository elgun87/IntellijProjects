package Arrays;
import java.util.*;
public class InnerAndOuter {
    public static void main(String[] args){
        int[] outter = {1, 2, 4, 6};
        int[] inner = {2, 4};
        boolean check = false;
        for(int i = 0;i < inner.length;i++){
            for(int j = 0;j < outter.length;j++){
                if(inner[i] == outter[j]){
                    check = true;
                }
            }
        }
        System.out.println(check);
    }
}
