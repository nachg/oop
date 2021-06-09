package com.demo.numbers;

import com.demo.numbers.base.*;

public class MoreThan extends CompareOperation {


    public MoreThan(INumber v1, INumber v2) {
        super(v1, v2);
    }

    public MoreThan(double v1, double v2) {
        super(v1, v2);
    }

    public MoreThan(int v1, int v2) {
        super(v1, v2);
    }

    public MoreThan(INumber v1, double v2) {
        super(v1, v2);
    }

    public MoreThan(double v1, INumber v2) {
        super(v1, v2);
    }

    @Override
    public boolean toBoolean() {
        if ((value1.toDouble() - value2.toDouble()) > 0) {
            return true;
        } else return false;
    }
}
