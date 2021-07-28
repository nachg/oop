package com.demo.numbers;

import com.demo.numbers.base.IString;
import com.demo.numbers.base.IVars;

public class StringVar implements IVars {
    private String name;
    private IString value;

    public StringVar(String name, IString value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public IString getValue() {
        return value;
    }

    @Override
    public String evaluate() throws Exception {
        return value.toString();
    }

    public String getName() {
        return name;
    }
}
