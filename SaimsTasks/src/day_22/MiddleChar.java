package day_22;

public class MiddleChar {
    public static void main(String[] args) {
        String str = "apple";
        int len = str.length();
        if(len % 2 == 0){
            System.out.println(str.substring(len/2-1,len/2+1));
        }else if(len % 2 != 0){
            System.out.println(str.substring(len/2,len/2+1));
        }
    }
}
