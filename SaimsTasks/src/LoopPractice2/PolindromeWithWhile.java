package LoopPractice2;

public class PolindromeWithWhile {
    public static void main(String[] args) {
        String str = "racecar";
        int firstIndex = 0;
        int polindromeCounter = 0;
        int lastIndex = str.length()-1;

        while(firstIndex != lastIndex){
            if(str.charAt(firstIndex) != str.charAt(lastIndex)){
                System.out.println("not polindrome");
                break;
            }else{
                polindromeCounter++;
            }
            firstIndex++;
            lastIndex--;
        }
        if(polindromeCounter == str.length()/2){
            System.out.println("The word is polindrome");
        }
    }
}