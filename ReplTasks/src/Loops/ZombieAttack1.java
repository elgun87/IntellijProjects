package Loops;
import java.util.*;
public class ZombieAttack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;
        String result = "";
        if (inhabitants == 0) {
            System.out.println("--- EXTINCT ---");
        } else {
            while (inhabitants != 0) {
                result = "Day " + day + " [" + inhabitants + "]";
                System.out.println(result);
                day++;
                inhabitants /= 2;
                if (inhabitants == 0) {
                    System.out.println("---- EXTINCT ----");
                }
            }
        }
    }
}
