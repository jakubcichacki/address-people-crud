package com.infoshareacademy;

public abstract class Person {
    private Id <Integer> id;
    private String name;
    private String lastName;
    private String sex;
    private Address address;

    public Person(Id<Integer> id, String name, String lastName, String sex, Address address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.address = address;
    }

    public Id<Integer> getId() {
        return id;
    }

    public void setId(Id<Integer> id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
