package day_1;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args){
        System.out.println(anagram("march","charm"));
    }
    public static boolean anagram(String str,String str2){
        boolean checkIfAnagram = false;
        if(str.length() == str2.length()){
            char arr1 [] = str.toCharArray();
            char arr2 [] = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean checkLength = Arrays.equals(arr1, arr2);
            if(checkLength){
                checkIfAnagram = true;
            }else{
                checkIfAnagram = false;
            }
        }
        return checkIfAnagram;
    }
}
