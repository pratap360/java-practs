import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a =   in.nextInt();
        int b =   in.nextInt();
        int c =   in.nextInt();

//        question -> find the max of the 3 given number
//    method 1
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);

//        method 2
//        int maxx = 0;
//        if (a>b) {
//            maxx = a;
//        }else {
//            maxx =b;
//        }
//        if (c > maxx){
//            maxx = c;
//        }
//        System.out.println(maxx);

//        mehtod 3

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
