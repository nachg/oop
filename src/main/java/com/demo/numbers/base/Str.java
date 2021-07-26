package com.demo.numbers.base;

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
    public ITypes createNew(Object operand1, Object operand2) {
        return null;
    }

}
