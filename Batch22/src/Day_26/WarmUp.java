package Day_26;

public class WarmUp {
    public static void main(String[] args) {
        int num  = 10;
        for(int i = 1;i <= num;i++){
            for (int j = 1;j <= num;j++){
                if(i < 10){
                    System.out.print("|" + j + " * " + i + " = " + i*j + "|" + "\t" + "\t" + "\t" + "\t");
                }
//                else{
//                    System.out.print("|");
//                    System.out.print(j + " * " + i + " = " + i*j + "\t" + "\t");
//
//                }
            }
            System.out.println(" ");
        }
    }
}
