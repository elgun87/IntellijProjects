package day_11;
import java.util.*;
public class Triangle {
    public static void main(String[] args){
        /*
        A triangle is valid if the sum of all the three angles is equal to 180 degrees.
        Write a program that declares three integers as angles and check whether the triangle is valid or not.
        Print "Valid triangle" or "Not a valid triangle".
         */
        Scanner input = new Scanner(System.in);
        System.out.println("You will need to enter three dimensions");
        System.out.println("Enter the first dimensions:");
        int dimension1 = input.nextInt();
        System.out.println("Enter the second dimensions:");
        int dimension2 = input.nextInt();
        System.out.println("Enter the third dimensions:");
        int dimension3 = input.nextInt();

        //this is given dimension
        int givenDimension = 180;
        //I am declaring int sum to get all dimensions value and compare it with given dimension
        int sumOfDimensions = dimension1 + dimension2 + dimension3;
        //below i am checking if the sum of user dimension is equal to given dimension
        if(sumOfDimensions == givenDimension){
            System.out.println("The triangle is valid");
        }else{
            System.out.println("The triangle is not valid");
        }

    }
}
