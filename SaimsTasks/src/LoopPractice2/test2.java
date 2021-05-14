package LoopPractice2;

public class test2 {
    public static void main(String[] args) {
        String word = "aabbcccddeeeeee";
        String a = "";
        String b = "";
        for (int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i)==word.charAt(i+1)){
                a += word.charAt(i);
            }else{
                a +=word.charAt(i);
                if(a.length() > b.length()){
                    b =  a;
                    a = "";
                }else{
                    a = "";
                }
            }
            if(i + 1 == word.length()-1){
                if(a.length() > b.length()){
                    b = a;
                }
            }
        }
        System.out.println(b);
    }
}
