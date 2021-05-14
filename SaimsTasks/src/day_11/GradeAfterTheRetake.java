package day_11;
import java.util.*;
public class GradeAfterTheRetake {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you score please");
        int score = input.nextInt();
        System.out.println("Enter you attempt");
        int attempt = input.nextInt();

        if(attempt == 1){
            score = score - (score * 10 / 100);
            System.out.println(score);
        }else if(attempt == 2){
            score = score - (score * 20 / 100);
            System.out.println(score);
        }else if(attempt == 3){
            score = score - (score * 35 / 100);
            System.out.println(score);
        }else{
            System.out.println("Invalid entry");
        }

    }
}
