package LoopPractice3;

public class ReverseOnlySecondWord {
    public static void main(String[] args){
        String str = "I love java is very fun";
        int numForReverse = 5;//Enter a number here which word you want to reverse
        int count = 0;
        int index1 = 0;
        int index2 = 0;
        boolean check = false;
        String reverse = "";

        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == ' '){
                count++;
            }
            if(str.charAt(i) == ' ' && count == numForReverse - 1){
                index1 = i;
            }else if(str.charAt(i) == ' ' && count == numForReverse){
                index2 = i;
                check = true;
            }
            if(check){
                String word = str.substring(index1,index2).trim();
                for(int j = word.length()-1;j >= 0;j--){
                    reverse += word.charAt(j);
                }
                break;
            }
        }

        str = str.substring(0,index1) + " " + reverse + str.substring(index2);
        System.out.println(str);
    }
}
