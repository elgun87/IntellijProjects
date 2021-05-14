package Array_2;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class Only14 {
    public static void main(String[] args) {
        int nums [] = {1, 4, 1, 4};
        only14(nums);

    }

    public static boolean only14(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i ] == 1) {
                list.add(true);
            }else if (nums[i] == 4) {
               list.add(true);
            }else{
                list.add(false);
            }
        }

        if(list.contains(false)){
            return false;
        }else{
            return true;
        }
    }
}
