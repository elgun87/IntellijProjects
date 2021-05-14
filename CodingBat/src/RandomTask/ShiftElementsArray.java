package RandomTask;
import java.util.*;
public class ShiftElementsArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};//6,5,1,2,3,4
        int temp = arr[arr.length-1];
        int tem2 = arr[arr.length-2];

        for(int i = arr.length-1; i > 1;i--)
        {
            arr[i] = arr[i - 2];
        }
        arr[0] = temp;
        arr[1] = tem2;
        System.out.println(Arrays.toString(arr));
    }
}
