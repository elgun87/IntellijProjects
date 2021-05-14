package Arrays;
import java.util.*;
public class FrontPiece {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int num [] = new int[size];
        for(int i = 0;i < size;i++){
            num[i] = scan.nextInt();
        }
        if(num.length < 2){
            int arr1 [] = new int [num.length];
            arr1[0] = num[0];
            System.out.println(Arrays.toString(arr1));
        }else{
            int arr1 [] = new int[2];
            arr1[0] = num[0];
            arr1[1] = num[1];
            System.out.println(Arrays.toString(arr1));
        }

    }
}
