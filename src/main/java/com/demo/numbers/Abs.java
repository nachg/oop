package com.demo.numbers;

import com.demo.numbers.base.INumber;
import com.demo.numbers.base.Number;
import com.demo.numbers.base.UnaryOperation;

public class Abs extends UnaryOperation {

    public Abs(INumber v1) {
        super(v1);
    }

    public Abs(double v) {
        this(
                new Number(v)
        );
    }

    public Abs(int v) {
        this(
                (double) v
        );
    }

    @Override
    public Double toDouble() {
        Double v = value.toDouble();
        if(v < 0) {
            v = v * -1;
        }
        return v;
    }
}
