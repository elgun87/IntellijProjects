package Arrays;

import java.util.*;

public class ZombieAttack2 {
    public static void main(String[] args) {
        int inhabitants[] = {10, 5, 0, 0, 4, 7, 6, 2};
        int day = 0;
        int sum = 0;
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        while (true) {
            for (int i = 1; i < inhabitants.length - 1; i++) {//loop will start from index and will end length-1 to avoid outOfBoundry
                sum = 0;//if sum all of the arr is zero loop will be ended so i need to declare sum to get all elements sum
                if (inhabitants[i] == 0) {
                    if (inhabitants[i - 1] > 0) {
                        inhabitants[i - 1] /= 2;
                    }
                    if (inhabitants[i + 1] > 0) {
                        inhabitants[i + 1] /= 2;
                        i++;
                    }
                }
                if (i == inhabitants.length - 2) {//if last element is zero devide the element before last element by 2
                    if (inhabitants[inhabitants.length - 1] == 0) {
                        inhabitants[inhabitants.length - 2] /= 2;
                    }
                }
            }
            day++;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            for (int each : inhabitants) {
                sum += each;
            }
            if (sum == 0) {//when sum  == 0 it means all element is zero so print the info then break the loop
                System.out.println("---- EXTINCT ----");
                break;
            }
        }
    }
}
