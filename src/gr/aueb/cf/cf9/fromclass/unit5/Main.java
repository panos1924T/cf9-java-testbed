package gr.aueb.cf.cf9.fromclass.unit5;

public class Main {

    public static void main(String[] args) {

        Book newBook = new Book.Builder()
                .title("title")
                .author("author")
                .isbn("AB123")
                .year("2000")
                .category("category")
                .publisher("publisher")
                .build();

        Book newerBook = new Book.Builder()
                .title("The better")
                .year("1998")
                .build();


//        System.out.println(newBook);
//        System.out.println(newerBook);

        runTheTask((s) -> System.out.println("Greeting: " + s));

        runTheTask(System.out::println);
    }

    public static void runTheTask(IFunctional functional) {
        functional.doIt("Hello");
    }
}
