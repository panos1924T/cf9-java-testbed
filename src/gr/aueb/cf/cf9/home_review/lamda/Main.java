package gr.aueb.cf.cf9.home_review.lamda;

public class Main {

    public static void main(String[] args) {

        doPrint(new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello Coding");
            }
        });

        doPrint(new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        });
    }

    public static void doPrint(IPrintable printable) {
        printable.print();
    }
}
