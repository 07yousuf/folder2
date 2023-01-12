package Knowledgeofjava;
import java.util.*;
public class Automatic_type_promotion_in_expressions {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

    //Automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); // 257 % 256 =1
        System.out.println(b);

        //another example
        byte A = 40;
        byte B = 50;
        byte C = 100;
        int D = (A*B)/C;
        System.out.println(D);

        //type casting for char
        int number = 'a';
        System.out.println(number);



        //java follow unicode
        System.out.println("بسم الله الرحمن الرحيم");

    }
}
