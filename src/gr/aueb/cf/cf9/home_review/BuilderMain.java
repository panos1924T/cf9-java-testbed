package gr.aueb.cf.cf9.home_review;

/**
 *  testing the builder pattern
 */
public class BuilderMain {

    public static void main(String[] args) {

        BuilderPattern instance1 = new BuilderPattern.Builder(1,"A27").build();
        BuilderPattern instance2 = new BuilderPattern.Builder(2,"B34")
                .name("PanTs")
                .title("Pricing")
                .build();
    }
}
