package day_1;

public class countNumber {
    public static void main(String[] args){
        System.out.println(countNumberElement(1247859));
    }
    public static int countNumberElement(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count ++;
        }
        return count;
    }
}
