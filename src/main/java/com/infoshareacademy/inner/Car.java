package com.infoshareacademy.inner;

public class Car {

    private static final Integer numberOfWheels = 4;

    private Integer yearOfProduction;

    public Car(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public class Tir {

        private String manufacturer;

        public String getManufacturer() {
            return manufacturer;
        }

        public Tir(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public Integer getYearOfProduction() {
            return yearOfProduction;
        }
    }

    public static class MiniVan {
        //tutaj nie mamy dostępu do pól nad nami.


        public static Integer getNumberOfWheels() {
            //chyba, że są statyczne !
            return numberOfWheels;
        }
    }

}
