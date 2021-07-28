package com.demo.numbers;

import com.demo.numbers.base.BinaryOperation;
import com.demo.numbers.base.INumber;
import com.demo.numbers.base.IString;
import com.demo.numbers.base.Str;

public class Add implements IString {

    IString strValue1, strValue2;

    public Add(IString v1, IString v2) {
        strValue1 = v1;
        strValue2 = v2;
    }

    public Add(Object v1, Object v2) {
        this((IString) v1, (IString) v2);
    }

    public Add(String v1, String v2) {
        this(new Str(v1), new Str(v2));
    }

    public Add() {
    }

    @Override
    public String getName() {
        return "add";
    }

    @Override
    public IString createNew(Object[] operands) {
        return new Add(operands[0],operands[1]);
    }

    @Override
    public String evaluate() throws Exception {
        return strValue1.evaluate() + strValue2.evaluate();
    }
}
