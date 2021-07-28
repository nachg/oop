package com.demo.numbers.base;

public interface INumber extends ITypes {
    String getName();
    @Override
    Double evaluate() throws Exception;
    @Override
    INumber createNew(Object... operands);
}
