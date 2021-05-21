package com.demo.numbers.base;

public class Number implements INumber {
    private Double value;

    public Number(Double v) {
        this.value = v;
    }

    @Override
    public Double toDouble() {
        return value;
    }
}
