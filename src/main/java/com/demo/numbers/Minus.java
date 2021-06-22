package com.demo.numbers;

import com.demo.numbers.base.BinaryOperation;
import com.demo.numbers.base.INumber;

public class Minus extends BinaryOperation {

    public Minus(INumber v1, INumber v2) {
        super(v1, v2);
    }

    public Minus(double v1, double v2) {
        super(v1, v2);
    }

    public Minus(int v1, int v2) {
        super(v1, v2);
    }

    public Minus(INumber v1, double v2) {
        super(v1, v2);
    }

    public Minus(double v1, INumber v2) {
        super(v1, v2);
    }

    @Override
    public Double toDouble() {
        return value1.toDouble() - value2.toDouble();
    }
}
