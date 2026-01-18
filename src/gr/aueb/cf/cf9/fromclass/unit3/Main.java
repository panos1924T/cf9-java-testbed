package gr.aueb.cf.cf9.fromclass.unit3;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(10);
        Point point2D = new Point2D(10, 20);
        Point point3D = new Point3D(10, 20, 30);

        doMovePlus10(point);
        doMovePlus10(point2D);
        doMovePlus10(point3D);
    }

    public static void doMovePlus10(Point p) {
        for (int i = 0; i < 10; i++) {
            p.movePlusOne();
        }

        System.out.println(p.toString());
    }
}
