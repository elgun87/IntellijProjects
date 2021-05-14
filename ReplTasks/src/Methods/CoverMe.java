package Methods;
import java.util.*;
public class CoverMe {
    public static void main(String[] args) {
        String result = coverString("Java methods", "me");
        System.out.println(result);
    }
    public static String coverString(String main,String coverME){
        String result = "";
        if(main.contains(coverME)){
            for(int i = 0;i < main.length();i++){
                if(i + coverME.length() > main.length()){
                    result += main.charAt(i);
                    break;
                }
                if(main.substring(i,i + coverME.length()).equals(coverME)){
                    result += "[" + coverME + "]";
                    i += coverME.length()-1;
                }else{
                    result += main.charAt(i);
                }
            }
        }else{
            result = "[" + main + "]";
        }
       return result;
    }
}
