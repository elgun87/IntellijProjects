package Arrays;

public class PrintPair {
    public static void main(String[] args) {
        String str [] = {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};
        for(int i = 0;i < str.length-1;i++){
            System.out.println(str[i] + ", " + str[i + 1]);
            i = i+1;
        }
    }
}
