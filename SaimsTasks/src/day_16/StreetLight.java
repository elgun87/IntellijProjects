package day_16;

public class StreetLight {
    public static void main(String[] args){
        String streetLine = "Green light";

        switch (streetLine){
            case "Green light":
                System.out.println("Go");
                break;
            case "Yellow light":
                System.out.println("Slow down");
                break;
            case "Red light":
                System.out.println("Stop");
                break;
            default:
                System.out.println("This light is not existing on Street Light");
        }
    }
}
