package Array_2;

import java.util.*;

public class Post4 {
    public static void main(String[] args) {
        int arr [] = {4, 4, 1, 4, 2, 3};
        arr = post4(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] post4(int[] nums) {
        String result = "";
        for(int i = nums.length-1;i >= 0;i--){
            if(nums[i] != 4){
                result += nums[i];
            }else{
                break;
            }
        }
        int num2 [] = new int[result.length()];
        for(int i = 0;i < num2.length;i++){
            String digit = String.valueOf(result.charAt(result.length()-1-i));
            num2[i] = Integer.parseInt(digit);
        }
        return num2;
    }
}
