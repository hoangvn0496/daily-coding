package com.learning.service.impl;

public class SubClass extends SuperClass {

    public static void honk() {                    // Vehicle method
        System.out.println("Tuut, SubClass!");
    }

    @Override
    public Integer produce(String input) {
        super.abc();
        return Integer.parseInt(input);
    }
}
