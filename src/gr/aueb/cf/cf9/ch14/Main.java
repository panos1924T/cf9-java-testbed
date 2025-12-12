package gr.aueb.cf.cf9.ch14;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.setName("Rex");
        cat.setName("Kitty");
        dog.setAge(5);
        cat.setAge(7);

        doSpeak(dog);
        doSpeak(cat);

        doPrint(dog);
        doPrint(cat);
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }

    public static void doPrint(Animal animal) {
        System.out.println(animal.toString());
    }
}
