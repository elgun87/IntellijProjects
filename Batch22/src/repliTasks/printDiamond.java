package repliTasks;

public class printDiamond {
    public static void main(String[] args) {
        //Write your code here
        for(int i = 1;i <= 7;i ++){
            if(i == 1){
                printStar(7,4);
            }
            if(i == 2){
                printStar(7,3,5);
            }
            if(i == 3){
                printStar(7,2,6);
            }
            if(i == 4){
                printStar(7,1,7);
            }
            if(i == 5){
                printStar(7,2,6);
            }
            if(i == 6){
                printStar(7,3,5);
            }
            if(i == 7){
                printStar(7,4);
            }
            if(i < 7){
                System.out.println();
            }
        }


    }
    public static void printStar(int num,int num1){
        for(int i = 1;i <= num;i++){
            if(i == num1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
    }
    public static void printStar(int num,int num1,int num2){
        for(int i = 1;i <= num;i++){
            if(i == num1 || i == num2){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
    }
}
