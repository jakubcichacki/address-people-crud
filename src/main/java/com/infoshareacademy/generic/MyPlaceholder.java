package com.infoshareacademy.generic;

public class MyPlaceholder<T> {

    private T t;


    public MyPlaceholder(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
