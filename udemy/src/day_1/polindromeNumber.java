package day_1;

public class polindromeNumber {
    public static void main(String[] args) {
        System.out.println(polindromeNum(121));
    }
    public static boolean polindromeNum(int num){
        int digit = 0;
        int num1 = num;
        boolean check = false;
        while(num > 0){
            digit = digit * 10 + num % 10;
            num /= 10;
        }

        if(digit == num1){
            check = true;
        }
        return check;
    }
}
