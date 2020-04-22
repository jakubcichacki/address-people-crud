package com.infoshareacademy;

import com.infoshareacademy.generic.MyPlaceholder;
import com.infoshareacademy.inner.Car;
import com.infoshareacademy.shapes.Shape;
import com.infoshareacademy.shapes.Triangle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {

    public static void main(String[] args) {

        MyPlaceholder<BigDecimal> myPlaceholder = new MyPlaceholder<>(BigDecimal.ZERO);

        myPlaceholder.get();


        Shape triangle = new Triangle(1,2,3,5);

        if(triangle instanceof Triangle) {
            Triangle t = (Triangle) triangle;
            t.calculateArea();
        }

        Car car = new Car(1993);

        Car.Tir tir = car.new Tir("Volvo"); //inicjalizacja klasy wewnętrznej.

        tir.getYearOfProduction(); //pobranie wartości klasy zewnętrznej z klasy wewnętrznej.





        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Triangle(212, 212, 33, 434));
        shapes.add(new Triangle(1, 2, 3, 4));
        shapes.add(new Triangle(2, 3, 5, 10));
        shapes.add(new Triangle(22, 22, 33, 44));

        System.out.println(shapes);

        Collections.sort(shapes);



        System.out.println("Posortowane shapes: " + shapes);




    }
}
