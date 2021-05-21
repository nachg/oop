package com.demo.numbers;

import com.demo.numbers.base.BinaryOperation;
import com.demo.numbers.base.INumber;
import com.demo.numbers.base.Number;

public class Minus extends BinaryOperation {
    /**
     * Primary Constructor
     * @param v1
     * @param v2
     */
    public Minus(INumber v1, INumber v2) {
        super(v1, v2);
    }


    /**
     * Secondary Constuctors
     * @param v1
     * @param v2
     */
    public Minus(double v1, double v2) {
        this(
                new Number(v1),
                new Number(v2)
        );
    }

    public Minus(int v1, int v2) {
        this(
                ((double) v1),
                ((double) v2)
        );
    }

    public Minus(INumber v1, double v2) {
        this(v1, new Number(v2));
    }

    public Minus(double v1, INumber v2) {
        this(new Number(v1), v2);
    }

    @Override
    public Double toDouble() {
        return value1.toDouble() - value2.toDouble();
    }
}
