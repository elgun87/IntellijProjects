package day_1;
import java.util.*;
public class addeElementsToEach {
    public static void main(String[] args){
        int num1[] = {10,40,50,3,1};
        int num2[] = {11,00,500,44,1101};

        int arr[] = addElement(num1,num2);
        System.out.print(Arrays.toString(arr));
    }
    public static int[] addElement(int num1[], int num2[]){
        int num3[] = new int[num1.length];
        for(int i = 0;i < num1.length;i++){

            for(int j = 0;j < num2.length;j++){
                if(i == j){
                    num3[i] = num1[i] + num2[j];
                }

            }
        }
        return num3;
    }
}
