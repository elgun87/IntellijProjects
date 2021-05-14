package LoopPractice3;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 0;
        int countPrime = 0;

        for (int i = 1; i <= 50; i++) {
            countPrime = 0;
            for (int j = 1; j <= i; j++) {

                if (i % 1 == 0 && i % j == 0) {
                    countPrime++;
                }
            }
            if (countPrime == 2 ){
                System.out.print(i + " ");
            }
        }
    }
}