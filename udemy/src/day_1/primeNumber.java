package day_1;

public class primeNumber {
    public static void main(String[] args){
//       for(int i = 0;i < 8;i++){
//            for(int j = 0;j < 7-i;j++){
//                System.out.print(" ");
//            }
//            for(int n = 0;n < i;n++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = 0;i < 4;i++){
//            for(int j = 0;j < 3;j++){
//                System.out.print("=" + " ");
//            }
//            System.out.print("   ");
//            for(int n = 0;n < 3; n++){
//                System.out.print("=" + " ");
//            }
//            System.out.println();
//        }
//
//        int result = MathUtil.Addition(5,8);
//        System.out.print(result)

//       getEvenNum(20);
//       getPrimeNum(20);

        /*
        // Beloq code is getting prime number with function and Scanner inlcuded
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println(primeWithScanner(num));
         */

    }
    public static void getEvenNum(int num){

        for(int i = 0;i < num;i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void getPrimeNum(int num){
        for(int i = 0;i <= num;i++){
            int count = 0;
            if(i == 0){
                continue;
            }
            for(int j = 0;j <= i;j++){
                if(j == 0){
                    continue;
                }
                if(i % 1 == 0 && i % j == 0){
                    count ++;
                }
            }
            if(count == 2){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean primeWithScanner(int num){
        int count = 0;
        boolean check = false;
        for(int i = 1;i <= num;i++) {
            if(num % i == 0) {
                count++;
            }
        }
        if(count == 2) {
            check= true;
        }
        return check;
    }

}
