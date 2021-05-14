package Arrays;
import java.util.*;
public class GreatestCommonDivisorsMethod {
    public static void main(String[] args) {
        int num = gcd(45,75);
        System.out.println(num);
    }
    public static int gcd(int n1,int n2){
        int result = 0;
        for(int i = 1;i <= n1 || i <= n2;i++){
            if(n1 % i == 0 && n2 % i == 0){
                result = i;
            }
        }
        return  result;
    }
}
