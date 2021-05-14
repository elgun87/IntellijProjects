package day_21;

import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String str = "1-48 of over 4,000 results for java book";
        str = str.replace(",","").replace("1-48 of over ","").replace(" results for java book","");

        System.out.println(str);
    }
}



