package com.demo.numbers;

import com.demo.numbers.base.BinaryOperation;
import com.demo.numbers.base.INumber;

public class Plus extends BinaryOperation {

    public Plus(INumber v1, INumber v2) {
        super(v1, v2);
    }

    public Plus(Object v1, Object v2) {
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

    public Plus() {
        super();
    }

    @Override
    public String getName() {
        return "+";
    }

    @Override
    public Double evaluate() throws Exception {
        return value1.evaluate() + value2.evaluate();
    }

    @Override
    public INumber createNew(Object[] operands) {
        return new Plus(operands[0],operands[1]);
    }

}
