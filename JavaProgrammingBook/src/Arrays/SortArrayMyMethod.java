package Arrays;
import java.util.*;
public class SortArrayMyMethod {
    public static void main(String[] args) {
        int num[] = {6, 2, 7, 3, 5, 1, 4, 0};
        sortArray(num);
        System.out.println(Arrays.toString(num));
    }
    public static int[] sortArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                int temp = numbers[j];
                if (numbers[j] > numbers[j + 1]) {

                    numbers[j] = numbers[j + 1];

                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
}
