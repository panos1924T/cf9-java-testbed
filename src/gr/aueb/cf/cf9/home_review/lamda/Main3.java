package gr.aueb.cf.cf9.home_review.lamda;

public class Main3 {

    public static void main(String[] args) {

        doPrint(Main3::sayHelloCoding);
        doPrint(Main3::sayHelloWorld);
    }

    public static void doPrint(IPrintable printable) {
        printable.print();
    }

    public static void sayHelloCoding() {
        System.out.println("Hello Coding");
    }

    public static void sayHelloWorld() {
        System.out.println("Hello World");
    }
}
