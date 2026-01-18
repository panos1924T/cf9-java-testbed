package gr.aueb.cf.cf9.fromclass.unit4;

public class Main {

    public static void main(String[] args) {
        ISpeakable obj1 = new Cat();
        ISpeakable obj2 = new Dog();

        obj1.speak();
        obj2.speak();

        GenericSpeakingSchool catSchool = new GenericSpeakingSchool(obj1);
        GenericSpeakingSchool dogSchool = new GenericSpeakingSchool(obj2);

        catSchool.learn();
        dogSchool.learn();

        Item a = new Book();
        Item b = new CD();

        deliver(a);
        deliver(b);
    }

    public static void deliver(Item item) {

        if (item instanceof Book) {
            System.out.println("Book delivered");
        } else if (item instanceof CD) {
            System.out.println("CD delivered");
        } else {
            System.out.println("Unknown object");
        }
    }
}
