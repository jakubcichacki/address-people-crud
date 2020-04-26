package com.infoshareacademy;

public class Man extends Person{

    public Man(Id<Integer> id, String name, String lastName, Address address) {
        super(id, name, lastName, "man", address);
    }
}
