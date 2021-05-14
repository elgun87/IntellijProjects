package Array;
import java.util.*;
public class Concat2Arrays {
    public static void main(String[] args){
        String str [] ={"a","b","c","d","f","e"};
        String str2 [] = {"g","h","j"};
        String str3 [] = {"w","u","1","2","3","4","5","6"};
        concatArray(str,str2,str3);
    }
    public static void concatArray(String str[],String str2[],String str3[]){
        String arr [] = new String [str.length + str2.length + str3.length];
        for(int i = 0,j = 0;i < arr.length;i++,j++){
            if(i < str.length){
                arr[i] =  str[j];
            }else if(i == str.length){
                j = 0;
            }
            if(i >= str.length - 1 && j < str2.length){
                arr[i] = str2[j];
            }else if(i == str.length + str2.length){
                j = 0;
            }
            if(i > (str.length + str2.length)-1){
                arr[i] = str3[j];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
