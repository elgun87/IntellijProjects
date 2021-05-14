package LoopPractice3;

public class UniqeChars {
    public static void main(String[] args){
        String str = "AAABCCDEEF";
        String result = "";

        for(int i = 0;i < str.length();i++){
            for(int j = 0;j < str.length();j++){
                if(str.charAt(i) == str.charAt(j) && i != j){
                    str= str.replace(String.valueOf(str.charAt(i)),"");
                }
            }
        }
        System.out.println(str);
    }
}
