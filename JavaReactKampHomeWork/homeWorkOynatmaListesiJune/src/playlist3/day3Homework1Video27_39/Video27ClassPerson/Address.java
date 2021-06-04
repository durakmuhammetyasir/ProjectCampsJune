package playlist3.day3Homework1Video27_39.Video27ClassPerson;

public class Address {
    private String line1 = "Bagdat Cd. Feneryolu";
    private String city = "İstanbul Asya";
    private String state = "Turkey";
    private String zip = "34724";
    public Address() {
    }
    public Address(String line1, String city, String state, String zip) {
        this.line1 = line1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public String getLine1() {
        return line1;
    }
    public void setLine1(String line1) {
        this.line1 = line1;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    @Override
    public String toString() {
        return "[Line1:" + line1 + ", State:" + state +
                ", City:" + city + ", ZIP:" + zip + "]";
    }
}
