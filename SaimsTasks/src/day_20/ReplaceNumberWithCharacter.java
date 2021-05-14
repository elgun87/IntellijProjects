package day_20;

public class ReplaceNumberWithCharacter {
    public static void main(String[] args){
        String message = "java class is fun";
        int number = 2;
        switch (number){
            case 1:
                message = message.replace("a","e");
                break;
            case 2:
                message = message.replace("s","r");
                break;
            case 3:
                message = message.replace("o","z");
                break;
        }
        System.out.println(message);
    }
}
