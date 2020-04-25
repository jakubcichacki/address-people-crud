package com.infoshareacademy;

public abstract class Address {
    private Id<Integer> id;
    private String city;
    private String cityType;
    private String street;
    private String zipCode;

    public Id<Integer> getId() {
        return id;
    }

    public void setId(Id<Integer> id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityType() {
        return cityType;
    }

    public void setCityType(String cityType) {
        this.cityType = cityType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
