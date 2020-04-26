package com.infoshareacademy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonRepository implements PersonRepositoryInterface {
    private Set<Person> people;

    public PersonRepository() {
        this.people = new HashSet<>();
    }

    @Override
    public void save(Person person) {
        if (person != null) {
            people.add(person);
        }
    }

    @Override
    public boolean remove(Id id) {
        for (Person person : people) {
            if (person.getId().getId().equals(id.getId())) {
                people.remove(person);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "PersonRepository{" +
                "people=" + people +
                '}';
    }

    @Override
    public boolean update(Person person) {
        Person personToUpdate = findById(person.getId());
        if (personToUpdate != null) {
            personToUpdate.setName(person.getName());
            personToUpdate.setLastName(person.getLastName());
            personToUpdate.setAddress(person.getAddress());
            personToUpdate.setSex(person.getSex());
            return true;
        }
        return false;

    }

    @Override
    public Person findById(Id id) {
        for (Person person : people) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public List<Person> findWomen() {
        List<Person> allWomen = new ArrayList<>();
        for (Person el : people) {
            if (el.getSex().equals("woman")) {
                allWomen.add(el);
            }
            el.toString();
        }
        return allWomen;
    }

    @Override
    public List<Person> findMen() {
        List<Person> allMen = new ArrayList<>();
        for (Person el : people) {
            if (el.getSex().equals("man")) {
                allMen.add(el);
            }
        }
        return allMen;
    }

    @Override
    public List<Person> findByName(String name) {
        List<Person> allWithName = new ArrayList<>();
        for (Person el : people) {
            if (el.getName().equals(name)) {
                allWithName.add(el);
            }
        }
        return allWithName;
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        List<Person> allWithLastName = new ArrayList<>();
        for (Person el : people) {
            if (el.getLastName().equals(lastName)) {
                allWithLastName.add(el);
            }
        }
        return allWithLastName;
    }
}
