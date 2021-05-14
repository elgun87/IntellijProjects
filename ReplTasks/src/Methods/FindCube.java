package Methods;
import java.util.*;
public class FindCube {
    public static void main(String[] args) {
        cube();
    }
    public static void cube(){
        int num = 12;
        int sum = 1;
        for(int i = 1; i <= 3;i++){
            sum *= num;
        }
        System.out.println(sum);
    }
}
