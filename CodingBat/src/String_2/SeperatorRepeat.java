package String_2;

public class SeperatorRepeat {
    public static void main(String[] args){
        System.out.println(repeatSeparator("word","x",7));
    }
    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";
        while(count > 0){
            if(count == 1){
                result += word;
            }else{
                result += word + sep;
            }
            count--;
        }
        return result;
    }
}
