package Numbers;

import java.util.*;

public class DontUseDevider {
    public static void main(String[] args) {
        int num = 21;
        int num2 = 7;
        int count = 0;
        double odd = 0;
        boolean isOdd = false;

        while (true) {
            if (num < 0) {
                break;
            }
            num -= num2;
            count++;
            if (num == 1) {
                odd = count;
                odd += 0.5;
                isOdd = true;
                break;
            }
            if (num == 0) {
                break;
            }
        }
        if (isOdd) {
            System.out.println(odd);
        } else {
            System.out.println(count);
        }
    }

}
