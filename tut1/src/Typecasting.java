import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        //type casting
//        int num = (int)(54.34f);
//        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a);
        //257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 109;
//        int d = a + b / c;
//
//        System.out.println(d);

//        int number = 'a';
        // uses ascii & unicode
//        System.out.println(number);


        byte b = 43;
        char c = 'a';
        short s = 1023;
        int i = 5000;
        float f = 5.543f;
        double d = 0.234;
        double result = (f*b) + (i/c) - (d*s) ;
//        float + int - double = double
        System.out.println((f*b) +" " + (i/c)  +" " + (d*i));
        System.out.println(result);

    }
}
