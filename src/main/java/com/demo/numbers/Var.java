package com.demo.numbers;

import com.demo.numbers.base.IVar;
import com.demo.numbers.base.INumber;

public class Var implements IVar {
    private String name;
    private INumber value;

    public String getName() {
        return name;
    }

    public Var(String name) {
        this.name = name;
    }

    @Override
    public void setValue(INumber value) {
        this.value = value;
    }

    @Override
    public INumber getValue() throws Exception {
        return value;
    }
}
