package day_33;
import java.util.*;
public class WarmUp {
    public static void main(String[] args){
        int num [] = {4,5,6,7,8};
        int len = num.length-1;
        for(int i = 0;i <= num.length/2;i++){
           int first = num[i];
           int last = num[len];
           num[i] = last;
           num[len] = first;
           len--;

        }
        System.out.println(Arrays.toString(num));
    }
}
