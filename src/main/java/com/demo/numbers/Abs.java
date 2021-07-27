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
    public String getName() {
        return "Abs";
    }

    @Override
    public Double evaluate() throws Exception {
        Double v = value.evaluate();
        if (v < 0) {
            v = v * -1;
        }
        return v;
    }

    @Override
    public INumber createNew(Object[] operands) {
        return new Abs((INumber) operands[0]);
    }

}
