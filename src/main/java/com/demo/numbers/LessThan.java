package com.demo.numbers;

import com.demo.numbers.base.CompareOperation;
import com.demo.numbers.base.INumber;

public class LessThan extends CompareOperation {


    public LessThan(INumber v1, INumber v2) {
        super(v1, v2);
    }

    public LessThan(double v1, double v2) {
        super(v1, v2);
    }

    public LessThan(int v1, int v2) {
        super(v1, v2);
    }

    public LessThan(INumber v1, double v2) {
        super(v1, v2);
    }

    public LessThan(double v1, INumber v2) {
        super(v1, v2);
    }

    @Override
    public boolean toBoolean() {
        if ((value1.toDouble() - value2.toDouble()) < 0) {
            return true;
        } else return false;
    }
}
