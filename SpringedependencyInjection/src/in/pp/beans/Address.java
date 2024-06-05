package in.pp.beans;

public class Address {
    private String city;
    private String state;
    private String country;

    // Getters and setters for the above properties
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    @Override
    public String toString() {
        return city + ", " + state + ", " + country;
    }
}


