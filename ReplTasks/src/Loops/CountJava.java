package Loops;
import java.util.*;
public class CountJava {
    public static void main(String[] args) {
//        Scanner scan= new Scanner(System.in);
//        String word = scan.next();
//        String java = "java";
//
//        int countForJava = 0;
//
//        for(int i = 0;i < word.length();i++){
//            if(i + java.length() > word.length()){
//                break;
//            }
//            if(word.substring(i,i+ java.length()).equals(java)){
//                countForJava ++;
//            }
//        }
//        System.out.println(countForJava);

        String ta = "A";
        ta = ta + "B";
        String tb = "C";
        ta = ta + tb;
        ta = ta.replace('C','D');
        System.out.println(ta);
    }
}
