package day_20;

public class AdressCheck {
    public static void main(String[] args) {
        String adress = "";
        if(adress.isEmpty()){
            System.out.println("No address found");
        }else{
            adress = adress.toUpperCase();
            System.out.println(adress);
        }
    }
}
