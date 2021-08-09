package com.demo.numbers.base;

public interface ITypes extends IEvaluable {
    String getName();
    ITypes createNew(Object... operands);

}
