package day_1;

//TODO: I still need to finish this one

public class methodReturnCub {
    public static void main(String[] args){
        returnCub(1,4,3);
//        int num = 2;
//        int count = 5;
//
//        while(count - 1 > 0){
//            num *= 2;
//            count --;
//            System.out.println(count);
//        }
//
//        System.out.print(num);

    }

    /**
     * I NEED TO FINISH THE CODE BELOW
     */
    public static void returnCub(int num1,int num2,int num3){
        int number = 3;
        for(int i = num1;i < num2;i++){
            int index = i;
            System.out.print(index);
            while ( number  > 0){
                index *= index;
                number --;
            }
            System.out.println();
            System.out.println(index + " index");

        }
    }
    public static int substraction(int a){
        return a * a;
    }
}
