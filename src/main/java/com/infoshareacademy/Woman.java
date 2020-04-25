package com.infoshareacademy;

public class Woman extends Person{

    public Woman(Id<Integer> id, String name, String lastName, String sex, Address address) {
        super(id, name, lastName, "women", address);
    }
}
