package day_22;

public class MoveFirstWord {

    public static void main(String[] args) {

        String sentence = "Java is a fun language";

        int i_Am_First_Empty_Space_Index = sentence.indexOf(" ");

        String i_Am_First_Word = sentence.substring(0,i_Am_First_Empty_Space_Index);

        String new_sentence = sentence.substring(i_Am_First_Empty_Space_Index+1) + " " + i_Am_First_Word;

        System.out.println(new_sentence);
    }
}
