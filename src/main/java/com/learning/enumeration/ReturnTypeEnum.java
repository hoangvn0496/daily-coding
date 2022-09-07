package com.learning.enumeration;

import java.util.Arrays;

public enum ReturnTypeEnum {

    ONEWAY("ONEWAY"),
    ROUND_TRIP("ROUND_TRIP");

    private final String value;

    ReturnTypeEnum(String value) {
        this.value = value;
    }

    public static ReturnTypeEnum get(String name) {
        return Arrays.stream(ReturnTypeEnum.values())
                .filter(z -> z.name().equals(name))
                .findFirst().orElse(null);
    }

    public String getValue() {
        return this.value;
    }

}
