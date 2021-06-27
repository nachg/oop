package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InterpreterTest {

    @Test
    void WHENStringContainsOneOperatorAndOneArgumentTHENErrorMessageShouldBeShown() throws Exception {
        assertThatThrownBy(() -> {
            new Interpreter("7+").toDouble();
        }).isInstanceOf(Exception.class)
                .hasMessageContaining("Ошибка");
    }

    @Test
    void simpleNumbers() throws Exception {
        assertThat(
                new Interpreter("7+3").toDouble()
        ).isEqualTo(10);
    }

    @Test
    void exprAndNumber() throws Exception {
        assertThat(
                new Interpreter("(5+3)*4").toDouble()
        ).isEqualTo(32);

        assertThat(
                new Interpreter("42/(3+4)").toDouble()
        ).isEqualTo(6);
    }


    @Test
    void twoExpressions() throws Exception {
        assertThat(
                new Interpreter("((7+3)+10)/(2+2)").toDouble()
        ).isEqualTo(5);
    }
}