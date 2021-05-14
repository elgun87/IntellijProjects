package Arrays;
import java.util.*;
public class ZombieAttack1 {
    public static void main(String[] args){

        int inhabitants [] = {3, 6, 0, 4, 3, 2, 7, 0};
        int day = 0;
        int max = 0;
        for(int each : inhabitants){
            if(each > max){
                max = each;
            }
        }

        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

        while(max != 0){
            for(int i = 0;i < inhabitants.length;i++){
               inhabitants[i] /= 2;
                if(i == inhabitants.length-1){
                    day++;
                    System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
                    if(max == 1){
                        System.out.println("---- EXTINCT ----");
                    }
                }
            }
            max /= 2;
        }
    }
}
