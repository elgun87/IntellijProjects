package Numbers;
import java.util.*;
public class PrintConsecutiveNumbers {
    public static void main(String[] args) {
        int num = 60;
        String str = "Codility";
        String str2 = "Test";
        String str3 = "Coders";
        String resultForAll = str + str2 + str3;
        for(int i = 1;i <= num;i++){
            if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0){
                System.out.println(resultForAll);
            }else if(i % 2 == 0 && i % 3 == 0){
                System.out.println(str + str2);
            }else if(i % 2 == 0 && i % 5 == 0){
                System.out.println(str + str3);
            }else if(i % 3 == 0 && i % 5 == 0){
                System.out.println(str2 + str3);
            }else if(i % 2 == 0){
                System.out.println(str);
            }else if(i % 3 == 0){
                System.out.println(str2);
            }else if(i % 5 == 0){
                System.out.println(str3);
            }else{
                System.out.println(i);
            }
        }
    }
}
