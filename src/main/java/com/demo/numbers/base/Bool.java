package com.demo.numbers.base;

public class Bool implements IBoolean {
    private boolean boolValue;

    public Bool(boolean v) {
        this.boolValue = v;
    }

    @Override
    public Boolean evaluate() {
        return boolValue;
    }


}
