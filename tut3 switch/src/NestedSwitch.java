import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid = in.nextInt();
        String depart = in.next();

        switch (empid) {
            case 1 -> System.out.println("pratap parui");
            case 2 -> System.out.println("ayush parui");
            case 3 -> {
                switch (depart) {
                    case "it" -> System.out.println("depart it");
                    case "support" -> System.out.println("support depart");
                    default -> System.out.println("there is no such type of department here");
                }
            }
            default -> System.out.println("your are entering wrong employee details");
        }
    }
}
