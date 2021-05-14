package Array_2;
import java.util.*;
public class CenteredAvarage {
    public static void main(String[] args){
        int num [] = {1, 1, 5, 5, 10, 8, 7};
        System.out.println(findAvarage(num));
    }

    public static int findAvarage(int num []){
        int sum = 0;
        int count = 0;
        int countDoubles = 0;
        Arrays.sort(num);
        for(int i = 1 ;i < num.length - 1;i++){
            if(num[i] == num[i+1]){
                countDoubles++;
                if(countDoubles <= 1){
                    sum += num[i];
                    count++;
                }else{
                    continue;
                }
            }else{
                sum += num[i];
                count ++;
                countDoubles = 0;
            }
        }
        return sum / count;
    }
}
