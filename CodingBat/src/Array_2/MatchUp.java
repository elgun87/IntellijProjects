package Array_2;
import java.util.*;
public class MatchUp {
    public static void main(String[] args) {
        int num [] = {1,2,3};
        int num2 [] = {2,3,5};
        System.out.println(matchUp(num,num2));
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for(int i = 0;i < nums1.length;i++){
            if(nums2[i] != nums1[i]){
                int sum = nums2[i] - nums1[i];
                if(Math.abs(sum) <= 2){
                    count++;
                }
            }
        }
        return count;
    }
}
