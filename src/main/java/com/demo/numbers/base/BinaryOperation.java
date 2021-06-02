package com.demo.numbers.base;

public abstract class BinaryOperation implements INumber {
    protected INumber value1, value2;

    public BinaryOperation(INumber v1, INumber v2) {
        this.value1 = v1;
        this.value2 = v2;
    }

    public BinaryOperation(double v1, double v2) {
        this(new Number(v1), new Number(v2));
    }

    public BinaryOperation(int v1, int v2) {
        this((double) v1,(double) v2);
    }

    public BinaryOperation(INumber v1, double v2) {
        this(v1, new Number(v2));
    }

    public BinaryOperation(double v1, INumber v2) {
        this(new Number(v1), v2);
    }

}
