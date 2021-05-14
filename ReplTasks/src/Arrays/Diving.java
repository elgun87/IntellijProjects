package Arrays;
import java.util.*;
public class Diving {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        for(int i = 0;i < score.length;i++){
            System.out.println("Enter score for judge " + (i+1));
            score[i] = input.nextFloat();
        }
        //WRITE YOUR CODE HERE
        System.out.println("Enter difficulty: ");
        float difficulty = input.nextFloat();

        float max = score[0];
        float min = score[0];
        float sum = 0;
        for(int i = 0;i < score.length;i++){
            if(score[i] > max){
                max = score[i];
            }
            if(score[i] < min){
                min = score[i];
            }
        }
        for(int i = 0;i < score.length;i++){
            if(score[i] == max || score[i] == min){
                continue;
            }else{
                sum += score[i];
            }
        }
        float result = sum * difficulty * (float)(0.6);
        System.out.println(result);
    }
}
