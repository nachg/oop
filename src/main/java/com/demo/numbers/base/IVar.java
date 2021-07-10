package com.demo.numbers.base;

public interface IVar {
    void setValue(INumber value);
    String getName();
    INumber getValue() throws Exception;
}
