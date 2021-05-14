package day_1;
import java.util.Scanner;
public class myMethod {
    public static void main(String[] args){

        String str = getInputFromUser();
        System.out.println("Words in this string are followed: " + convertToString(str));
        int num = CountWords(str);
        System.out.println("The number of words in this sentences is: " + num);


    }
    public static String getInputFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence to be analyzed: ");
        String str = input.nextLine();
        return str;
    }
    public static int CountWords(String str){
        String new_str[] = str.split(" ");
        int count = 0;
        for(int i = 0;i < new_str.length;i++){
            count ++;
        }
        return count;
    }

    public static String convertToString(String str){
        String new_str[] = str.split(" ");
        String words = "[";
        for(int i = 0;i < new_str.length;i++){
            if(i < new_str.length - 1){
                words += new_str[i] + ",";
            }else{
                words += new_str[i];
            }

        }
        words += "]";
        return words;
    }

}
