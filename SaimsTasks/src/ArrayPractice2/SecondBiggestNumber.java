package ArrayPractice2;

public class SecondBiggestNumber {
    public static void main(String[] args){
        int numbers [] = {4,3,1,4,5,2,4,8,4,8};
        int max = 0;
        int max2 = 0;
        for(int i = 0;i < numbers.length;i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        for(int j = 0;j < numbers.length;j++){
            if(numbers[j] == max){
                continue;
            }else if(numbers[j] > max2){
                max2 = numbers[j];
            }
        }
        System.out.println(max);
        System.out.println(max2);
    }
}
