package com.demo.numbers.base;

public abstract class BinaryOperation implements INumber {
    protected INumber value1, value2;

    public BinaryOperation(INumber v1, INumber v2) {
        this.value1 = v1;
        this.value2 = v2;
    }
}
