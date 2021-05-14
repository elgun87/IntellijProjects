package LoopPractise;

public class EvenNumberDevidedBy3And5 {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 100){
            if(num % 2 == 0){
                if(num % 3 == 0 && num % 5 == 0){
                    System.out.println(num + " ");
                }
                num++;
            }
        }
    }
}
