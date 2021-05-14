package day_1;

public class stringPolindrome {
    public static void main(String[] args){
//        System.out.println(polindrome("hello"));

        System.out.println(reverse("civic"));
    }
    public static boolean polindrome(String str){
        String reverse = "";
        int len = str.length()-1;
        boolean check = false;
        for(int i = len;i >= 0;i--){
            reverse += str.charAt(i);
        }
        if(reverse.equalsIgnoreCase(str)){
            check = true;
        }
        return check;
    }

    public static boolean reverse(String str){
        boolean check = true;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) != str.charAt(str.length()-1 - i)){
                check = false;
            }
        }
        return check;
    }

}
