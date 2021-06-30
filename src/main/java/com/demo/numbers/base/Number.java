package com.demo.numbers.base;

public class Number implements INumber {
    private Double value;

    public Number(Double v) {
        this.value = v;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Double toDouble() {
        return value;
    }

    @Override
    public INumber createNew(INumber operand1, INumber operand2) {
        return null;
    }
}
