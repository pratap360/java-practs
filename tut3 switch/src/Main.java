import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String fruits = in.next();
//        switch (fruits) {
//            case "mango" -> System.out.println("king of the fruits");
//            case "Apples" -> System.out.println("an apples a day keeps doctor away");
//            case "Grapes" -> System.out.println("small ball fruits");
//            case "Oranges" -> System.out.println("hey it's oranges ");
//            default -> System.out.println("hey please enter a vaild fruit name ");
//        }

        int days = in.nextInt();
//        switch (days) {
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//        }

        switch (days) {
            case 1, 2, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> System.out.println("weekends");
        }
    }
}