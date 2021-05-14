package day_24;
import java.util.*;
public class GuessNumberWithComp {
    public static void main(String[] args)throws InterruptedException {
        Random random = new Random();
        int guessMe = random.nextInt(15);
        boolean stopWhile = true;
        int attempCounter = 1;
        int attemp = 5;

        System.out.println("I am a secret number " + guessMe);
        while (stopWhile){

            System.out.println("You have " + (attemp--) + " attempt to find the number");
            System.out.println("Please guess a number");
            int compGuessedNum = random.nextInt(15);
            System.out.println("Computer guessed number is " + compGuessedNum);

            if(compGuessedNum == guessMe){
                System.out.println("Congratulations you find the number at " + attemp + " attemp");
                System.out.println("Guessed number was " + guessMe);
                stopWhile = false;
            }else if(attempCounter == 5){
                System.out.println("Sorry you tried all attemp.Try next time");
                break;
            }

            attempCounter ++;
        }
    }
}
