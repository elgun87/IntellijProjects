package day_33;
import java.util.*;
public class ForLoop2Var {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str [][] = {{"Mike Artrur","Mike123"},{"Jason Mike","Coole1233"},{"Johnny avard","Avard123"},{"Ford","Fiesta"}};


        for(int i = 1;i < str.length-1;i++){
           for(int j = 0;j < str[i].length;j++){
                str[i-1][j] = str[i][j];

            }
        }
        System.out.println(Arrays.deepToString(str));
    }
}
