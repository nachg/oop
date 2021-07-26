package com.demo.numbers;

import com.demo.numbers.base.BinaryOperation;
import com.demo.numbers.base.INumber;

public class Mult extends BinaryOperation {

    public Mult(INumber v1, INumber v2) {
        super(v1, v2);
    }

    public Mult(Object v1, Object v2) {
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

    public Mult() {

    }


    @Override
    public String getName() {
        return "*";
    }

    @Override
    public Double evaluate() throws Exception {
        return value1.evaluate() * value2.evaluate();
    }

    @Override
    public INumber createNew(Object p1, Object p2) {
        return new Mult(p1,p2);
    }
}
