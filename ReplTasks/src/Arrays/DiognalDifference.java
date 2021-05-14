package Arrays;
import java.util.*;
public class DiognalDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrix[][] = {{11, 7, 4}, {1, 5, 7}, {10, 1, -12}};

        int indexForRight = 0;
        int sum1 = 0;
        int sum2 = 0;
        int difference = 0;

        for (int i = 0; i < matrix.length; i++) {
            indexForRight++;
            boolean check = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum1 += matrix[i][j];
                }
                if((i+1) == indexForRight && !check){
                    sum2 += matrix[i][matrix[i].length - indexForRight];
                    check = true;
                }
            }
        }
        difference = sum1 - sum2;
        System.out.print(Math.abs(difference));
    }
}
