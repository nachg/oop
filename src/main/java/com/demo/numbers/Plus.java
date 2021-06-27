package com.demo.numbers;

import com.demo.numbers.base.BinaryOperation;
import com.demo.numbers.base.INumber;
import com.demo.numbers.base.Number;

public class Plus extends BinaryOperation {

    public Plus(INumber v1, INumber v2) {
        super(v1, v2);
    }

    public Plus(double v1, double v2) {
        super(v1, v2);
    }

    public Plus(int v1, int v2) {
        super(v1, v2);
    }

    public Plus(INumber v1, double v2) {
        super(v1, v2);
    }

    public Plus(double v1, INumber v2) {
        super(v1, v2);
    }

    @Override
    public Double toDouble() throws Exception {
        return value1.toDouble() + value2.toDouble();
    }
}
