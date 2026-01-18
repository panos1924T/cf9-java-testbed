package gr.aueb.cf.cf9.fromclass.unit3;

import java.util.Objects;

public class Point {

    private int x;

    public Point() {
    }

    public Point(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void movePlusOne() {
        x += 1;
    }

    @Override
    public String toString() {
        return "Point x coordinates: " + x;
    }

    @Override
    public boolean equals(Object o) {
        // 1. Αν είμαι εγώ ο ίδιος (ίδια μνήμη), προφανώς είμαστε ίσοι.
        if (this == o) return true;

        // 2. Αν το άλλο είναι null ή είναι άλλη κλάση (π.χ. Αυτοκίνητο), δεν είμαστε ίσοι.
        if (o == null || getClass() != o.getClass()) return false;

        // 3. Μετατροπή (Cast) του γενικού Object σε Point για να δούμε τα δεδομένα του.
        Point point = (Point) o;

        // 4. Η τελική σύγκριση: Είναι τα x μας ίδια;
        return x == point.x;
    }

    @Override
    public int hashCode() {
        // Παράγουμε έναν αριθμό ταυτότητας βασισμένο στο x.
        // Άρα αν δύο Points έχουν ίδιο x, θα βγάλουν και ίδιο hashCode.
        return Objects.hash(x);
    }
}
