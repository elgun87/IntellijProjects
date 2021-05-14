package day_37;

public class MethodPractice {
    public static void main(String[] args) {
        String word = "Hello hello";
        int num = addition(word);
        int num2 = calcIndex(num);
        System.out.println(num2);
        System.out.println(addition(3,6));
    }
    public static int addition(String str) {
        int index = str.indexOf(" ");
        return index;
    }
    public static int calcIndex(int num) {
        if(num % 2 == 0) {
            num += 2;
        }else {
            num -= 1;
        }
        return num;
    }
    public static double addition(double d, int n) {
        double sum = d + n;
        return sum;
    }

}
