package com.demo.numbers.base;

public interface IString extends ITypes {
    @Override
    String evaluate() throws Exception;

    @Override
    String getName();

    @Override
    ITypes createNew(Object operand1, Object operand2);
}
