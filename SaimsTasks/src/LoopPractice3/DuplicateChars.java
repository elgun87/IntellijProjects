package LoopPractice3;

public class DuplicateChars {
    public static void main(String[] args){
        String str = "AAABCCDEEF";
        String duplicate = "";
        int count = 0;

        for(int i = 0;i < str.length();i++){
            count = 0;
            for(int j = 0;j < str.length();j++){
                if(str.charAt(i) == str.charAt(j) && i != j){
                    if(!duplicate.contains(String.valueOf(str.charAt(i)))){
                        duplicate += str.charAt(i);
                    }
                }
            }
            //Below code is another way to do it
//            if(str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))){
//                if(!duplicate.contains(String.valueOf(str.charAt(i)))){
//                    duplicate += str.charAt(i);
//                }
//            }
        }
        System.out.println(duplicate);
    }
}
