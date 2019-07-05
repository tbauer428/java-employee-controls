package io.qdivision.qtp.java.model;

public class Address {

    private String addressType;
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String state;
    private int zip;


    public Address(String addressType,String streetAddress1,String streetAddress2,String city,String state,int zip) {
        this.addressType=addressType;
        this.streetAddress1=streetAddress1;
        this.streetAddress2=streetAddress2;
        this.city=city;
        this.state=state;
        this.zip=zip;
    }


    public String getAddressType() {
        return addressType;
    }
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }
    public String getStreetAddress1() {
        return streetAddress1;
    }
    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }
    public String getStreetAddress2() {
        return streetAddress2;
    }
    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
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
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }


    @Override
    public String toString() {
        return "Address [addressType=" + addressType + ", streetAddress1=" + streetAddress1 + ", streetAddress2="
                + streetAddress2 + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
    }


}
