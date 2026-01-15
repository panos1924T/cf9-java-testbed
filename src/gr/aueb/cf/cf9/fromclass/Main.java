package gr.aueb.cf.cf9.fromclass;

public class Main {

    public static void main(String[] args) {

        Student bob = new Student();

        bob.setId(1);
        bob.setFirstName("Bob");

        Student alice = new Student(2, "Alice", "Wonderland");

        System.out.println(bob.getId() + " " + bob.getFirstName());
        System.out.println(alice);
    }
}
