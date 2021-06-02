package com.demo.numbers;

import com.demo.numbers.base.INumber;

public class Compare extends Minus{

    public Compare(INumber v1, INumber v2) {
        super(v1, v2);
    }

    public Compare(double v1, double v2) {
        super(v1, v2);
    }

    public Compare(int v1, int v2) {
        super(v1, v2);
    }

    public Compare(INumber v1, double v2) {
        super(v1, v2);
    }

    public Compare(double v1, INumber v2) {
        super(v1, v2);
    }

    public boolean lessThan() {
        Double v = super.toDouble();
        if (v<0) {
            return true;
        } else return false;
    }

    public boolean moreThan() {
        Double v = super.toDouble();
        if (v>0) {
            return true;
        } else return false;
    }

    public boolean equals() {
        Double v = super.toDouble();
        if (v==0) {
            return true;
        } else return false;
    }
}
