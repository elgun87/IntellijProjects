package day_20;

public class CheckPassword {
    public static void main(String[] args) {
        String userName = "elgun87";
        String password = "elgun87345";
        int lenPassword = password.length();
        if(lenPassword >= 5){
            if(password.contains(userName)){
                System.out.println("Invalid password, username should not be in it");
                password = "password";
                System.out.println("Your default password is " + "\"" +password + "\"");
            }else{
                System.out.println("Valid password");
            }
        }else{
            System.out.println("Password cannot be less than 5 characters");
        }
    }
}
