package com.infoshareacademy;

public class Woman extends Person{

    public Woman(Id<Integer> id, String name, String lastName, Address address) {
        super(id, name, lastName, "woman", address);
    }
}
