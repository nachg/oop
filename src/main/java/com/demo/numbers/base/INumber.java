package com.demo.numbers.base;

public interface INumber {
    String getName();
    Double toDouble() throws Exception;
    INumber createNew(INumber operand1, INumber operand2);
}
