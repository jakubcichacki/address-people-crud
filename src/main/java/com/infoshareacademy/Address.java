package com.infoshareacademy;

import java.util.Objects;

public abstract class Address {
    private Id<Integer> id;
    private String city;
    private String cityType;
    private String street;
    private String zipCode;

    public Address(Id<Integer> id, String city, String cityType, String street, String zipCode) {
        this.id = id;
        this.city = city;
        this.cityType = cityType;
        this.street = street;
        this.zipCode = zipCode;
    }

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

    @Override
    public String toString() {
        return  "address: " +
                "id='" + id.toString() + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) &&
                Objects.equals(city, address.city) &&
                Objects.equals(cityType, address.cityType) &&
                Objects.equals(street, address.street) &&
                Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, cityType, street, zipCode);
    }
}
