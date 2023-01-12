package Knowledgeofjava;
import java.util.*;
public class Inputs {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();

        String name = input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);

        double largeDecimalNumber = input.nextDouble();
        System.out.println(largeDecimalNumber);

        long largeInteger = input.nextLong();
        System.out.println(largeInteger);

        boolean check = true;
        System.out.println(true);
    }
}
