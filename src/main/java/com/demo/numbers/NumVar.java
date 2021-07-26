package com.demo.numbers;

import com.demo.numbers.base.INumber;
import com.demo.numbers.base.IVars;

public class NumVar implements IVars {
    private String name;
    private INumber value;

    public NumVar(String name, INumber value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public INumber getValue() {
        return value;
    }

    @Override
    public Double evaluate() throws Exception {
        return value.evaluate();
    }

    public String getName() {
        return name;
    }
}
