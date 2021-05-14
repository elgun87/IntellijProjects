package Collections;

import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        String str = "Spoon Wooden is fun";
        str = (str.contains("o")) ? str.replace("o", "[o]") : "[" + str + "]";
        System.out.println(str);
    }
}
