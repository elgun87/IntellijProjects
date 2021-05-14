package Methods;
import java.util.*;
public class PrintUniqeNumbers {
    public static void main(String[] args) {
        int nums[] = {2, 5, 5, 6, 3, 6, 9, 34, 3};
        printUniqueNumbers(nums);
    }
    public static void printUniqueNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int countForUniq = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    countForUniq++;
                }
            }
            if (countForUniq == 1) {
                System.out.println(nums[i]);
            }
        }
    }
}
