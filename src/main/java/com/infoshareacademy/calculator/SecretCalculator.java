package com.infoshareacademy.calculator;

import java.math.BigDecimal;

public class SecretCalculator {

    private static Integer secretNumber = 10;

    public static Integer add(Integer a) {

        return secretNumber + a;
    }

    public static BigDecimal add(BigDecimal a) {
        return BigDecimal.valueOf(secretNumber).add(a);
    }
}
