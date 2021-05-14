package ArrayPractice1;

public class AvarageNumber {
    public static void main(String[] args){
        int [] arr1 = {4, 5, 6, 7, 8, 10, 20, 30, 0};
        System.out.println(avarageValueOfArray(arr1));
    }
    public static int avarageValueOfArray(int [] nums){
        int count = 0;
        int sum = 0;
        for(int number : nums){
            sum += number;
            count++;
        }
        return sum / count;
    }
}
