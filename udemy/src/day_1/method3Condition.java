package day_1;

public class method3Condition {
    public static void main(String[] args) {
        myMethtod(5,'d',true);
    }
    public static void myMethtod(int num,char a,boolean check){
        if(check){
            for(int i = 0;i < num;i++){
                System.out.println(a);
            }
        }else if(!check){
            for(int i = 0;i < num;i++){
                System.out.print(a + " ");
            }
        }
    }
}
