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

    public Div() {

    }

    @Override
    public String getName() {
        return "/";
    }

    @Override
    public Double toDouble() throws Exception{
        return value1.toDouble()/ value2.toDouble();
    }

    public INumber createNew(INumber p1, INumber p2) {
        return new Div(p1,p2);
    }

}
