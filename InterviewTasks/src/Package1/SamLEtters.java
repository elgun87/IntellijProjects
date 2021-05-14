package Package1;
import java.util.*;
public class SamLEtters {
    public static void main(String[] args) {
        System.out.println(isSameLetter("ab","ab"));
    }
    public static boolean isSameLetter(String str,String str2){
        boolean isLetterSame = true;
        if(str.length() > str.length()){
            for(int i = 0;i < str.length();i++){
                if(!str2.contains(String.valueOf(str.charAt(i)))){
                    isLetterSame = false;
                    break;
                }
            }
        }else{
            for(int i = 0;i < str2.length();i++){
                if(!str.contains(String.valueOf(str2.charAt(i)))){
                    isLetterSame = false;
                    break;
                }
            }
        }
        return isLetterSame;
    }
}
