package String_2;

public class ZipZap {
    public static void main(String[] args) {
        String str = "zzzopzop";
        System.out.println(zapZip(str));
    }
    public static String zapZip(String str){
        String result = "";
        if(str.length()>3){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                    result += str.charAt(i) + "" + str.charAt(i+2);
                    i = i + 2;
                }else{
                    result+= str.charAt(i);
                }
            }
        }else{
            result = str;
        }
        return result;
    }
}
