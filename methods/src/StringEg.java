import java.util.Scanner;

public class StringEg {
    public static void main(String[] args) {
//        String messsage = greet();
//        System.out.println(messsage);
        Scanner in = new Scanner(System.in);
        System.out.println("hey enter yr name: ");
        String name = in.nextLine();
        String personal = Mygreet(name);
        System.out.println(personal);
    }

     static String Mygreet(String name) {
        String message = "hello " + name;
        return message;
    }


//    static String greet(){
//        String greeting = "hello programmers";
//        return greeting;
//    }

//    syantx
//return type name (arugements){
//        body
//        return statement
//    }
}
