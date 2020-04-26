package com.infoshareacademy;

public class Village extends Address{

    public Village(Id<Integer> id, String city, String street, String zipCode) {
        super(id, city, "village", street, zipCode);
    }
}
