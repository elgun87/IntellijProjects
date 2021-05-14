package day_31;
import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {

        int num = 453964081;
        String numbers = String.valueOf(num);
        char n [] = numbers.toCharArray();
        Arrays.sort(n);
        System.out.println(n[0]);

        // Using List array
        List <Integer> listNumber = new ArrayList<>();
        while(num != 0){
            listNumber.add(num % 10);
            num /= 10;
        }
        int min = listNumber.get(0);
        for(int i = 0;i < listNumber.size();i++){
            if(listNumber.get(i) < (min)){
                min = listNumber.get(i);
            }
        }
        System.out.println(min);
    }
}
