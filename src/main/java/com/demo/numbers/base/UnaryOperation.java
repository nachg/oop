package com.demo.numbers.base;

public abstract class UnaryOperation implements INumber {
    protected INumber value;
    protected String name;

    public UnaryOperation(INumber v) {
        this.value = v;
    }

}
