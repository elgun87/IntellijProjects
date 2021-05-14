package String_2;

public class MovingFisrtChar {
    public static void main(String[] args){
        String str = "1234567890";
        System.out.println(oneTwo(str));
    }
    public static String oneTwo(String str){
        String result = "";
        for(int i = 0;i < str.length()-2;i+=3){
            result += str.substring(i + 1,i + 3) + String.valueOf(str.charAt(i));
        }
        return result;
    }
}