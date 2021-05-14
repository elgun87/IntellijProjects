package day_25;

import java.util.*;

public class WarmUp {
    public static void main(String[] args) {
        int num = 80;
        for(int i = num;i >= 20;i--){
            if(i % 2 == 0){
                if(i > 20){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i);
                }
            }
        }
    }
}
