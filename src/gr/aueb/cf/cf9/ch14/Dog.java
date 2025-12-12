package gr.aueb.cf.cf9.ch14;

public class Dog extends Animal{

    public Dog() {

    }

    @Override
    public void speak() {
        System.out.println("I am a dog");
    }

    @Override
    public String toString() {
        return "Dog name: " + getName() + "\n" + "Dog age: " + getAge();
    }
}
