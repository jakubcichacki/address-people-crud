package com.infoshareacademy;

import java.util.List;
import java.util.Objects;

public abstract class Person {
    private Id <Integer> id;
    private String name;
    private String lastName;
    private String sex;
    private Address address;
    private Man father;
    private Woman mother;
    private List<Person> children;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id.equals(person.id) &&
                name.equals(person.name) &&
                lastName.equals(person.lastName) &&
                sex.equals(person.sex) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, sex, address);
    }

    @Override
    public String toString() {
        return "PERSON - " +
                "id: " + "'" + getId().toString() + "'" +
                ", name: '" + name + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", sex: '" + sex + '\'' +
                ", " + getAddress().toString();
    }
}
