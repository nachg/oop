package com.demo.numbers;

import com.demo.numbers.base.BinaryOperation;
import com.demo.numbers.base.INumber;

public class Minus extends BinaryOperation {

    public Minus(INumber v1, INumber v2) {
        super(v1, v2);
    }

    public Minus(Object v1, Object v2) {
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

    public Minus() {

    }

    @Override
    public String getName() {
        return "-";
    }

    @Override
    public Double evaluate() throws Exception {
        return value1.evaluate() - value2.evaluate();
    }

    @Override
    public INumber createNew(Object[] operands) {
        return new Minus(operands[0],operands[1]);
    }
}
