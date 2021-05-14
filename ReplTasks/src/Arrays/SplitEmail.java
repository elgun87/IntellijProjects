package Arrays;
import java.util.*;
public class SplitEmail {
    public static void main(String[] args){
        String email = "info@cybertekschool.com";
        String emailId = "";
        String emailDomain = "";
        if(email.indexOf("@") == email.lastIndexOf('@') && email.indexOf("@") > -1){
            String arr [] = email.split("@");
            emailId = arr[0];
            emailDomain = arr[1];
        }else{
            System.out.println("invalid email");
        }

        if(!emailId.isEmpty()){
            System.out.println("Email id: " + emailId + "\n" + "Email domain: " + emailDomain);
        }

    }
}
