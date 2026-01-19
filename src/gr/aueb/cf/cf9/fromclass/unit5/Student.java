package gr.aueb.cf.cf9.fromclass.unit5;

public class Student {

    private String name;
    private City city;

    public Student() {}

    public Student(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student's name is: " + name;
    }

    public Student(Student other) {
        this.name = other.name;
        this.city = new City(other.getCity().getCityName());
    }
}
