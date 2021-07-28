package com.demo.numbers;

import com.demo.numbers.base.IBoolean;
import com.demo.numbers.base.IVars;

public class BoolVar implements IVars {
    private String name;
    private IBoolean value;

    public BoolVar(String name, IBoolean value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public IBoolean getValue() {
        return value;
    }

    @Override
    public Boolean evaluate() throws Exception {
        return value.evaluate();
    }

    public String getName() {
        return name;
    }
}
