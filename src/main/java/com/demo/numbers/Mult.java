package com.demo.numbers;

import com.demo.numbers.base.BinaryOperation;
import com.demo.numbers.base.INumber;

public class Mult extends BinaryOperation {

    public Mult(INumber v1, INumber v2) {
        super(v1, v2);
    }

    public Mult(double v1, double v2) {
        super(v1, v2);
    }

    public Mult(int v1, int v2) {
        super(v1, v2);
    }

    public Mult(INumber v1, double v2) {
        super(v1, v2);
    }

    public Mult(double v1, INumber v2) {
        super(v1, v2);
    }


    @Override
    public Double toDouble() {
        return value1.toDouble() * value2.toDouble();
    }
}