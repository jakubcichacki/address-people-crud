package com.infoshareacademy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddressRepository implements AddressRepositoryInterface {
    private Set<Address> addresses;

    public AddressRepository() {
        this.addresses = new HashSet<>();
    }

    @Override
    public void save(Address address) {
        if (address != null) {
            addresses.add(address);
        }
    }

    @Override
    public boolean remove(Id id) {
        for (Address address : addresses) {
            if (address.getId().getId().equals(id.getId())) {
                addresses.remove(address);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Address address) {
        Address addressToUpdate = findById(address.getId());
        if (addressToUpdate != null) {
            addressToUpdate = address;
            return true;
        }
        return false;
    }

    @Override
    public Address findById(Id id) {
        for (Address address : addresses) {
            if (address.getId().equals(id)) {
                return address;
            }
        }
        return null;
    }

    @Override
    public List<Address> findByCity(String city) {
        List<Address> addressesInCity = new ArrayList<>();
        for(Address address : addresses) {
            if(address.getCity().equals(city)) {
                addressesInCity.add(address);
            }
        }
        return addressesInCity;
    }

    @Override
    public List<Address> findByZIPCode(String zipCode) {
        List<Address> addressesWithZIPCode = new ArrayList<>();
        for(Address address : addresses) {
            if(address.getZipCode().equals(zipCode)) {
                addressesWithZIPCode.add(address);
            }
        }
        return addressesWithZIPCode;
    }

    @Override
    public List<Address> findByPartOfAddress(String partOfAddress) {
        List<Address> addressesWithThePart = new ArrayList<>();
        for (Address address : addresses) {
            if(address.toString().contains(partOfAddress)) {
                addressesWithThePart.add(address);
            }
        }
        return addressesWithThePart;
    }
}
