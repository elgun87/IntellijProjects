package day_24;

public class WarmUp {
    public static void main(String[] args) {
        int num = 0;
        int num1 = 0;
        int num2 = 0;
        while(num <= 5){
            num2 = 0;
            if(num == 0){
                while (num1 < 6){
                    System.out.print("#");
                    num1++;
                }
                int a = 0;
                while (a < 2){
                    System.out.print(" ");
                    a ++;
                }
                System.out.print("#");
                System.out.println();
            }else if(num == 2){
                int c  = 0;
                int a = 0;
                while (c <= 2){
                    System.out.print("#");
                    if(c == 2){
                        while(a < 6){
                            System.out.print(" ");
                            a++;
                        }
                        System.out.print("#");
                    }
                    c ++;
                }
                System.out.println();
            }else if(num == 4){
                num1 = 0;
                while (num1 < 6){
                    System.out.print("#");
                    num1++;
                }
                int a = 0;
                while (a < 2){
                    System.out.print(" ");
                    a ++;
                }
                int b = 0;
                while(b < 6){
                    System.out.print("#");
                    b++;
                }
            }else{
                System.out.print("#");
                while (num2 < 7){
                    System.out.print(" ");
                    num2++;
                }
                System.out.print("#");
                System.out.println();
            }
            num ++;
        }
    }
}
