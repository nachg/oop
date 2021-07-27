package com.demo.numbers.base;

import com.demo.numbers.Add;

public class Str implements IString {
    private String strValue;

    public Str(String v) {
        this.strValue = v;
    }

    @Override
    public String evaluate() throws Exception {
        return strValue;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public IString createNew(Object[] operands) {
        return new Str((String) operands[0]);
    }

}
