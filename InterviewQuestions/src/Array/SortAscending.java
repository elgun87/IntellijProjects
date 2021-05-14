package Array;
import java.util.*;
public class SortAscending {
    public static void main(String[] args){
        int num[] = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sortArr(num)));
    }
    public static int[] sortArr(int [] num){
        for(int i = 0;i < num.length;i++){

            for(int j = 0;j < num.length;j++){

                if(num[i] > num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }
}
