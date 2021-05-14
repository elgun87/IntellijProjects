package Array_2;
import java.util.*;
public class Sum67 {
    public static void main(String[] args) {
        int nums [] = {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};
        System.out.println(sumOf67(nums));
    }

    public static int sumOf67(int nums[]){
        int sum = 0;
        boolean iSawNumber6 = false;
        boolean check = true;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 6 && !iSawNumber6){
                iSawNumber6 = true;
                check = false;
            }else if(nums[i] == 7 && i != nums.length-1 && iSawNumber6){
                iSawNumber6 = false;
                if(nums[i+1] != 6){
                    check = true;
                }
                i++;
            }
            if(nums[i] != 6 && check){
                sum += nums[i];
            }
        }
        return sum;
    }
}
