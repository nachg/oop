package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InterpreterTest {

    @Test
    void simpleNumbers() {
        assertThat(
                new Interpreter("7+3").toDouble()
        ).isEqualTo(10);
    }

    @Test
    void exprAndNumber() {
        assertThat(
                new Interpreter("(5+3)*4").toDouble()
        ).isEqualTo(32);

        assertThat(
                new Interpreter("42/(3+4)").toDouble()
        ).isEqualTo(6);
    }


    @Test
    void twoExpressions() {
        assertThat(
                new Interpreter("((7+3)+10)/(2+2)").toDouble()
        ).isEqualTo(5);
    }
}