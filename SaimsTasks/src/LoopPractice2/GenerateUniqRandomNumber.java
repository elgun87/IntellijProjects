package LoopPractice2;
import java.util.*;
public class GenerateUniqRandomNumber {
    public static void main(String[] args) {
        Random input = new Random();
        int random = 0;
        String numbers = "";
        String digit = "";
        for(int i = 0;i < 6;i++){
            digit = "";
            random = input.nextInt(6)+1;
            digit += random;
            if( !(numbers.contains(digit))){
                numbers += digit;
            }else{
                i--;
            }
        }
        System.out.println(numbers + "psddword");
        int num = Integer.valueOf(numbers);
        System.out.println(num + 1);
    }
}
/*
for(int i = 0;i < 6;i++){
            digit = "";
            random = input.nextInt(7);
            if(random == 0){
                continue;
            }else{
                digit += random;
                if( !(numbers.contains(digit))){
                    numbers += digit;
                }else{
                    i--;
                }
            }
        }
 */
