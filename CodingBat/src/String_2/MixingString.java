package String_2;

public class MixingString {
    public static void main(String[] args) {
        String str = "There";
        String str2 = "Hi";
        System.out.println(mixString(str, str2));
    }

    public static String mixString(String a, String b) {
        String result = "";
        if(a.isEmpty()){
            return b;
        }else if(b.isEmpty()){
            return a;
        }else{
            for(int i = 0;i < a.length();i ++){

                for(int j = 0;j < b.length();j++){
                    if(i == j){
                        result += String.valueOf(a.charAt(i)) + String.valueOf(b.charAt(i));
                        if(i == a.length()-1){
                            result += b.substring(i+1);
                        }else if(j == b.length()-1){
                            result += a.substring(j+1);
                        }
                        break;
                    }

                }
            }
        }

        return result;
    }
}
