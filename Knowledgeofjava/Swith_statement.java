package Knowledgeofjava;
import java.util.Scanner;
public class Swith_statement {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String fruit = input.next();

        if(fruit.equals("mango")){
            System.out.println("king of fruit");
        }
        if(fruit.equals("apple")){
            System.out.println("A sweet fruit");
        }
    }
}
