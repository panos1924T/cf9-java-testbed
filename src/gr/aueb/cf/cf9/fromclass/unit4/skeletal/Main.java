package gr.aueb.cf.cf9.fromclass.unit4.skeletal;

public class Main {

    public static void main(String[] args) {

        Square mySquare = new Square(20.0);

        System.out.println("Εμβαδόν: " + mySquare.getArea());

        System.out.println("Περίμετρος: " + mySquare.getPerimeter());

        System.out.println("Είναι τετράγωνο; " + mySquare.isSquare());
    }
}
