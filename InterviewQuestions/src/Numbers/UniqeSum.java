package Numbers;
import java.util.*;
public class UniqeSum {
    public static void main(String[] args){
        arr(10);
    }
    public static void arr(int num){
        Random random = new Random();
        int arr [] = new int[num];
        String str = "";
        int num2 = num;
        int sum = 0;
        boolean runOneTime = true;boolean stopSeconDloop = true;
        for(int i = 0;i < num;i++){
            int randNum = random.nextInt(num);
            if(str.length() < num-1 && runOneTime){
                if(!str.contains(String.valueOf(randNum))){
                    str += randNum;
                    arr[i] = randNum;
                }else{
                    i--;
                }
            }else{
                if(stopSeconDloop){
                    for(int j = 0;j < str.length();j++){
                        if(Character.isDigit(str.charAt(j))){
                            String digitStr = String.valueOf(str.charAt(j));
                            int digit = Integer.parseInt(digitStr);
                            sum += digit;
                        }
                    }
                }
                stopSeconDloop = false;//this boolean will stop to count the sum again
                runOneTime = false;//this boolean will stop readd the random num to str
                randNum = random.nextInt(sum+1);
                if(randNum - sum == 0){
                    if(!str.contains(String.valueOf(randNum))){
                        str += randNum;
                        arr[i] = randNum;
                    }else{
                        i--;
                    }
                }else{
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
