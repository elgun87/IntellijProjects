package ArrayPractice2;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int nums [] = {1,2,-3,4,-34,55,78,90,33,10};
        int countEven = 0;
        int countOdd = 0;

        for(int each : nums){
            if(each % 2 == 0){
                countEven++;
            }
            if(each % 2 != 0){
                countOdd++;

            }
        }

        System.out.println(countEven);//6
        System.out.println(countOdd);//4

        int evenArr [] = new int [countEven];
        int oddArr [] = new int [countOdd];
        int index1 = 0;
        int index2 = 0;
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));

//        int nums [] = {1,2,-3,4,-34,55,78,90,33,10};

        for(int i = 0;i < nums.length;i ++){
            if(nums[i] % 2 == 0){
                evenArr[index1] = nums[i];
                index1++;
            }
            if(nums[i] % 2 != 0){
                oddArr[index2] = nums[i];
                index2++;
            }
        }
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));

    }
}
