package com.demo.numbers.base;

public interface ITypes extends Evaluable {
    String getName();
    ITypes createNew(Object... operands);

}
