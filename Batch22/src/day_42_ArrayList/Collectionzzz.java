package day_42_ArrayList;

import java.util.*;

public class Collectionzzz {
    public static void main(String[] args) {
//        String str = "Hello World";
//        List<Character> list = new ArrayList<>();
//        String result = "";
//        list.addAll(Arrays.asList('a', 'v', 'a', 'f','f'));
//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println(Collections.frequency(list, 'a'));
//        System.out.println(Collections.frequency(list, 'f'));
//        System.out.println(Collections.max(list));

        String name = "Cybertek";
        System.out.println(name);
        String [] chars = name.split("");
        List<String> list3 = Arrays.asList(chars);
        Collections.reverse(list3);
        System.out.println(list3 + " reversed");
        Collections.sort(list3);
        System.out.println(list3 + " sorted");
    }
}
