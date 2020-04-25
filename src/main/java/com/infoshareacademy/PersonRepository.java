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
        return false;
    }

    @Override
    public Person findById(Id id) {
        return null;
    }

    @Override
    public List<Person> findWomen() {
        return null;
    }

    @Override
    public List<Person> findMen() {
        return null;
    }

    @Override
    public List<Person> findByName(String name) {
        return null;
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        return null;
    }
}
