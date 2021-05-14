package Arrays;
import java.util.*;
public class ShiftingElement {
    public static void main(String[] args) {

        int nums [] = {45,5,7,8,4,2};
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length - 1 ] = temp;
        System.out.println(Arrays.toString(nums));
        boolean list [] = {true,false,true};
    }
}
