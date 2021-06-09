package com.demo.numbers;

import com.demo.numbers.base.CompareOperation;
import com.demo.numbers.base.INumber;

public class AreEqual extends CompareOperation {


    public AreEqual(INumber v1, INumber v2) {
        super(v1, v2);
    }

    public AreEqual(double v1, double v2) {
        super(v1, v2);
    }

    public AreEqual(int v1, int v2) {
        super(v1, v2);
    }

    public AreEqual(INumber v1, double v2) {
        super(v1, v2);
    }

    public AreEqual(double v1, INumber v2) {
        super(v1, v2);
    }

    @Override
    public boolean toBoolean() {
        if ((value1.toDouble() - value2.toDouble()) == 0) {
            return true;
        } else return false;
    }
}
