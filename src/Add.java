import java.util.Scanner;


public class Add {
    public static void main(String[] args) {
        // int num1 = 56;
        // int num2 = 100;
        // int add = num1 + num2;
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Your added numbers are: " + sum);
    }
}
