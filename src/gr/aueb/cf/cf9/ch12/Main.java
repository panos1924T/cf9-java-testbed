package gr.aueb.cf.cf9.ch12;

public class Main {

    public static void main(String[] args) {

         PointXYZ pointXYZ = new PointXYZ(1, 2, 3);

         double distance1 = pointXYZ.getXYDistance();
         double distance2 = pointXYZ.getYZDistance();
         double distance3 = pointXYZ.getXZDistance();
         double distance4 = pointXYZ.getXYZDistance();

        System.out.println("The distance between X and Y = " + distance1);
        System.out.println("The distance between Y and Z = " + distance2);
        System.out.println("The distance between X and Z = " + distance3);
        System.out.println("The distance between X and Y and Z = " + distance4);

    }
}
