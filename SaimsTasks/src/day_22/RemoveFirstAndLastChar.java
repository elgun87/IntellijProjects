package day_22;

public class RemoveFirstAndLastChar {
    public static void main(String[] args) {
        String str = "apple";
        String str2 = "banana";
        System.out.println(str.substring(1) + "\n" + str2.substring(0,str.length()-1));
    }
}
