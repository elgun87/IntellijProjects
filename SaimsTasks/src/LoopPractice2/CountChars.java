package LoopPractice2;

public class CountChars {
    public static void main(String[] args) {
        String word = "jajvaaaaabbggahahaa";
        String result = "";

        for(int i = 0;i < word.length();i++){
            int count = 0;
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    count ++;
                }
                if(j == word.length()-1){
                    if(!result.contains(String.valueOf(word.charAt(i)))){
                        result += word.charAt(i) + "" + count;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
