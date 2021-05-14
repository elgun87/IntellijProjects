package day_1;
import java.util.*;
public class LoginMethod {
    public static void main(String[] args){
        System.out.println("You have clicked to login button!");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter account name: ");
        String loginName = input.next();
        System.out.println("Please enter password: ");
        int password = input.nextInt();
        System.out.println(login(loginName,password));

    }

    public static String login(String givenId,int givenpassword){
        String expectedId = "johnJava";
        int expectedPassword = 123456;
        String message = "";
        if(givenId.equals(expectedId) && givenpassword == expectedPassword){
            message = "Login Successfull!.";
        }else{
            message = "Either you password or your account is not correct!";
        }
        return message;
    }

}
