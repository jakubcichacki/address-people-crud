package com.infoshareacademy;

public abstract class Address {
    private Id<Integer> id;
    private String city;
    private String cityType;
    private String street;
    private String zipCode;

    public abstract String getCityType();

}
