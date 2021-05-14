package day_1;

public class ifAnagramMyMethod {
    public static void main(String[] args){
        System.out.println(IsAnagram("march","charm"));
    }
    public static boolean IsAnagram(String str, String str2){

        boolean checkIfAnagram = false;

        if(str.length() == str2.length()){
            //I am using loop to see if the str2 has the same letter as str1.If yes return true so it is anagram
            for(int i = 0;i < str.length();i++){

                for(int j = 0;j < str2.length();j++){

                    if(str.charAt(i) == str2.charAt(j)){
                        checkIfAnagram = true;
                    }
                }
            }
        }else{
            checkIfAnagram = false;
        }

        return checkIfAnagram;
    }
}
