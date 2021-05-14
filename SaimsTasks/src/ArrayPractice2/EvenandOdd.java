package ArrayPractice2;
import java.util.*;
public class EvenandOdd {
    public static void main(String[] args) {
        int arr [] = {1,2,-3,4,-34,55,78,90,33,10};
        int countEven = 0;
        int countOdd = 0;
        int index = 0;
        int index1 = 0;
        for(int each : arr ){
            if(each % 2 == 0){
                countEven ++;
            }
            if(each % 2 != 0){
                countOdd++;
            }
        }

        int arrEvenNum [] = new int [countEven];
        int arrOdd [] = new int [countOdd];
       for(int i = 0;i < arr.length;i++){
           if(arr[i] % 2 == 0){
               arrEvenNum[index] = arr[i];
               index++;
           }
           if(arr[i] % 2 != 0){
               arrOdd[index1] = arr[i];
               index1++;
           }
       }
        System.out.println(Arrays.toString(arrEvenNum));
        System.out.println(Arrays.toString(arrOdd));

    }
}
