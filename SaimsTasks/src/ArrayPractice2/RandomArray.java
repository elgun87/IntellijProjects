package ArrayPractice2;
import java.util.*;
public class RandomArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("How many number you want in the array");
        int size = input.nextInt();
        System.out.println("Max number you want for random numbers");
        int n = input.nextInt();

        int arr [] = new int[size];
        for(int i = 0;i < size;i ++){
            arr[i] = ran.nextInt(n)+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
