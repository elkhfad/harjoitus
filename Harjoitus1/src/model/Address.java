package model;

public class Address {
    private String street;
    private String postalCode;
    private String city;

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return this.street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Osoite [\nKatu = " + this.street + ", \npostinumero = " + this.postalCode + ", \nKaupunki = "
                + this.city + "]";
    }
}
