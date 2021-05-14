package Arrays;
import java.util.*;
public class NonDuplicate {
    public static void main(String[] args) {
        int nums [] =  {1, 1, 2, 3, 4, 3, 4};
        int nonDuplicate = 0;

        for(int i = 0;i < nums.length;i++){
            int count = 0;
            for(int j = 0;j < nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                nonDuplicate = nums[i];
            }
        }
        System.out.println(nonDuplicate);
    }
}
