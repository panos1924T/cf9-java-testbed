package gr.aueb.cf.cf9.home_review;


/**
 * This class is for testing Point.class about getting coordinates
 */
public class PointMain {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(1, 3, 5);

        p1.setX(10);
        p1.setY(20);
        p1.setZ(30);

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());
    }
}
