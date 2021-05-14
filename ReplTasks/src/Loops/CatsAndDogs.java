package Loops;
import java.util.*;
public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        String cat = "cat";
        String dog = "dog";

        for(int i = 0;i < word.length();i ++){
            if(i + dog.length() > word.length()){
                break;
            }
            if(word.substring(i,i + cat.length()).equals(cat)){
                countOfCats++;
            }
            if(word.substring(i,i+dog.length()).equals(dog)){
                countOfDogs++;
            }
        }
        if(countOfCats == countOfDogs){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
