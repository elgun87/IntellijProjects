package Arrays;
import java.util.*;
public class MakeLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int numbers [] = new int[nums.length * 2];
        numbers[numbers.length-1] = nums[nums.length-1];

        System.out.println(Arrays.toString(numbers));


    }
}
