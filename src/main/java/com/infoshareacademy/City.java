package com.infoshareacademy;

public class City extends Address {

    public City(Id<Integer> id, String city, String street, String zipCode) {
        super(id, city, "city", street, zipCode);
    }
}
