import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        q : take input of 2 num and print the sum
        Scanner in = new Scanner(System.in);
//here below is my code
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int sum = a + b;
//        System.out.println("this is your sum of 2 numbers: " + sum);

        int num1,num2,sum;

        System.out.println("enter the 1st number: ");
        num1 = in.nextInt();
        System.out.println("enter the 2nd number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println(" the sum is: " + sum);



    }
}