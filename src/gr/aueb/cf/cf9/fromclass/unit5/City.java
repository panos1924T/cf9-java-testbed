package gr.aueb.cf.cf9.fromclass.unit5;

public class City {

    private String cityName;

    public City() {}

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City name is: " + cityName;
    }
}
