package com.demo.numbers;

import com.demo.numbers.base.BinaryOperation;
import com.demo.numbers.base.INumber;
import com.demo.numbers.base.IString;
import com.demo.numbers.base.Str;

public class Plus extends BinaryOperation {

    IString strValue1, strValue2;

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

    public Plus(IString v1, IString v2) {
        strValue1 = v1;
        strValue2 = v2;
    }

    public Plus(String v1, String v2) {
        this(new Str(v1), new Str(v2));
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
    public INumber createNew(Object p1, Object p2) {
        return new Plus(p1,p2);
    }

}
