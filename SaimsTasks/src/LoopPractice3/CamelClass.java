package LoopPractice3;

public class CamelClass {
    public static void main(String[] args){
        /*
        Given a String of words that follow Camel Case convention.
        Find and print how many words are in the given String.Every word, except the first word, begin with an uppercase letter.
        The other characters of the word will be lowercase
         */
        String str = "thisHasManyWordsToFind";
        int countWord = 1;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                countWord++;
            }
        }
        System.out.println(countWord);
    }
}
