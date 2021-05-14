package Loops;

public class PrintNum {
    public static void main(String[] args) {
        int startNum = 80;
        int ednNum = 20;
        while (startNum >= ednNum){
            if(startNum % 2 == 0){
                System.out.print(startNum + " ");
            }
            startNum--;
        }
    }
}
