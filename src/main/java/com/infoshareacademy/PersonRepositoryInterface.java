package com.infoshareacademy;

import java.util.List;

public interface PersonRepositoryInterface {
    void save(Person person);
    boolean remove(Id id);
    boolean update(Person person);
    Person findById(Id id);
    List<Person> findWomen();
    List<Person> findMen();
    List<Person> findByName(String name);
    List<Person> findByLastName(String lastName);

}
