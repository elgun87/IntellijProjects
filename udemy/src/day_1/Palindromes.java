package day_1;

public class Palindromes {
    public static void main(String[] args){
        System.out.println(isPaldinrome("solos"));
    }
    public static boolean isPaldinrome(String str){
        int len = str.length()-1;
        boolean palindrome = false;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == str.charAt(len)){
                palindrome = true;
            }else{
                palindrome = false;
            }
            len --;
        }
        return palindrome;
    }
}
