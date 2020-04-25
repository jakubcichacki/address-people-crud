package com.infoshareacademy.shapes;

import java.util.Objects;

public class Triangle extends Shape {

    private Integer sideA;
    private Integer sideB;
    private Integer sideC;
    private Integer height;

    public Triangle(Integer sideA, Integer sideB, Integer sideC, Integer height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public Integer getSideA() {
        return sideA;
    }

    public void setSideA(Integer sideA) {
        this.sideA = sideA;
    }

    public Integer getSideB() {
        return sideB;
    }

    public void setSideB(Integer sideB) {
        this.sideB = sideB;
    }

    public Integer getSideC() {
        return sideC;
    }

    public void setSideC(Integer sideC) {
        this.sideC = sideC;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public Double calculateArea() {

        return (sideA * height) / 2.0;
    }

    @Override
    public Double calculateCircumference() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return sideA.equals(triangle.sideA) &&
                sideB.equals(triangle.sideB) &&
                sideC.equals(triangle.sideC) &&
                height.equals(triangle.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC, height);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", height=" + height +
                "}";
    }

    @Override
    public int compareTo(Shape o) {
        return this.calculateArea().compareTo(o.calculateArea()); //tak mogę ponieważ Double implementuje comparable.
    }
}


