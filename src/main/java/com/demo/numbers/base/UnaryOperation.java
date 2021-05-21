package com.demo.numbers.base;

public abstract class UnaryOperation implements INumber {
    protected INumber value;

    public UnaryOperation(INumber v) {
        this.value = v;
    }
}
