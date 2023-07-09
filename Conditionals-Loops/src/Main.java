public class Main {
    public static void main(String[] args) {
        /*
            syntax of if statement
         */
        int sal = 30000;
//        if(sal <= 10000){
//            System.out.println("your salary is less than 10k "+ sal);
//        }else {
//            sal = sal + 1000;
//            System.out.println("good work your salary is now increase by 1k:\t" + sal);
//
//        }
//        multiple if else
        if (sal > 10000){
            sal += 2000 ;
        } else if (sal > 20000) {
            sal += 3000;
        }else {
            sal += 1000;
        }

        System.out.println(sal);
    }
}