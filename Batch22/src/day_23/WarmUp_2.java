package day_23;

public class WarmUp_2 {
    public static void main(String[] args) {
        String email = "craig_federighi@apple.com";
        String firstName = email.substring(0,email.indexOf("_"));
        String lastname = email.substring(email.indexOf("_"),email.indexOf("@"));
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        System.out.println(firstName);
    }
}
