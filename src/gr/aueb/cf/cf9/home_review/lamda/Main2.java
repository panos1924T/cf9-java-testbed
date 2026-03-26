package gr.aueb.cf.cf9.home_review.lamda;


public class Main2 {

    public static void main(String[] args) {
//        doPrint(() -> System.out.println("Hello Coding"));
//
//        doPrint(() -> System.out.println("Hello World"));

        doPrint(() -> satHelloCoding());

        doPrint(() -> sayHelloWorld());
    }

    public static void doPrint(IPrintable printable) {
        printable.print();
    }

    public static void satHelloCoding() {
        System.out.println("Hello Coding");
    }

    public static void sayHelloWorld() {
        System.out.println("Hello World");
    }
}
