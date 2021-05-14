package day_16;

public class BuyingHouse {
    public static void main(String[] args) {
        String neighbourHood = "Hills";
        String gated = " ";
        String allowPets = " ";
        double rating;
        String price = " ";

        switch (neighbourHood){
            case "Hills":
                price = "89,000";
                rating = 4.0;
                gated = "no";
                allowPets = "yes";
                System.out.println("name - " + neighbourHood + "\n" + "avarage price - " + price + "\n" + "rating - " + rating
                + "\n" + "gated - " + gated + "\n" + "allow pets - " + allowPets);
                break;
            case "Oaks":
                price = "75,000";
                rating = 3.5;
                gated = "no";
                allowPets = "yes";
                System.out.println("name - " + neighbourHood + "\n" + "avarage price - " + price + "\n" + "rating - " + rating
                + "\n" + "gated - " + gated + "\n" + "allow pets - " + allowPets);
                break;
            case "Highland":
                price = "150,000";
                rating = 4.5;
                gated = "yes";
                allowPets = "no";
                System.out.println("name - " + neighbourHood + "\n" + "avarage price - " + price + "\n" + "rating - " + rating
                + "\n" + "gated - " + gated + "\n" + "allow pets - " + allowPets);
                break;
            case "Canyon":
                price = "201,000";
                rating = 4.8;
                gated = "yes";
                allowPets = "yes";
                System.out.println("name - " + neighbourHood + "\n" + "avarage price - " + price + "\n" + "rating - " + rating
                + "\n" + "gated - " + gated + "\n" + "allow pets - " + allowPets);
                break;
            default:
                System.out.println("Invalid entry");
        }

    }
}
