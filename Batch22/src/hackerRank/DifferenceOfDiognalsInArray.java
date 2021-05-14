package hackerRank;
import java.util.*;
public class DifferenceOfDiognalsInArray {
    public static void main(String[] args) {
        int [][] nums = {{1,8,6},
                         {7,9,6},
                         {4,9,2}};

        System.out.println(differenceDiognals(nums));
    }
    public static int differenceDiognals(int[][] numbers) {

        int leftDiognal = 0;
        int rightDiognal = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j) {
                    leftDiognal += numbers[i][j];
                }
            }
            for (int k = numbers[i].length - 1; k >= 0; k--) {
                if (i + k == numbers[i].length - 1) {
                    rightDiognal += numbers[i][k];
                }
            }
        }
        int result = leftDiognal - rightDiognal;
        return Math.abs(result);
    }
}
