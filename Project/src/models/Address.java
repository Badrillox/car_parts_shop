package models;

public class Address {

    // fields
    private String _postalCode;
    private String _street;
    private String _streetNr;
    private String _state;
    private String _city;

    // getter and setter

    public String getPostalCode() {
        return _postalCode;
    }

    public void setPostalCode(String postalCode) {
        this._postalCode = postalCode;
    }

    public String getStreet() {
        return _street;
    }

    public void setStreet(String street) {
        this._street = street;
    }

    public String getStreetNr() {
        return _streetNr;
    }

    public void setStreetNr(String streetNr) {
        this._streetNr = streetNr;
    }

    public String getState() {
        return _state;
    }

    public void setState(String state) {
        this._state = state;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        this._city = city;
    }

    // constructors

    public Address(){this("", "", "", "", "");}
    public Address(String postalCode, String city, String state, String street, String streetNr){
        this.setCity(city);
        this.setPostalCode(postalCode);
        this.setState(state);
        this.setStreet(street);
        this.setStreetNr(streetNr);

    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + this.getStreet() + '\'' +
                ", streetNr='" + this.getStreetNr() + '\'' +
                ", postalCode='" + this.getPostalCode() + '\'' +
                ", city='" + this.getCity() + '\'' +
                ", state='" + this.getState() + '\'' +
                '}';
    }
}
