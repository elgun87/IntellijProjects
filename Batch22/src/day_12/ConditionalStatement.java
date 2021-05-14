package day_12;

public class ConditionalStatement {
    public static void main(String[] args) {
        double account = 250.25;
        double itemPrice = 100.99;
        itemPrice += 153;
        boolean check = account >= itemPrice;

        System.out.println("can i afford ?" + " - " + check);
    }
}
