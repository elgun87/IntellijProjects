package Numbers;
import java.util.*;
public class PrintWithoutLoop {
    public static void main(String[] args){
        printNum(1,50);
    }
    public static void printNum(int num,int num2){
        System.out.println(num);
        num++;
        if(num <= num2){
            printNum(num,num2);
        }
    }
}
