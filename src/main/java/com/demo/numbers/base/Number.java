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
    public Double evaluate() {
        return value;
    }

    @Override
    public INumber createNew(Object operand1, Object operand2) {
        return null;
    }

}
