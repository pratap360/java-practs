import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
//        doing method overloading
//        fun(22,4,65,75,56,23);
//        multiple(2,9,"pratap parui" ,"ayush parui");
        demo(34,90,48);
        demo("pratap","ayush");
    }

    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }


    static void multiple(int a, int b, String...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
