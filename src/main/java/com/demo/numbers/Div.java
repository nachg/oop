package com.demo.numbers;

import com.demo.numbers.base.BinaryOperation;
import com.demo.numbers.base.INumber;
import com.demo.numbers.base.Number;

public class Div extends BinaryOperation {

    public Div(INumber v1, INumber v2) {
        super(v1, v2);
    }

    public Div(double v1, double v2) {
        super(v1, v2);
    }

    public Div(int v1, int v2) {
        super(v1, v2);
    }

    public Div(INumber v1, double v2) {
        super(v1, v2);
    }

    public Div(double v1, INumber v2) {
        super(v1, v2);
    }

    @Override
    public Double toDouble() throws Exception{
        return 0.0;//value1.toDouble()/ value2.toDouble();
    }
}
