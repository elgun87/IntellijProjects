package ArrayPractice2;
import java.util.*;
public class GradeBook {
    public static void main(String[] args) {
        String student [] = {"Mike","Joe","Ana","Ali","Joanna"};
        int score [] = {80, 54, 100, 66, 94};
        char letter [] = {'A','B','A','C','A'};

        for(int i = 0;i < score.length;i++){
            System.out.println(student[i] + " | " + score[i] + " | " + letter[i]);
        }
    }
}
