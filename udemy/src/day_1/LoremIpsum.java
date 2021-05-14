package day_1;
import java.util.Arrays;
public class LoremIpsum {
    public static void main(String[] args){
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        System.out.println(doesContain(str,1,"enim"));


    }
    public static boolean doesContain(String str,int num,String looking){
        String new_str[] = str.split("\\.");
        boolean checkIfHas = false;
        if(new_str[num].contains(looking)){
            checkIfHas = true;
        }

        return checkIfHas;
    }
}
