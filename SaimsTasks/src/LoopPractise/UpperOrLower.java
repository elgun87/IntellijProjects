package LoopPractise;
import java.util.*;
public class UpperOrLower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Upper or Lower");
        String result = input.next();
        if(result.equalsIgnoreCase("upper")){
            char letter = 'A';
            System.out.println("Would you like to display it in ascending or order descending?");
            String select = input.next();
            if(select.equalsIgnoreCase("ascending")){
                while (letter <= 90){
                    System.out.print(letter + " ");
                    letter++;
                }
            }else if(select.equalsIgnoreCase("descending")){
                letter = 'Z';
                while (letter >= 65){
                    System.out.print(letter + " ");
                    letter --;
                }
            }

        }else if(result.equalsIgnoreCase("lower")){
            char letter = 'a';
            System.out.println("Would you like to display it in ascending or order descending?");
            String select = input.next();
            if(select.equalsIgnoreCase("ascending")){
                while (letter <= 122){
                    System.out.print(letter + " ");
                    letter++;
                }
            }else if(select.equalsIgnoreCase("descending")){
                letter = 'z';
                while (letter >= 97){
                    System.out.print(letter + " ");
                    letter --;
                }
            }
        }
    }
}
