package day_43_Class_Objects;
import java.util.*;
public class Car {
    String make;
    String model;
    String color;
    int year;

    public void drive(){
        System.out.println(make + " " + model + " " + color + " " + year + " is driveable");
    }
    public void drive(String make,String model,String color,int year){
        System.out.println(make + " " + model + " " + color + " " + year + " is driveable");
    }

    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(int i = 0;i < 2;i++){
            Car vehicle = new Car();
            System.out.println("Enter car " + (i+1) + " make");
            vehicle.make = scan.nextLine();
            System.out.println("Enter car " + (i+1) + " model");
            vehicle.model = scan.nextLine();
            System.out.println("Enter car " + (i+1) + " color");
            vehicle.color = scan.nextLine();
            list.add(vehicle);
        }

        list.forEach(each -> {
            System.out.println(each.make);
            System.out.println(each.model);
            System.out.println(each.color);
        });

    }
}




