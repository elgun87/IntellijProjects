package day_11;
import java.util.*;
public class VoteForPresident {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age to see if your are eligible to vote:");
        int ageOfUser = input.nextInt();
        int ageToBeEligibleToVote = 18;
        if(ageOfUser >= ageToBeEligibleToVote){
            System.out.println("Your are " + ageOfUser + " year old and eligible to vote.");
        }else if(ageOfUser < ageToBeEligibleToVote){
            System.out.println("Your are " + ageOfUser + " year old and not eligible to vote.");
        }
    }
}
