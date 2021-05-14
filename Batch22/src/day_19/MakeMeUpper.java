package day_19;

public class MakeMeUpper {
    public static void main(String[] args) {
        String str = "cyberteck";
        System.out.println(str);
        makeMeUpper(str);//This method make an upper case

    }
    public static void makeMeUpper(String str){
        char letter = ' ';
        char upperCase = ' ';
        for(int i = 0;i < str.length();i++){
            if(i == 0){
                letter = str.charAt(i);
            }
        }
        int index = letter;
        if(letter >= 97 && letter <= 122){
            upperCase = (char) (index - 32);
        }
        str = upperCase + str.substring(1);

        System.out.println(str);
    }
}
