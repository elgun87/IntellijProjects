package day_22;

public class Initials {
    public static void main(String[] args) {
        String fullName = "james bond";
        int indexOfEmptySpace = fullName.indexOf(" ");
        char firstNameInitial = fullName.charAt(0);
        char lastNameInitial = fullName.charAt(indexOfEmptySpace+1);
        String initials = firstNameInitial + "" + lastNameInitial;
        System.out.println("Your initials are: " + initials.toUpperCase());

    }
}
