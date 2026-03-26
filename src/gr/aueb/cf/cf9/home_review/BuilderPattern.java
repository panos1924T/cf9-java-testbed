package gr.aueb.cf.cf9.home_review;

/**
 * try the real use of builder pattern before the @builder annotation in spring
 */
public class BuilderPattern {

    private final long id;
    private final String isbn;
    private final String name;
    private final String title;

    private BuilderPattern(Builder builder) {
        this.id = builder.id;
        this.isbn = builder.isbn;
        this.name = builder.name;
        this.title = builder.title;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public static class Builder {
        private final long id;
        private final String isbn;

        private String name;
        private String title;


        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

}
