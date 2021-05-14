package day_42_ArrayList;
import java.util.*;
public class UniqeFromList {
    public static void main(String[] args) {
       String str = "      Helllo       world   .  I    am   learning   java     !   ";
        getSpacesOf(str);
    }

    public static void getSpacesOf(String str){
        String str2 = "";
        String [] words = str.trim().split(" ");
        for(int i = 0;i < words.length;i++){
            if(!words[i].isEmpty()){
                if(words[i].equals(".")){
                    str2 += words[i];
                }else{
                    str2 += " " + words[i];
                }
            }
        }
        System.out.println(str2.trim());
    }
}
