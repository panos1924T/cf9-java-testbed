package gr.aueb.cf.cf9.ch14;

public class Cat extends Animal{

    public Cat() {

    }

    @Override
    public void speak() {
        System.out.println("I am a cat");
    }

    @Override
    public String toString() {
        return "Cat name: " + getName() + "\n" + "Cat age: " + getAge();
    }
}
