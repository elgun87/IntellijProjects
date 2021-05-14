package Arrays;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int nums [] = {4, 12, 45, 65, 234, 12, 34,45,85,78};
        System.out.println(Arrays.toString(nums));
        int index = nums.length-1;
        for(int i = 0;i < nums.length;i++){
            int lastElement = nums[index];
            int firstElement = nums[i];
            nums[i] = lastElement;
            nums[index] = firstElement;
            System.out.println(index);
            System.out.println(i);
            if(index == i || index - i == 1){
                System.out.println("break oldu");
                break;
            }
            index--;
        }
        System.out.println(Arrays.toString(nums));

    }
}
