package day_1;
import java.util.*;
public class ErrorInMatrix {
    public static void main(String[] args){
        String num[] = {"a","d","2","4"};
        String num1[] = {"s","f","5","6"};

        System.out.print(Arrays.toString(printMatrix(num)));
        System.out.println();
        System.out.print(Arrays.toString(printMatrix(num1)));
        System.out.println();
        boolean check = Arrays.equals(num,num1);
        System.out.println(check);


    }
    public static String[] printMatrix(String[] num1){
        for(int i = 0;i < num1.length;i++){
            if(i % 2 == 0){
                num1[i] = "\"0\"";
            }else{
                num1[i] = "\"1\"";
            }
        }
        return num1;
    }
}
