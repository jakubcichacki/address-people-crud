package com.infoshareacademy;

import java.util.List;

public interface AddressRepositoryInterface {
    void save(Address address);
    boolean remove(Id id);
    boolean update(Address address);
    Address findById(Id id);
    List<Address> findByCity(String city);
    List<Address> findByZIPCode(String zipCode);
    List<Address> findByPartOfAddress(String partOfAddress);
}
