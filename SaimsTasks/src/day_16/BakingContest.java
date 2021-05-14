package day_16;

public class BakingContest {
    public static void main(String[] args) {
        /*

        You are in a baking contest. Your cookies will be rated by 3 judges.
        The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.
        Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2

        If your score is more than both of the other people then print "First place!"
        If your score is more then one other person then print "Second place"
        If your score is less than both of the other people then print "Third place"

         */
        int myScore = 4;
        int person1 = 5;
        int person2 = 6;

        if(myScore > person1 && myScore > person2){
            System.out.println("First place!");
        }else if(myScore > person1 && myScore < person2 || myScore > person2 && myScore < person1){
            System.out.println("Second place");
        }else {
            System.out.println("Third place");
        }
    }
}
