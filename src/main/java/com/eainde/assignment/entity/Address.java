package com.eainde.assignment.entity;

public class Address {
    private String city;
    private String country;
    private String street;
    private String postcode;

    public Address(String street, String city, String postcode, String country){
        this.street=street;
        this.city=city;
        this.postcode=postcode;
        this.country=country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public boolean equals(Object o) {
        // TODO write a code implement this method
        return false;
    }

    @Override
    public int hashCode() {
        // TODO write a code implement this method
        return 0;
    }

    @Override
    public String toString(){
        // TODO write a code implement this method
        return null;
    }
}
