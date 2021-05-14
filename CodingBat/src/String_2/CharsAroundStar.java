package String_2;

public class CharsAroundStar {
    public static void main(String[] args){
        String str = "xy*yzz";
        System.out.println(sameStarChar(str));
    }
    public static boolean sameStarChar(String str){
        int count = 0;
        boolean check = true;
        if(str.contains("*")){
            for(int i = 1;i < str.length();i ++){
                if(str.charAt(i) == '*'){
                    if(str.charAt(i-1) != str.charAt(i+1)){
                        count++;
                    }
                }
            }
        }
        if(count >= 1){
            check = false;
        }
        return check;
    }
}
