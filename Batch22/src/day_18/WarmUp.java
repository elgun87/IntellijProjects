package day_18;

public class WarmUp {
    public static void main(String[] args) {
        String make = "";
        String model = "";
        int price = 0;

        if (make.equals("Mercedes") || make.equals("meredes")) {
            if (model.equals("e")) {
                price = 500;
            } else if (model.equals("a")) {
                price = 400;
            } else {
                System.out.println("Invaild model");
            }
        } else if (make.equals("Audi") || make.equals("audi")) {
            if (model.equals("Q5")) {
                price = 500;
            } else if (model.equals("A3")) {
                price = 400;
            } else {
                System.out.println("Invaild model");
            }
        } else {
            System.out.println("Wrong make of the car");
        }
    }
}




