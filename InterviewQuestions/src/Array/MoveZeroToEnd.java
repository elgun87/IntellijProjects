package Array;

import java.util.*;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        /*
        input:  {1,0,2,0,3,0,4,0};
        output: [1, 2, 3, 4, 0, 0, 0, 0]
         */
        int num[] = {1, 0, 2, 0, 3, 0, 4, 0};
        num = zeroToEnd(num);
        System.out.println(Arrays.toString(num));
    }

    public static int[] zeroToEnd(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                if (num[i] == 0) {
                    int temp = num[i];
                    if (num[i] <= num[j]) {
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }
        }
        return num;
    }
}
