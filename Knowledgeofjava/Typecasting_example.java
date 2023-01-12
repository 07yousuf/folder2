package Knowledgeofjava;

public class Typecasting_example {
    public static void main(String args[]){
        byte b = 7;
        char c = 'c';
        short s = 2342;
        int i = 50894;
        float f = 5.67f;
        double d = 5789.98124;

        double result = (f*b) + (i/c) - (d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-c));
        System.out.println(result);
    }
}
