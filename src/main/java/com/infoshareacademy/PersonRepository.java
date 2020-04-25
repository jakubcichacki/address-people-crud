package com.infoshareacademy;

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
    public boolean update(Person person) {
        Person personToUpdate = findById(person.getId());
        if (personToUpdate != null) {
            personToUpdate = person;
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
        List<Person> allWomen = null;
        for (Person el : people) {
            if (el.getSex().equals("woman")) {
                allWomen.add(el);
            }
        }
        return allWomen;
    }

    @Override
    public List<Person> findMen() {
        List<Person> allMen = null;
        for (Person el : people) {
            if (el.getSex().equals("man")) {
                allMen.add(el);
            }
        }
        return allMen;
    }

    @Override
    public List<Person> findByName(String name) {
        List<Person> allWithName = null;
        for (Person el : people) {
            if (el.getName().equals(name)) {
                allWithName.add(el);
            }
        }
        return allWithName;
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        List<Person> allWithLastName = null;
        for (Person el : people) {
            if (el.getName().equals(lastName)) {
                allWithLastName.add(el);
            }
        }
        return allWithLastName;
    }
}
