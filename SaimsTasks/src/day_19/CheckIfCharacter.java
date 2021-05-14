package day_19;

public class CheckIfCharacter {
    public static void main(String[] args) {
        char letter = 'a';
        if(letter >= 65 && letter <= 90 ){
            System.out.println("Upper case");
        }else if(letter >= 97 && letter <= 122){
            System.out.println("Lower case");
        }

    }
}
