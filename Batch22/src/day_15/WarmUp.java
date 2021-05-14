package day_15;

public class WarmUp {
    public static void main(String[] args){
      int a = 1;
      int b = 2;
      int c = 3;
      int d = 4;
      int e = 5;
      if( a < 1 || (b < 2 || c == 3 ) || d == 4 && e > 5){
          System.out.println(true);
      }else{
          System.out.println(false);
      }
    }
}
