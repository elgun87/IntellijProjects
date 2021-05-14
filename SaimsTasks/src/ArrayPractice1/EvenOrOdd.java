package ArrayPractice1;

public class EvenOrOdd {
    public static void main(String[] args){
        int countEven = 0;
        int countOdd = 0;
        int nums [] = {4,1,3,12,5};

        for(int number : nums){
            if(number % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    }
}
