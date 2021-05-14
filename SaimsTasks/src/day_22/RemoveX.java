package day_22;

public class RemoveX {
    public static void main(String[] args) {
        String word = "xHiX";

        if(word.substring(0,1).equalsIgnoreCase("x") || (word.substring(word.length()-1).equalsIgnoreCase("x"))){
            word = word.replace("x","").replace("X","");
        }
        System.out.println(word);
    }
}
