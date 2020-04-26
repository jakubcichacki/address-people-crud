package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Id<Integer>> listId = new ArrayList<>();

        AddressRepository addressRepository = new AddressRepository();
        PersonRepository personRepository = new PersonRepository();

        for (int i = 0; i < 10; i++) {
            Id<Integer> numberId = new Id<>(i);
            listId.add(numberId);
        }

        Address address1 = new City(listId.get(0), "Gdańsk", "Grunwaldzka 10", "80-360");
        Address address2 = new City(listId.get(1), "Gdynia", "Świętokrzyska 50", "81-510");
        Address address3 = new Village(listId.get(2), "Kolbudy", "Sezamowa 3", "86-513");
        Address address4 = new Village(listId.get(3), "Kowale", "Gdańska 40", "88-210");


        Person man1 = new Man(listId.get(4), "Jan", "Kowalski", address1);
        Person man2 = new Man(listId.get(5), "Krzysztof", "Kowal", address2);
        Person woman1 = new Woman(listId.get(6), "Joanna", "Nowak", address2);
        Person woman2 = new Woman(listId.get(7), "Aleksandra", "Kowalska", address2);

        addressRepository.save(address1);
        addressRepository.save(address2);
        addressRepository.save(address3);
        addressRepository.save(address4);

        personRepository.save(man1);
        personRepository.save(man2);
        personRepository.save(woman1);
        personRepository.save(woman2);

        personRepository.remove(listId.get(4));
        System.out.println("REMOVE function\n" + personRepository.findById(listId.get(4)));
        personRepository.save(man1);
        System.out.println("\nSAVE - FIND BY ID - UPDATE functions\n" + personRepository.findById(listId.get(4)));
        personRepository.update(new Man(listId.get(4), "Jakub", "Kowalski", address4));
        System.out.println("UPDATE " + personRepository.findById(listId.get(4)).toString() + "\n");

        System.out.println("FIND MEN function");
        for (Person person : personRepository.findMen()) {
            System.out.println(person.toString());
        }

        System.out.println("\nFIND WOMEN function");
        for (Person person : personRepository.findWomen()) {
            System.out.println(person.toString());
        }

        System.out.println("\nFIND BY NAME function");
        for (Person person : personRepository.findByName("Joanna")) {
            System.out.println(person.toString());
        }

        System.out.println("\nFIND BY LASTNAME function");
        for (Person person : personRepository.findByLastName("Kowalski")) {
            System.out.println(person.toString());
        }

        System.out.println("\nFIND BY ADDRESS ID function");
        System.out.println(addressRepository.findById(listId.get(0)).toString());

        System.out.println("\nFIND BY CITY function");
        for (Address address :addressRepository.findByCity("Gdynia")) {
            System.out.println(address.toString());
        }

        System.out.println("\nFIND BY ZIP CODE function");
        for (Address address :addressRepository.findByZIPCode("88-210")) {
            System.out.println(address.toString());
        }

        System.out.println("\nFIND BY PART OF ADDRESS function");
        for (Address address :addressRepository.findByPartOfAddress("wal")) {
            System.out.println(address.toString());
        }



    }
}
