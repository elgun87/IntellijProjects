package Arrays;
import java.util.*;
public class chheeseBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        String result = "";
        //WRITE YOUR CODE HERE
        for(int i = 0;i < chessBoard.length;i ++){
            char letter = 'a';
            for(int j = 0; j < chessBoard[i].length;j ++){
                result += (i+1) + "" + letter;
                chessBoard[i][j] = result;
                letter++;
                result = "";
            }
        }

        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
