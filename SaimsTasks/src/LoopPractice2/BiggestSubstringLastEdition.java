package LoopPractice2;

public class BiggestSubstringLastEdition {
    public static void main(String[] args) {
        String str = "abbbbcc";
        int count = 1;
        int max = 0;
        String addDuplicate = "";
        String copy = "";
        for(int i = 0;i < str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count ++;
                addDuplicate += str.charAt(i);
            }else{
                if(count > 1){
                    addDuplicate += str.charAt(i-1);
                }
                if(count > max){
                    max = count;
                    copy = addDuplicate;
                }
                addDuplicate = "";
                count = 1;
            }
            if(i+1 == str.length()-1){
                if(count > max){
                    addDuplicate = addDuplicate + str.charAt(i);
                    System.out.println(addDuplicate + " - the count of char is " + count);
                }else{
                    System.out.println(copy + " - the count of char is " + max);
                }
            }
        }
    }
}